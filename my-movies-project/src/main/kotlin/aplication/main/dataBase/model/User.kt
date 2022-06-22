package aplication.main.dataBase.model

import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import java.util.UUID

@Document("users")
data class User(
    val id: UUID,
    val name: String,
    val secret: Secret,
    val email: String,
    val followers: List<UUID>,
    val following: List<UUID>,
    val watchedMovies: List<UUID>,
    val wantedMovies: List<UUID>,
    val createdAt: Instant
)
