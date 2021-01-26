package ru.geekbrains.kotlinproj.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import ru.geekbrains.kotlinproj.databinding.ActivityMainBinding
import ru.geekbrains.kotlinproj.model.Note
import ru.geekbrains.kotlinproj.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var ui: ActivityMainBinding
    lateinit var viewModel: MainViewModel
    lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)

        setSupportActionBar(ui.toolbar)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        adapter = MainAdapter(object : OnItemClickListener {
            override fun onItemClick(note: Note) {
                openNoteScreen(note)
            }

        })
        ui.mainRecycler.adapter = adapter

        viewModel.viewState().observe(this, { state ->
            state?.let { adapter.notes = state.notes }
        })
    }

    private fun openNoteScreen(note: Note) {
        startActivity(NoteActivity.getStartIntent(this, note))
    }

}