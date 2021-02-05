package ru.geekbrains.kotlinproj.ui

import android.content.Context
import androidx.core.content.ContextCompat
import ru.geekbrains.kotlinproj.R
import ru.geekbrains.kotlinproj.model.Color
import java.text.SimpleDateFormat
import java.util.*

const val DATE_TIME_FORMAT = "dd.MM.yy HH:mm"

fun Date.format(): String = SimpleDateFormat(DATE_TIME_FORMAT, Locale.getDefault()).format(this)

//в классе создаем переменную val date : String = Date().format и сюда упадет дата в формате
//DATE_TIME_FORMAT = "dd.MM.yy HH:mm"

fun Color.getColorInt(context: Context): Int =
    ContextCompat.getColor(context, when (this) {
        Color.WHITE -> R.color.color_white
        Color.VIOLET -> R.color.color_violet
        Color.YELLOW -> R.color.color_yello
        Color.RED -> R.color.color_red
        Color.PINK -> R.color.color_pink
        Color.GREEN -> R.color.color_green
        Color.BLUE -> R.color.color_blue
    })
