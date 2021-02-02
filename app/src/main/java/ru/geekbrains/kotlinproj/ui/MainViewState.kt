package ru.geekbrains.kotlinproj.ui

import ru.geekbrains.kotlinproj.model.Note

class MainViewState(
    val notes: List<Note>? = null,
    error: Throwable? = null
) : BaseViewState<List<Note>?>(notes, error)