package ru.geekbrains.kotlinproj.ui

import ru.geekbrains.kotlinproj.model.Note

class NoteViewState(note: Note? = null, error: Throwable? = null) : BaseViewState<Note?>(note, error) {
}