package com.ajgroup.databidding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.ajgroup.databidding.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        lateinit var btnClickMe : Button
        binding.btnClickMe.text = "Klik Saya"
        binding.btnClickMe.setOnClickListener {
            Snackbar.make(binding.btnClickMe, "Tombol Ditekan", Snackbar.LENGTH_LONG).setAction("OK BosQ", View.OnClickListener {

            }).show()
        }

    }
}