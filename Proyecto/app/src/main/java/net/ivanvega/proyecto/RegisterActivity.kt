package net.ivanvega.proyecto

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    lateinit var  txtEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_register)
    }

}