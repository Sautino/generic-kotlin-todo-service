package com.marciisautii.kotlinspringdemo.controller

import com.marciisautii.kotlinspringdemo.model.ToDoEntity
import com.marciisautii.kotlinspringdemo.service.BasicService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/to-do")
class ToDoController {

    @Autowired
    private lateinit var basicService: BasicService<ToDoEntity, String>;

    @GetMapping
    fun findAllToDos(): MutableList<ToDoEntity> = this.basicService.findAll();

    @GetMapping("/{id}")
    fun findToDoById(@PathVariable id: String) = this.basicService.findById(id);

    @PostMapping
    fun saveToDo(@RequestBody toDo: ToDoEntity) = this.basicService.save(toDo);

    @DeleteMapping
    fun deleteToDo(@RequestBody toDo: ToDoEntity) = this.basicService.delete(toDo);

    @DeleteMapping("/{id}")
    fun deleteToDoById(@PathVariable id: String) =  this.basicService.deleteById(id);
}