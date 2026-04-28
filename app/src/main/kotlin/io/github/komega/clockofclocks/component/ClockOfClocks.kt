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

package io.github.komega.clockofclocks.component

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.komega.clockofclocks.model.Character
import io.github.komega.clockofclocks.model.Speed
import java.time.LocalTime
import kotlinx.coroutines.delay

@Composable
fun ClockOfClocks(modifier: Modifier = Modifier) {
    var time by remember {
        mutableStateOf(LocalTime.now())
    }
    LaunchedEffect(Unit) {
        while (true) {
            delay(1000L)
            time = LocalTime.now()
        }
    }
    Row(modifier = modifier) {
        Clocks(
            digit = time.hour / 10,
            speed = Speed.Slow,
            modifier = Modifier.weight(1f)
        )
        Clocks(
            digit = time.hour % 10,
            speed = Speed.Slow,
            modifier = Modifier.weight(1f)
        )
        Clocks(
            character = if (time.second % 2 == 0) Character.Colon else Character.Empty,
            speed = Speed.Fast,
            modifier = Modifier.weight(1f)
        )
        Clocks(
            digit = time.minute / 10,
            speed = Speed.Normal,
            modifier = Modifier.weight(1f)
        )
        Clocks(
            digit = time.minute % 10,
            speed = Speed.Normal,
            modifier = Modifier.weight(1f)
        )
        Clocks(
            character = if (time.second % 2 == 0) Character.Colon else Character.Empty,
            speed = Speed.Fast,
            modifier = Modifier.weight(1f)
        )
        Clocks(
            digit = time.second / 10,
            speed = Speed.Fast,
            modifier = Modifier.weight(1f)
        )
        Clocks(
            digit = time.second % 10,
            speed = Speed.Fast,
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ClockOfClocksPreview() {
    ClockOfClocks()
}
