package khoa.omega.clockofclocks.ui.main.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withAnnotation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import khoa.omega.clockofclocks.ui.main.component.Clocks
import khoa.omega.clockofclocks.ui.main.model.Separator
import khoa.omega.clockofclocks.ui.main.model.Speed
import khoa.omega.clockofclocks.ui.theme.ClockOfClocksTheme
import kotlinx.coroutines.delay
import java.time.LocalDateTime

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ClockOfClocksTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ClockOfClocks(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 24.dp, vertical = 16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ClockOfClocks(modifier: Modifier = Modifier) {
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        var now by remember { mutableStateOf(LocalDateTime.now()) }

        LaunchedEffect(Unit) {
            while (true) {
                delay(1000L)
                now = LocalDateTime.now()
            }
        }

        Row {
            Clocks(
                digit = now.hour / 10,
                speed = Speed.SLOW,
                modifier = Modifier.weight(1f)
            )
            Clocks(
                digit = now.hour % 10,
                speed = Speed.SLOW,
                modifier = Modifier.weight(1f)
            )
            Clocks(
                clocks = Separator,
                speed = Speed.FAST,
                modifier = Modifier.weight(1f)
            )
            Clocks(
                digit = now.minute / 10,
                speed = Speed.NORMAL,
                modifier = Modifier.weight(1f)
            )
            Clocks(
                digit = now.minute % 10,
                speed = Speed.NORMAL,
                modifier = Modifier.weight(1f)
            )
            Clocks(
                clocks = Separator,
                speed = Speed.FAST,
                modifier = Modifier.weight(1f)
            )
            Clocks(
                digit = now.second / 10,
                speed = Speed.FAST,
                modifier = Modifier.weight(1f)
            )
            Clocks(
                digit = now.second % 10,
                speed = Speed.FAST,
                modifier = Modifier.weight(1f)
            )
        }

        MoreDetails(modifier = Modifier.align(Alignment.BottomStart))
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
private fun MoreDetails(
    modifier: Modifier = Modifier,
    tag: String = "url",
    url: String = "https://github.com/khoa-omega/clock-of-clocks"
) {
    val annotatedString = buildAnnotatedString {
        append("Clock of Clocks\nSource available at: ")
        withAnnotation(
            tag = tag,
            annotation = url,
            block = {
                val style = SpanStyle(textDecoration = TextDecoration.Underline)
                withStyle(style = style, block = { append(url) })
            }
        )
    }
    val uriHandler = LocalUriHandler.current
    ClickableText(
        text = annotatedString,
        modifier = modifier,
        style = TextStyle.Default.copy(MaterialTheme.colorScheme.secondary),
        onClick = { offset ->
            annotatedString.getStringAnnotations(tag, offset, offset)
                .firstOrNull()?.let { uriHandler.openUri(it.item) }
        }
    )
}

@Preview
@Composable
fun ClockOfClocksPreview() {
    ClockOfClocks()
}
