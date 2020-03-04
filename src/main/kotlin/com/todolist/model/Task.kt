package com.todolist.model

import org.springframework.context.annotation.Primary
import javax.persistence.*

@Entity
class Task{
    @Id
    @GeneratedValue(generator = "seq_generator", strategy = GenerationType.SEQUENCE)
    var id: Int = 0
    var task:String?=null

    constructor()

    constructor(task: String) {
        this.task = task
    }
}
