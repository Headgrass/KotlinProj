package ru.geekbrains.kotlinproj.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.google.android.material.snackbar.Snackbar
import ru.geekbrains.kotlinproj.R
import ru.geekbrains.kotlinproj.model.Note
import ru.geekbrains.kotlinproj.viewmodel.MainViewModel
import java.lang.Error

abstract class BaseActivity<T, VS : BaseViewState<T>>: AppCompatActivity() {

    abstract val viewModel : BaseViewModel<T, VS>
    abstract val layoutRes: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes)

        viewModel.getViewState().observe(this, object : Observer<VS> {
            override fun onChanged(t: VS) {
                if (t == null) return
                if (t.data != null) renderData(t.data)
                if (t.error != null) renderError(t.error)
            }
        })
    }

    abstract fun renderData(data: T)

    protected fun renderError(error: Throwable) {
        if (error.message != null) showError(error.message!!)
    }

    protected fun showError(error: String) {
//        val snackbar = Snackbar.make(this, error, Snackbar.LENGTH_INDEFINITE)
//        snackbar.setAction(R.string.ok_btn_title, View.OnClickListener { snackbar.dismiss() })
//        snackbar.show()
    }
}
