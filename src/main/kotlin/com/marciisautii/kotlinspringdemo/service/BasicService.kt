package com.marciisautii.kotlinspringdemo.service

import com.marciisautii.kotlinspringdemo.model.BaseModel
import com.marciisautii.kotlinspringdemo.model.ToDoEntity
import com.marciisautii.kotlinspringdemo.repository.BasicRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class BasicService<T : BaseModel, ID> {

    @Autowired
    private lateinit var basicRepository: BasicRepository<T, ID>;

    fun findAll(): MutableList<T> = this.basicRepository.findAll();

    fun findById(id: ID) = this.basicRepository.findById(id);

    fun save(dataObject: T) = this.basicRepository.save(dataObject);

    fun delete(dataObject: T) = this.basicRepository.delete(dataObject);

    fun deleteById(id: ID) = this.basicRepository.deleteById(id);
}