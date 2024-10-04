package com.example.kotlin2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kotlin2.databinding.FragmentFragment2Binding

class fragment2 : Fragment() {

    private lateinit var binding: FragmentFragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFragment2Binding.inflate(inflater, container, false)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }
}