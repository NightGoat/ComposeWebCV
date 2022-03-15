import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.StyleBuilder
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

@Composable
fun DivWithStyle(
    style: StyleBuilder.() -> Unit,
    content: ContentBuilder<HTMLDivElement>? = null
) {
    Div(
        attrs = {
            style {
                style()
            }
        },
        content = content
    )
}