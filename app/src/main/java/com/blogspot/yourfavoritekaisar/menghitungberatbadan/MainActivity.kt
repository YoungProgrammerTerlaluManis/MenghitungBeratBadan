package com.blogspot.yourfavoritekaisar.menghitungberatbadan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.onClick {
            var beratBadan = edtBeratBadan.text.toString()
            var tinggiBadan = edtTinggiBadan.text.toString()
            val kurus = 0.0
            val batasKurus = 18.5
            val normal = 18.5
            val batasNormal = 24.9
            val gemuk = 25.0
            val batasGemuk = 29.9

            if (beratBadan.toDoubleOrNull() != null && tinggiBadan.toDoubleOrNull() != null) {
                var process = beratBadan.toDouble() / (tinggiBadan.toDouble() * tinggiBadan.toDouble())

                when (process) {
                    in kurus..batasKurus -> {
                        txtHasil.text = "Kamu Kurus $process"
                        alert("Kamu Kunyuk") {
                            yesButton {
                            }
                        }.show()
                    }
                    in normal..batasNormal -> {
                        txtHasil.text = "kamu Normal $process"
                        alert("Kamu Sehat") {
                            yesButton {
                            }
                        }.show()
                    }
                    in gemuk..batasGemuk -> {
                        txtHasil.text = "Kamu Battala $process"
                        alert ("Kamu Gendut Kurangin Makan") {
                            yesButton {
                            }
                        }
                    }
                    else -> {
                        txtHasil.text = "Kamu kek Haikal $process"
                        alert("CUY DIET NAPA") {
                            yesButton {
                            }
                        }
                    }
                }
            }
            else {
                // TODO Sebelum Menggunakan Anko
//                Toast.makeText(this, "ISI DATA AKHI", Toast.LENGTH_SHORT).show()

                // TODO Setelah Menggunakan Anko
                alert("ISI DATA BOSS") {
                    yesButton {
                    }
                }.show()
            }
        }
    }
}

