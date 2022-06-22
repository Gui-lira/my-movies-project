package aplication.main.dataBase.model

import java.time.Instant

data class Secret(
    val value: String,
    val salt: String,
    val updatedAt: Instant
)
