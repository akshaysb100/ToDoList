package com.todolist.service

import com.todolist.model.Task
import com.todolist.repository.ListRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ListService {
    @Autowired
    lateinit var listRepository: ListRepository

    fun addList(task: Task) {
        listRepository.save(task)
    }
}
