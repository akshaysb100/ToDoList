package com.todolist.repository

import com.todolist.model.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ListRepository :JpaRepository<Task,Long> {

}
