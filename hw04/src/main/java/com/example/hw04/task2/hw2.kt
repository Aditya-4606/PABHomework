package com.example.hw04.task2

enum class SubmissionStatus(val label: String){
    NOT_SUBMITTED("Not sumbitted yet"),
    SUBMITTED("Waiting for grading"),
    LATE("A late penalty may apply"),
    GRADED("Check your score in the portal")
}

fun printStatusInfo(status: SubmissionStatus){
    val message = when (status){
        SubmissionStatus.SUBMITTED -> println("Waiting for grading.")
        SubmissionStatus.LATE -> println("A late penalty may apply.")
        SubmissionStatus.GRADED -> println("Check your score in the portal.")
        else -> println("Please submit before the deadline.")
    }
    println("${status.name}: ${status.label} -> $message")
}

fun main(){
    for(status in SubmissionStatus.entries){
        printStatusInfo(status)
    }
}