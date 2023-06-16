package com.example.interior3d

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.interior3d.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentDetailBinding
            .inflate(inflater, container, false)

        binding.button3d.setOnClickListener {
            this.findNavController().navigate(R.id.action_detailFragment_to_sceneDFragment)
        }

        return binding.root
    }
}