import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

@Composable
fun DivWithStyle(
    style: String,
    content: ContentBuilder<HTMLDivElement>? = null
) {
    Div(
        attrs = {
            classes(style)
        },
        content = content
    )
}