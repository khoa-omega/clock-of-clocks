package khoa.omega.clockofclocks.ui.main.component

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Canvas
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import khoa.omega.clockofclocks.ui.main.model.Clock
import khoa.omega.clockofclocks.ui.main.model.Speed
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun Clock(
    clock: Clock,
    speed: Speed,
    modifier: Modifier = Modifier,
) {
    val clockTransition = updateTransition(targetState = clock, label = "ClockTransition")

    val hourRadian by clockTransition.animateFloat(
        transitionSpec = { tween(speed.duration) },
        label = "HourRadianAnimation",
        targetValueByState = { it.hourRadian.toFloat() }
    )

    val minuteRadian by clockTransition.animateFloat(
        transitionSpec = { tween(speed.duration) },
        label = "MinuteRadianAnimation",
        targetValueByState = { it.minuteRadian.toFloat() }
    )

    val handColor = MaterialTheme.colorScheme.primary
    val handWidth = 2f * LocalDensity.current.density

    Canvas(modifier = modifier, onDraw = {
        drawLine(
            color = handColor,
            start = center,
            end = Offset(
                x = center.x * (1 + sin(hourRadian)),
                y = center.y * (1 - cos(hourRadian))
            ),
            strokeWidth = handWidth,
            cap = StrokeCap.Round
        )
        drawLine(
            color = handColor,
            start = center,
            end = Offset(
                x = center.x * (1 + sin(minuteRadian)),
                y = center.y * (1 - cos(minuteRadian))
            ),
            strokeWidth = handWidth,
            cap = StrokeCap.Round
        )
    })
}

@Preview(widthDp = 32, heightDp = 32)
@Composable
fun ClockPreview() {
    Clock(clock = Clock.TOP_RIGHT, speed = Speed.NORMAL)
}
