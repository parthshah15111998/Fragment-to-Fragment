package com.example.fragmenttofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttofragment.fragment.BlankFragmentA
import com.example.fragmenttofragment.fragment.BlankFragmentB

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = BlankFragmentA()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentB = BlankFragmentB()
        fragmentB.arguments = bundle
        transaction.replace(R.id.frameLayout, fragmentB).commit()
    }
}
