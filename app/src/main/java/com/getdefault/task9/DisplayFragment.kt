package com.getdefault.task9

import android.content.Intent
import android.net.Uri
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


        val adapter = PersonAdapter { phone: String -> callPerson(phone) }

        binding.rvPersonList.adapter = adapter


        return binding.root
    }

    private fun callPerson(phone : String){
        val callIntent = Intent(Intent.ACTION_DIAL)
        callIntent.data = Uri.parse("tel:$phone")
        startActivity(callIntent)
    }
}