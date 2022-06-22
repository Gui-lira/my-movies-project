package aplication.main.dataBase.model

import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document("movies")
data class Movie(
    val id: UUID,
    val title: String,
    val likes: Int,
    val watchedBy: List<UUID>,
    val wantedBy: List<UUID>,
    val whereToWatch: List<UUID>,
    val details: Map<String, Any>?,
)
