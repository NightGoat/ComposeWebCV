import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import org.w3c.dom.HTMLDivElement

fun main() {
    renderComposable(rootElementId = "root") {
        var state by remember { mutableStateOf(State()) }
        HTMLMap({
            style {
                boxSizing("border-box")
                justifyContent(JustifyContent.Center)
            }
        }) {
            Tbody({
                style {
                    fontFamily("Inter", "sans-serif")
                    lineHeight(1.5.number)
                    background(Colors.Gray)
                    justifyContent(JustifyContent.Center)
                    color(Color(Colors.DarkGray))
                }
            }) {
                Div({
                    style {
                        maxWidth(960.px)
                        margin(40.px).apply {
                            auto
                        }
                        padding(32.px)
                        background(Colors.White)
                    }
                }) {
                    Section(
                        attrs = {
                            style {
                                justifyContent(JustifyContent.Center)
                            }
                        }
                    ) {
                        Avatar(state)
                        Div {
                            Div(
                                attrs = {
                                    AlignSelf("right")
                                    AlignContent("right")
                                    AlignItems("right")
                                }
                            ) {
                                Button(
                                    attrs = {
                                        AlignSelf("right")
                                        onClick { state = state.copy(isRu = state.isRu.not()) }
                                    }
                                ) {
                                    Text(state.dictionary.changeLanguage)
                                }
                            }
                            MyName(state)
                            MyJob(state)
                            dateOfBirth(state)
                            googleDocLink(state)
                            Links(state)
                        }
                    }
                }
            }
        }
    }

}

@Composable
private fun Links(state: State) {
    DivWithStyle(
        style = Styles.links,
    ) {
        link {

        }
    }
}

@Composable
private fun Avatar(state: State) {
    Div {
        Div {
            Img(
                src = "img/me.jpg",
                alt = state.dictionary.avatar,
                attrs = {
                    style {
                        width(130.px)
                        borderRadius(50.percent)
                    }
                }
            )
        }
    }
}

@Composable
private fun googleDocLink(state: State) {
    link {
        A(href = Links.googleDoc) {
            Text(state.dictionary.googleDocLink)
        }
    }
}

@Composable
private fun link(
    content: ContentBuilder<HTMLDivElement>? = null
) {
    DivWithStyle(Styles.linkItem, content)
}

@Composable
private fun dateOfBirth(state: State) {
    Div {
        Text(state.dictionary.dateOfBirth)
    }
}

@Composable
private fun MyJob(state: State) {
    Div({
        style {
            fontSize(24.px)
            color(Color.forestgreen)
            fontWeight("normal")
        }
    }) {
        Text(state.dictionary.jobTitle)
    }
}

@Composable
private fun MyName(state: State) {
    Div(attrs = {
        style {
            fontSize(48.px)
            lineHeight(1.number)
        }
    }) {
        Text(state.dictionary.name)
    }
}