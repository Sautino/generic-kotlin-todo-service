package com.marciisautii.kotlinspringdemo.repository

import com.marciisautii.kotlinspringdemo.model.BaseModel
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BasicRepository<T : BaseModel, ID> : MongoRepository<T, ID> {
}