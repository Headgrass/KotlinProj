package ru.geekbrains.kotlinproj.model

class Note(val title: String, val note: String, val color: Int) {

    companion object {
        val note: Companion = Note
    }

    val test: String

    init {
        test = "1"
    }
}