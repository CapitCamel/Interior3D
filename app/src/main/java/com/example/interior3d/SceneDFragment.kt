package com.example.interior3d

import android.os.Bundle
import android.view.*
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.interior3d.databinding.FragmentSceneDBinding

class SceneDFragment : Fragment() {

    private lateinit var surfaceView: SurfaceView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSceneDBinding
            .inflate(inflater, container, false)

        surfaceView = SurfaceView(requireContext())
        val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT)
        binding.root.addView(surfaceView, layoutParams)

        return binding.root
    }

}