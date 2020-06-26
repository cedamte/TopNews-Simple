package com.example.topnewssimple.data.topheadlines


import com.squareup.moshi.Json


data class Article(
    @Json(name = "author")
    val author: String,
    @Json(name = "content")
    val content: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "publishedAt")
    val publishedAt: String,
    @Json(name = "source")
    val source: Source,
    @Json(name = "title")
    val title: String,
    @Json(name = "url")
    val url: String,
    @Json(name = "urlToImage")
    val urlToImage: String
) {
    companion object {
        val dummyArticle = listOf(
            Article(
                source = Source(
                    id = "",
                    name = "Seeking Alpha"
                ),
                author = "William Blair",
                title = "Disruption And Growth In Digital Payments",
                description = "With networks, on the other hand, we believe that many investors are overestimating the near- and medium-term disruption risk facing the global duopoly of Visa",
                url = "https://seekingalpha.com/article/4355811-disruption-and-growth-in-digital-payments",
                urlToImage = "https://static3.seekingalpha.com/assets/og_image_192-59bfd51c9fe6af025b2f9f96c807e46f8e2f06c5ae787b15bf1423e6c676d4db.png",
                publishedAt = "2020-06-26T11:29:05Z",
                content = "The digital payments industry offers access to a truly enormous addressable market across the world, and varying penetration across regions and countries creates opportunities for active managers. Bu… [+6137 chars]"
            ),
            Article(
                source = Source(
                    id = "",
                    name = "Seeking Alpha"
                ),
                author = "William Blair",
                title = "Disruption And Growth In Digital Payments",
                description = "With networks, on the other hand, we believe that many investors are overestimating the near- and medium-term disruption risk facing the global duopoly of Visa",
                url = "https://seekingalpha.com/article/4355811-disruption-and-growth-in-digital-payments",
                urlToImage = "https://static3.seekingalpha.com/assets/og_image_192-59bfd51c9fe6af025b2f9f96c807e46f8e2f06c5ae787b15bf1423e6c676d4db.png",
                publishedAt = "2020-06-26T11:29:05Z",
                content = "The digital payments industry offers access to a truly enormous addressable market across the world, and varying penetration across regions and countries creates opportunities for active managers. Bu… [+6137 chars]"
            ),
            Article(
                source = Source(
                    id = "",
                    name = "Seeking Alpha"
                ),
                author = "William Blair",
                title = "Disruption And Growth In Digital Payments",
                description = "With networks, on the other hand, we believe that many investors are overestimating the near- and medium-term disruption risk facing the global duopoly of Visa",
                url = "https://seekingalpha.com/article/4355811-disruption-and-growth-in-digital-payments",
                urlToImage = "https://static3.seekingalpha.com/assets/og_image_192-59bfd51c9fe6af025b2f9f96c807e46f8e2f06c5ae787b15bf1423e6c676d4db.png",
                publishedAt = "2020-06-26T11:29:05Z",
                content = "The digital payments industry offers access to a truly enormous addressable market across the world, and varying penetration across regions and countries creates opportunities for active managers. Bu… [+6137 chars]"
            ),
            Article(
                source = Source(
                    id = "",
                    name = "Seeking Alpha"
                ),
                author = "William Blair",
                title = "Disruption And Growth In Digital Payments",
                description = "With networks, on the other hand, we believe that many investors are overestimating the near- and medium-term disruption risk facing the global duopoly of Visa",
                url = "https://seekingalpha.com/article/4355811-disruption-and-growth-in-digital-payments",
                urlToImage = "https://static3.seekingalpha.com/assets/og_image_192-59bfd51c9fe6af025b2f9f96c807e46f8e2f06c5ae787b15bf1423e6c676d4db.png",
                publishedAt = "2020-06-26T11:29:05Z",
                content = "The digital payments industry offers access to a truly enormous addressable market across the world, and varying penetration across regions and countries creates opportunities for active managers. Bu… [+6137 chars]"
            ),
            Article(
                source = Source(
                    id = "",
                    name = "Seeking Alpha"
                ),
                author = "William Blair",
                title = "Disruption And Growth In Digital Payments",
                description = "With networks, on the other hand, we believe that many investors are overestimating the near- and medium-term disruption risk facing the global duopoly of Visa",
                url = "https://seekingalpha.com/article/4355811-disruption-and-growth-in-digital-payments",
                urlToImage = "https://static3.seekingalpha.com/assets/og_image_192-59bfd51c9fe6af025b2f9f96c807e46f8e2f06c5ae787b15bf1423e6c676d4db.png",
                publishedAt = "2020-06-26T11:29:05Z",
                content = "The digital payments industry offers access to a truly enormous addressable market across the world, and varying penetration across regions and countries creates opportunities for active managers. Bu… [+6137 chars]"
            ),
            Article(
                source = Source(
                    id = "",
                    name = "Seeking Alpha"
                ),
                author = "William Blair",
                title = "Disruption And Growth In Digital Payments",
                description = "With networks, on the other hand, we believe that many investors are overestimating the near- and medium-term disruption risk facing the global duopoly of Visa",
                url = "https://seekingalpha.com/article/4355811-disruption-and-growth-in-digital-payments",
                urlToImage = "https://static3.seekingalpha.com/assets/og_image_192-59bfd51c9fe6af025b2f9f96c807e46f8e2f06c5ae787b15bf1423e6c676d4db.png",
                publishedAt = "2020-06-26T11:29:05Z",
                content = "The digital payments industry offers access to a truly enormous addressable market across the world, and varying penetration across regions and countries creates opportunities for active managers. Bu… [+6137 chars]"
            )
        )

    }
}
