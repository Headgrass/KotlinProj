package ru.geekbrains.kotlinproj.ui

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.geekbrains.kotlinproj.R
import ru.geekbrains.kotlinproj.databinding.ItemNoteBinding
import ru.geekbrains.kotlinproj.model.Note

class MainAdapter : RecyclerView.Adapter<MainAdapter.NoteViewHolder>() {

    var notes: List<Note> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.NoteViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_note, parent, false)
        return MainAdapter.NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainAdapter.NoteViewHolder, position: Int) {
        holder.bind(notes[position])
    }

    override fun getItemCount(): Int = notes.size


    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        
        val ui: ItemNoteBinding = ItemNoteBinding.bind(itemView)

        fun bind(note: Note) {
            ui.title.text = note.title
            ui.body.text = note.note
            itemView.setBackgroundColor(note.color)
        }
    }
}