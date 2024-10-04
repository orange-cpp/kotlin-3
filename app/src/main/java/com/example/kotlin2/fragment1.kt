package com.example.kotlin2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.kotlin2.databinding.FragmentFragment1Binding

class fragment1 : Fragment() {
    private lateinit var binding: FragmentFragment1Binding
    private lateinit var dataViewModel: MyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFragment1Binding.inflate(inflater, container,
            false)
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.
            action_fragment1_to_fragment2)
        }

        val dataRemoteDataSource = DataRemoteDataSourceImpl()
        val dataRepository = DataRepository(dataRemoteDataSource)
        val getDataUseCase = GetDataUseCase(dataRepository)

        dataViewModel = ViewModelProvider(this, MyViewModelFactory(getDataUseCase))[MyViewModel::class.java]

        dataViewModel.data.observe(viewLifecycleOwner) { data ->
            binding.datatext.text = data
        }
        return binding.root
    }
}