package ru.geekbrains.kotlinproj.viewmodel

import androidx.lifecycle.ViewModel
import ru.geekbrains.kotlinproj.model.Note
import ru.geekbrains.kotlinproj.model.Repository


class NoteViewModel(private val repository: Repository = Repository) : ViewModel() {

    private var pendingNote: Note? = null

    fun saveChanges(note: Note) {
        pendingNote = note
    }

    override fun onCleared() {
        if (pendingNote != null) {
            repository.saveNote(pendingNote!!)
        }
    }
}
