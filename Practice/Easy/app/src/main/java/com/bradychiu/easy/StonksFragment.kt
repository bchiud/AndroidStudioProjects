package com.bradychiu.easy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bradychiu.easy.databinding.FragmentStonksBinding

class StonksFragment : Fragment() {

    private val viewModel: CountViewModel by activityViewModels()

    private var _binding: FragmentStonksBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStonksBinding.inflate(inflater, container, false)

        binding.ivStonksButton.setOnClickListener {
            onClick()
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    private fun onClick() {
        viewModel.onClick()
    }
}