/*
 * Copyright 2026 Khoa Omega
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.komega.clockofclocks.model

import kotlin.math.PI

object Math {
    private const val RADIANS_PER_HOUR = (2.0 * PI) / 12.0
    private const val RADIANS_PER_MINUTE = (2.0 * PI) / 60.0

    fun hourToRadians(hour: Int): Float {
        return (RADIANS_PER_HOUR * hour).toFloat()
    }

    fun minuteToRadians(minute: Int): Float {
        return (RADIANS_PER_MINUTE * minute).toFloat()
    }
}
