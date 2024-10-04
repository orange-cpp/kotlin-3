package com.example.kotlin2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kotlin2.databinding.FragmentFragment3Binding

class fragment3 : Fragment() {

    private lateinit var binding: FragmentFragment3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFragment3Binding.inflate(inflater, container, false)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment1)
        }

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }
}