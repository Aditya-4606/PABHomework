package com.example.hw04.task4

fun main(){
    val courses = mutableListOf(
        "SIF101", "SIF202", "SIF303", "SIF202"
    )
    val creditMap = mapOf(
        "SIF101" to 3,
        "SIF202" to 4,
        "SIF303" to 3
    )

    courses.add("SIF404");
    courses.add("SIF505");
    courses.remove("SIF202");
    println("$courses")

    val setCourses = courses.toSet();
    println("$setCourses");

    val credit1 = creditMap.getOrDefault("SIF101", 0)
    val credit2 = creditMap["SIF303"] ?:0;
    println("Credits for SIF101: $credit1");
    println("Credits for SIF303: $credit2");

    val totalCourses = courses.size;
    val totalCredits = courses.sumOf { creditMap.getOrDefault(it,0) };

    println("Total enrolled courses: $totalCourses");
    println("Total credit hours: $totalCredits");
}