package aplication.main.dataBase.repositories

import aplication.main.dataBase.model.Movie
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.UUID

interface MovieRepository : MongoRepository<Movie, UUID>
