import org.jetbrains.compose.web.css.*

object Styles : StyleSheet() {
    val linkItem by style {
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        flex(1)
    }

    val links by style {
        display(DisplayStyle.Flex)
        margin(10.px, 0.px, 20.px, 0.px)
    }
}