/**
 *  Copyright (c) 2015 The original author or authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */


package org.reveno.atp.api.query;

import it.unimi.dsi.fastutil.longs.LongCollection;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;

public interface MappingContext {

	<V> Optional<V> get(Class<V> viewType, long id);

	<V, U extends Collection<V>> U link(Stream<Long> ids, Class<V> viewType, Collector<V, ?, U> collector);

	<V, U extends Collection<V>> U link(LongCollection ids, Class<V> viewType);

}
