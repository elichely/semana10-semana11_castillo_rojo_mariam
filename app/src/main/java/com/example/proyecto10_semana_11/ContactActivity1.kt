package com.example.proyecto10_semana_11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class ContactActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact1)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    fun sendData(view: View) {
        val firstName = findViewById<EditText>(R.id.editTextContact1Firstname).text.toString()
        val lastName = findViewById<EditText>(R.id.editTextContact1Lastname).text.toString()
        val phoneNumber = findViewById<EditText>(R.id.editTextContact1PhoneNumber).text.toString()
        val email = findViewById<EditText>(R.id.editTextContact1Email).text.toString()

        if (firstName.isNullOrEmpty() ||
            lastName.isNullOrEmpty() ||
            phoneNumber.isNullOrEmpty() ||
            email.isNullOrEmpty()
        ) {
            Toast.makeText(this, "Debes ingresar todos los datos", Toast.LENGTH_SHORT).show()
        } else {
            val contacto = Contact().apply {
                Firstname = firstName
                Lastname = lastName
                PhoneNumber = phoneNumber
                Email = email
            }
            val intent = Intent(this, ContactActivity2::class.java)
            intent.putExtra("contacto", contacto)

            try {
                startActivity(intent)
            } catch (ex: Exception) {
                ex.printStackTrace()
                Toast.makeText(this, "Error: ${ex.toString()}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}