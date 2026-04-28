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

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import io.github.komega.clockofclocks.model.Clock
import io.github.komega.clockofclocks.model.Math
import io.github.komega.clockofclocks.model.Speed
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun Clock(
    clock: Clock,
    speed: Speed,
    modifier: Modifier = Modifier
) {
    val transition = updateTransition(
        targetState = clock,
        label = "ClockTransition"
    )
    val hRad by transition.animateFloat(
        transitionSpec = {
            tween(
                durationMillis = speed.duration,
                easing = LinearEasing
            )
        },
        label = "HourAnimation",
        targetValueByState = { clock -> Math.hourToRadians(clock.hour) }
    )
    val mRad by transition.animateFloat(
        transitionSpec = {
            tween(
                durationMillis = speed.duration,
                easing = LinearEasing
            )
        },
        label = "MinuteAnimation",
        targetValueByState = { clock -> Math.minuteToRadians(clock.minute) }
    )
    val hColor = MaterialTheme.colorScheme.primary
    val mColor = MaterialTheme.colorScheme.tertiary
    Spacer(
        modifier = modifier
            .aspectRatio(1f)
            .drawWithContent {
                val radius = size.minDimension * 0.5f
                val hWidth = radius * 0.64f
                val mWidth = radius * 0.88f
                val hThickness = radius * 0.132f
                val mThickness = radius * 0.096f
                drawLine(
                    color = hColor,
                    start = center,
                    end = Offset(
                        x = center.x + hWidth * sin(hRad),
                        y = center.y - hWidth * cos(hRad)
                    ),
                    strokeWidth = hThickness,
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = mColor,
                    start = center,
                    end = Offset(
                        x = center.x + mWidth * sin(mRad),
                        y = center.y - mWidth * cos(mRad)
                    ),
                    strokeWidth = mThickness,
                    cap = StrokeCap.Round
                )
            }
    )
}

@Preview(showBackground = true)
@Composable
fun ClockPreview() {
    Clock(
        clock = Clock(10, 10),
        speed = Speed.Normal
    )
}
