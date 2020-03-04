package com.todolist.controller

import com.todolist.model.Task
import com.todolist.service.ListService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
@RestController
@RequestMapping("/list")
class ListController {

    @Autowired
    lateinit var listService: ListService

    @GetMapping("/hello")
    fun sayHello():String{
        return "Hello"
    }

    @PostMapping("/addTask")
    fun addList(@RequestBody task:Task) {
        listService.addList(task)
    }
}
