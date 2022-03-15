data class State(val isRu: Boolean = false) {
    val dictionary: Dictionary = if (isRu) {
        RuDictionary
    } else {
        EnDictionary
    }
}