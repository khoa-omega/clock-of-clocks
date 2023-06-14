package khoa.omega.clockofclocks.ui.main.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import khoa.omega.clockofclocks.ui.main.model.Clock
import khoa.omega.clockofclocks.ui.main.model.Eight
import khoa.omega.clockofclocks.ui.main.model.Five
import khoa.omega.clockofclocks.ui.main.model.Four
import khoa.omega.clockofclocks.ui.main.model.Nine
import khoa.omega.clockofclocks.ui.main.model.One
import khoa.omega.clockofclocks.ui.main.model.Seven
import khoa.omega.clockofclocks.ui.main.model.Six
import khoa.omega.clockofclocks.ui.main.model.Speed
import khoa.omega.clockofclocks.ui.main.model.Three
import khoa.omega.clockofclocks.ui.main.model.Two
import khoa.omega.clockofclocks.ui.main.model.Zero

private const val WIDTH = 4
private const val HEIGHT = 6

private val Spacing = Arrangement.spacedBy(4.dp)
private val Digits = arrayOf(Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine)

@Composable
fun Clocks(
    digit: Int,
    speed: Speed,
    modifier: Modifier = Modifier
) {
    Clocks(Digits[digit], speed, modifier)
}

@Composable
fun Clocks(
    clocks: Array<Clock>,
    speed: Speed,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, verticalArrangement = Spacing) {
        for (row in 0 until HEIGHT) {
            Row(horizontalArrangement = Spacing) {
                for (col in 0 until WIDTH) {
                    Clock(
                        clock = clocks[row * WIDTH + col],
                        speed = speed,
                        modifier = Modifier
                            .weight(1f)
                            .aspectRatio(1f)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ClocksPreview() {
    Clocks(clocks = Nine, speed = Speed.NORMAL)
}
