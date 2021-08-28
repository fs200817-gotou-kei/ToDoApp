package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list_view)
        val btn = findViewById<Button>(R.id.btn)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1)
        val editText = findViewById<EditText>(R.id.edit_text)

        btn.setOnClickListener{
            adapter.add(editText.getText().toString())
        }
        listView.setAdapter(adapter)
    }
}