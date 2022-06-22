package aplication.main.dataBase.model

import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import java.util.UUID

@Document("channels")
data class Channel(
    val id: UUID,
    val name: String,
    val url: String,
    val image: String,
    val movies: List<UUID>,
    val likes: List<UUID>,
    val dislikes: List<UUID>,
    val createdAt: Instant,
)
