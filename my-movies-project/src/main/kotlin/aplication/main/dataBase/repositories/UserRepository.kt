package aplication.main.dataBase.repositories

import aplication.main.dataBase.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.UUID

interface UserRepository : MongoRepository<User, UUID>
