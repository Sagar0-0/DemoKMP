class WasmPlatform: Platform {
    override val contentList: List<String>
        get() = listOf(
            "Web Card #1",
            "Web Card #2",
            "Web Card #3",
            "Web Card #4",
            "Web Card #5",
            "Web Card #6",
            "Web Card #7",
            "Web Card #8",
            "Web Card #9",
            "Web Card #10",
        )
    override val name: String
        get() = "Web is also Good :}"
}

actual fun getPlatform(): Platform = WasmPlatform()