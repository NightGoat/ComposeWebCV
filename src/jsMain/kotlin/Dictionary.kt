interface Dictionary {
    val name: String
    val changeLanguage: String
    val avatar: String
    val googleDocLink: String
    val dateOfBirth: String
    val jobTitle: String
}

object RuDictionary : Dictionary {
    override val name: String = "Асадуллин Наиль"
    override val changeLanguage: String = "EN"
    override val avatar: String = "Мое фото"
    override val googleDocLink: String = "Резюме в google документах"
    override val dateOfBirth: String = "1991гр, Санкт-Петербург"
    override val jobTitle: String = "Mobile developer"
}

object EnDictionary : Dictionary {
    override val name: String = "Asadullin Nail"
    override val changeLanguage: String = "RU"
    override val avatar: String = "My photo"
    override val googleDocLink: String = "Link to Google doc"
    override val dateOfBirth: String = "1991, Russia"
    override val jobTitle: String = "Mobile developer"
}