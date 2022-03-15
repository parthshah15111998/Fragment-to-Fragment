package com.example.fragmenttofragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmenttofragment.Communicator
import com.example.fragmenttofragment.databinding.FragmentBlankABinding


class BlankFragmentA : Fragment() {

    private lateinit var communicator: Communicator
    private lateinit var binding: FragmentBlankABinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankABinding.inflate(inflater, container, false)
        communicator = activity as Communicator
        binding.btnSend.setOnClickListener {
            communicator.passDataCom(binding.etName.text.toString())
        }
        return binding.root

    }

}
