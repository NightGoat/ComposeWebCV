import org.jetbrains.compose.web.css.*

object Styles {
    val linkItem: StyleBuilder.() -> Unit = {
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        flex(1)
    }

    val links: StyleBuilder.() -> Unit = {
        display(DisplayStyle.Flex)
        margin(10.px, 0.px, 20.px, 0.px)
    }
}