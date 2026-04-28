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

import androidx.compose.runtime.Immutable

@Immutable
sealed class Character(val matrix: Array<Array<Clock>>) {
    object Zero : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(6, 15),
                Clock(9, 30),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(6, 0),
                Clock(0, 30),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(6, 0),
                Clock(0, 30),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(3, 0),
                Clock(0, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(3, 45),
                Clock(0, 45)
            )
        )
    )

    object One : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(7, 35),
                Clock(6, 15),
                Clock(9, 30),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(6, 0),
                Clock(0, 30),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(6, 0),
                Clock(0, 30),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(6, 0),
                Clock(0, 30),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(6, 0),
                Clock(0, 30),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(3, 0),
                Clock(0, 45),
                Clock(7, 35)
            )
        )
    )

    object Two : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(6, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(3, 30),
                Clock(3, 45),
                Clock(0, 45)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(12, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(3, 45),
                Clock(0, 45)
            )
        )
    )

    object Three : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(6, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(6, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(3, 45),
                Clock(0, 45)
            )
        )
    )

    object Four : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(6, 15),
                Clock(9, 30),
                Clock(6, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(0, 30),
                Clock(6, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(12, 15),
                Clock(9, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(6, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(6, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(3, 0),
                Clock(0, 45)
            )
        )
    )

    object Five : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(3, 30),
                Clock(3, 45),
                Clock(0, 45)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(0, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(6, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(3, 45),
                Clock(0, 45)
            )
        )
    )

    object Six : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(3, 30),
                Clock(3, 45),
                Clock(0, 45)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(0, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(6, 15),
                Clock(9, 30),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(3, 0),
                Clock(0, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(3, 45),
                Clock(0, 45)
            )
        )
    )

    object Seven : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(6, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(6, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(6, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(6, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(3, 0),
                Clock(0, 45)
            )
        )
    )

    object Eight : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(6, 15),
                Clock(9, 30),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(3, 0),
                Clock(0, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(6, 15),
                Clock(9, 30),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(3, 0),
                Clock(0, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(3, 45),
                Clock(0, 45)
            )
        )
    )

    object Nine : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 15),
                Clock(9, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(6, 15),
                Clock(9, 30),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 0),
                Clock(3, 0),
                Clock(0, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(6, 45),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(6, 15),
                Clock(9, 15),
                Clock(9, 0),
                Clock(0, 30)
            ),
            arrayOf(
                Clock(3, 0),
                Clock(3, 45),
                Clock(3, 45),
                Clock(0, 45)
            )
        )
    )

    object Colon : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(6, 15),
                Clock(9, 30),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(3, 0),
                Clock(0, 45),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(6, 15),
                Clock(9, 30),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(3, 0),
                Clock(0, 45),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35)
            )
        )
    )

    object Empty : Character(
        matrix = arrayOf(
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35)
            ),
            arrayOf(
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35),
                Clock(7, 35)
            )
        )
    )

    companion object {
        val digits = arrayOf(Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine)
    }
}
