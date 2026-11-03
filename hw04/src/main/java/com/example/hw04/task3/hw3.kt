package com.example.hw04.task3

fun String.wordCount(): Int{
    if (this.isBlank()) return 0
    return this.trim().split("\\s+".toRegex()).size
}
fun Int.toRupiahString(): String{
    val formatted = this.toString()
        .reversed()
        .chunked(3)
        .joinToString(".")
        .reversed()
    return "Rp $formatted"
}
fun List<Int>.clampedAverage(min: Int, max: Int): Double{
    val filter = this.filter { it in min..max }
    if (filter.isEmpty()) return 0.0
    return filter.average()
}
fun main(){
    val sentence1 = ""
    println("\"$sentence1\" -> ${sentence1.wordCount()} words")

    println(1000.toRupiahString())

    val numbers = listOf(10, 50, 200, 85, -5)
    val avg = numbers.clampedAverage(0, 100)
    println("listOf(10, 50, 200, 85, -5).clampedAverage(0, 100) = $avg")
}