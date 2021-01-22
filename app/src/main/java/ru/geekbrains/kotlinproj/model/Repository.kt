package ru.geekbrains.kotlinproj.model

object Repository {

    private val notes: List<Note>

    init {
        notes = listOf(
            Note(
                "Моя первая заметка",
                "Kotlin очень краткий, но при этом выразительный язык",
                0xfff06292.toInt()
            ),
            Note(
                "Моя вторая заметка",
                "Kotlin очень краткий, но при этом выразительный язык",
                0xfff06292.toInt()
            ),
            Note(
                "Моя следующая заметка",
                "Kotlin очень краткий, но при этом выразительный язык",
                0xfff06292.toInt()
            ),
            Note(
                "Моя крайняя заметка",
                "Kotlin очень краткий, но при этом выразительный язык",
                0xfff06292.toInt())
            )
    }

    fun getNotes(): List<Note> = notes
}