package com.tjoeunit.myapplication1030

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        LoginInBotten.setOnClickListener {

         SignUpBtn.setOnClickListener {
             
         }

        }
    }
}
