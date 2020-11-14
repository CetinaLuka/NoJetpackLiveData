package com.i.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this)[DataViewModel::class.java]
        viewModel.vrniObservableStevilo().subscribe {steviloTextView.text = it.toString()}
        povecajSteviloButton.setOnClickListener { viewModel.povecajStevilo() }
        zmanjsajSteviloButton.setOnClickListener { viewModel.zmanjsajStevilo() }
    }
}