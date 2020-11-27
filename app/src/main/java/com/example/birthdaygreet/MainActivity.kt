package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createBdayBtn.setOnClickListener {
//
            val name = plainText.editableText.toString()
//
//            Toast.makeText(this, "Happy Birthday $name", Toast.LENGTH_LONG).show()

            val intent = Intent(this, BirthdayCardActivity::class.java)

            intent.putExtra("name", name)

            startActivity(intent)

        }

    }


}