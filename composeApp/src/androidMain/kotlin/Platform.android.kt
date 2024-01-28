class AndroidPlatform : Platform {
    override val contentList: List<String>
        get() = listOf(
            "Android Card #1",
            "Android Card #2",
            "Android Card #3",
            "Android Card #4",
            "Android Card #5",
            "Android Card #6",
            "Android Card #7",
            "Android Card #8",
            "Android Card #9",
            "Android Card #10",
        )
    override val name: String
        get() = "Android for the WIN!!"
}

actual fun getPlatform(): Platform = AndroidPlatform()