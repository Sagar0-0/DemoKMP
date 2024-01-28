interface Platform {
    val contentList: List<String>
    val name: String
}

expect fun getPlatform(): Platform