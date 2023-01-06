/*
 * Copyright (c) 2011-2017 Pivotal Software Inc, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Queue {@link reactor.util.concurrent.QueueSupplier suppliers} and busy spin utils
 * {@link reactor.util.concurrent.WaitStrategy}.
 * Used for operational serialization (serializing threads) or buffering (asynchronous boundary).
 *
 * @author Stephane Maldini
 */
@NonNullApi
package reactor.util.concurrent;

import reactor.util.lang.NonNullApi;