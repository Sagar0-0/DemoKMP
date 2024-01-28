class ScreenData {
    private val platform = getPlatform()

    fun getTitle(): String {
        return platform.name
    }

    fun getContentList() : List<String> {
        return platform.contentList
    }
}