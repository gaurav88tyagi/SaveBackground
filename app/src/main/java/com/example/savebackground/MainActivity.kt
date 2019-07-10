package com.example.savebackground

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sPref = getPreferences(Context.MODE_PRIVATE)

        ll.setBackgroundColor(sPref.getInt("COLOR", Color.WHITE))

        fun saveColor(color: Int){
            sPref.edit {
                putInt("COLOR", color)
            }
        }

        btnRed.setOnClickListener {
            ll.setBackgroundColor(Color.RED)
            saveColor(Color.RED)
        }

        btnBlue.setOnClickListener {
            ll.setBackgroundColor(Color.BLUE)
            saveColor(Color.BLUE)
        }

        btnGreen.setOnClickListener {
            ll.setBackgroundColor(Color.GREEN)
            saveColor(Color.GREEN)
        }

    }
}
