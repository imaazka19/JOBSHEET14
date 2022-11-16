package com.example.ima14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Busana  = findViewById<Button>(R.id.btnBusana)
        val Kuliner = findViewById<Button>(R.id.btnKuliner)
        val Pplg    = findViewById<Button>(R.id.btnPplg)
        val To      = findViewById<Button>(R.id.btnTo)
        val Tpfl    = findViewById<Button>(R.id.btnTpfl)


        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,BusanaFragment())
            fragmentTransaction.commit()
        }

        Kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, KulinerFragment())
            fragmentTransaction.commit()
        }

        Pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,PplgFragment())
            fragmentTransaction.commit()
        }

        Tpfl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,TpflFragment())
            fragmentTransaction.commit()
        }

        To.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,ToFragment())
            fragmentTransaction.commit()
        }
    }
}