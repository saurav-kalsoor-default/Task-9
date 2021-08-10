package com.getdefault.task9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.getdefault.task9.databinding.FragmentDisplayBinding

class DisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentDisplayBinding.inflate(layoutInflater)
        val viewModel: DisplayViewModel = ViewModelProvider(this).get(DisplayViewModel::class.java)
        binding.viewModel = viewModel

        val adapter = PersonAdapter()
        binding.rvPersonList.adapter = adapter

        return binding.root
    }
}