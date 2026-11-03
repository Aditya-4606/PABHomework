package com.example.hw04.task5

enum class LetterGrade {
    A, B, C, D, E
}

data class Student(
    val id: Int,
    val name: String,
    val score: Int
)

fun Student.letterGrade(): LetterGrade{
    return when {
        score >= 85 -> LetterGrade.A
        score >= 70 -> LetterGrade.B
        score >= 55 -> LetterGrade.C
        score >= 40 -> LetterGrade.D
        else -> LetterGrade.E
    }
}

fun main(){
    val students = mutableListOf(
        Student(100, "Adit", 30),
        Student(101, "Ali", 88),
        Student(102, "Budi", 65),
        Student(103, "Citra", 92),
    )
    students.add(Student(104, "Dewi", 71))
    students.removeAll { it.score < 40}

    for (i in students){
        val (id, name, score) = i
        println("%-3d - %-6s - %2d -> %s".format(id, name, score, i.letterGrade()))
    }
}