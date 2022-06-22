package aplication.main.dataBase.repositories

import aplication.main.dataBase.model.Channel
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.UUID

interface ChannelRepository : MongoRepository<Channel, UUID>
