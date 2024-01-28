class JVMPlatform: Platform {
    override val contentList: List<String>
        get() = listOf(
            "Desktop Card #1",
            "Desktop Card #2",
            "Desktop Card #3",
            "Desktop Card #4",
            "Desktop Card #5",
            "Desktop Card #6",
            "Desktop Card #7",
            "Desktop Card #8",
            "Desktop Card #9",
            "Desktop Card #10",
        )
    override val name: String
        get() = "Desktop is Ok :]"
}

actual fun getPlatform(): Platform = JVMPlatform()