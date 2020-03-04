package com.todolist.controller

import com.todolist.repository.ListRepository
import com.todolist.service.ListService
import io.mockk.*
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.junit.Test


class ListControllerTest {
    @InjectMockKs
    lateinit var listController: ListController

    @MockK
    lateinit var listService: ListService

    @MockK
    lateinit var listRepository: ListRepository

    @Before
    internal fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun givenATask_WhenWantToWrite_ShouldSaveIt() {

    }
}