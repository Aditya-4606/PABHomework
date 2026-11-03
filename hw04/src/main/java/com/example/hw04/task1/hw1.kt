package com.example.hw04.task1

data class Book(
    val isbn: String,
    val title: String,
    val year: Int
)

fun main(){
    val book1 = Book("978-0134494166","Kotlin in Action", 2024)
    val book2 = Book("978-1119543046","Android Basics", 2023)

    println(book1)
    println(book2)

    val book3 = book1.copy(year = 2026)
    println(book3)

    println(book1==book2)
}