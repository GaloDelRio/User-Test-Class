package com.example.kotlin.usertest


import junit.framework.TestCase.assertTrue
import org.junit.Test

class UserTest {

    @Test
    fun testIsAdult() {
        val user = User("John", 25)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsTeenager() {
        val user = User("Jane", 15)
        assertTrue(user.isTeenager())
    }

    @Test
    fun testIsChild() {
        val user = User("Bob", 10)
        assertTrue(user.isChild())
    }
}