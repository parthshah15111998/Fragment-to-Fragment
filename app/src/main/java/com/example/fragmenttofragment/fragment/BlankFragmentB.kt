package com.example.fragmenttofragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmenttofragment.databinding.FragmentBlankBBinding

class BlankFragmentB : Fragment() {

    private lateinit var binding: FragmentBlankBBinding
    private var displayMessage: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBBinding.inflate(inflater, container, false)
        displayMessage = arguments?.getString("message")
        binding.tvName.text = displayMessage
        return binding.root
    }


}