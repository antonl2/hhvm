# Copyright (c) Meta Platforms, Inc. and affiliates.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.


from __future__ import annotations

import unittest

from apache.thrift.type.standard.thrift_types import StandardProtocol
from apache.thrift.type.type.thrift_types import Protocol

from thrift.python.any.any_registry import AnyRegistry

# @manual=//thrift/test/testset:testset-python-types
from thrift.test.testset import thrift_types

TEST_STRUCT = thrift_types.struct_map_string_i32(
    field_1={
        "Answer to the Ultimate Question of Life, the Universe, and Everything.": 42
    }
)


class AnyRegistryTest(unittest.TestCase):
    def test_register_type(self) -> None:
        registry = AnyRegistry()
        self.assertTrue(registry.register_type(thrift_types.struct_empty))
        self.assertFalse(registry.register_type(thrift_types.struct_empty))

    def test_register_module(self) -> None:
        registry = AnyRegistry()
        self.assertTrue(registry.register_module(thrift_types))
        self.assertFalse(registry.register_module(thrift_types))

    def test_struct_round_trip(self) -> None:
        registry = AnyRegistry()
        registry.register_module(thrift_types)

        for standard_protocol in [
            StandardProtocol.Binary,
            StandardProtocol.Compact,
            StandardProtocol.SimpleJson,
        ]:
            with self.subTest(standard_protocol=standard_protocol):
                any_obj = registry.store(
                    TEST_STRUCT, protocol=Protocol(standard=standard_protocol)
                )
                loaded = registry.load(any_obj)
                self.assertEqual(TEST_STRUCT, loaded)

    def test_unsupported_protocol(self) -> None:
        registry = AnyRegistry()
        registry.register_module(thrift_types)

        for protocol in [
            Protocol(standard=StandardProtocol.Json),
            Protocol(custom="my.custom.protocol"),
            Protocol(id=42),
        ]:
            with self.subTest(protocol=protocol):
                with self.assertRaises(NotImplementedError):
                    registry.store(TEST_STRUCT, protocol=protocol)
