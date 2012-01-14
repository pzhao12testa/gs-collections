/*
 * Copyright 2011 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.impl.set.mutable;

import java.util.HashSet;
import java.util.Set;

import com.gs.collections.api.collection.MutableCollection;
import com.gs.collections.impl.collection.mutable.UnmodifiableMutableCollectionTestCase;

public class SetAdapterAsUnmodifiableTest extends UnmodifiableMutableCollectionTestCase
{
    @Override
    protected MutableCollection<?> getCollection()
    {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        return SetAdapter.adapt(set).asUnmodifiable();
    }
}