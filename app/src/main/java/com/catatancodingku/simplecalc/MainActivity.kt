package com.catatancodingku.simplecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat
import java.text.Format

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnHiutng.setOnClickListener {
            val value1     = edNilai1.text.toString()
            val value2     = edNilai2.text.toString()

            Log.d("_cek", "onCreate: $value1 dan $value2")

            if (TextUtils.isEmpty(value1) || TextUtils.isEmpty(value2)){
                Toast.makeText(this, "Masukkan Nilai", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val n1      = value1.toDouble()
            val n2     = value2.toDouble()


            val operator    = spinner2.selectedItem.toString()

            var format = DecimalFormat("#,###")
            when(operator){
                "Ditambah" -> tvHasil.setText(format.format((n1 + n2)))
                "Dikurang" -> tvHasil.setText(format.format((n1 - n2)))
                "Dikali" -> tvHasil.setText(format.format((n1 * n2)))
                "Dibagi" -> tvHasil.setText(format.format((n1 / n2)))
            }

        }



    }

}

