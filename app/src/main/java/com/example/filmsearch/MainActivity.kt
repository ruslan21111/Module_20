package com.example.filmsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


   initMenuButtons()


    }


        private fun initMenuButtons() {
            button1.setOnClickListener {
                Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
            }

            button2.setOnClickListener {
                Toast.makeText(this, "ИЗБРАННОЕ", Toast.LENGTH_SHORT).show()
            }
            button3.setOnClickListener {
                Toast.makeText(this, "ПОСМОТРЕТЬ ПОЗЖЕ", Toast.LENGTH_SHORT).show()
            }
            button4.setOnClickListener {
                Toast.makeText(this, "ПОДБОРКИ", Toast.LENGTH_SHORT).show()

            }
            button5.setOnClickListener {
                Toast.makeText(this, "НАСТРОЙКИ", Toast.LENGTH_SHORT).show()

            }

        }
    }






