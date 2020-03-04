package com.todolist.service

import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import org.junit.Before
import org.junit.Test

class ListServiceTest {

    @InjectMockKs
    lateinit var listService: ListService

    @Before
    fun setUp() {
    }

//    @Test
//    fun addList() {
//        every { listService.addList("task") } throws Exception("this is a test")
//        listService.addList("task")

}
