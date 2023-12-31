package com.example.birthdaycard

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {

        val nameInput: EditText = findViewById(R.id.nameInput)
        val name = nameInput.editableText.toString()

        val intent = Intent(this,BirthdayGreetingsActivity::class.java)
        intent.putExtra(BirthdayGreetingsActivity.NAME_EXTRA, name)
        startActivity(intent)
    }

}







