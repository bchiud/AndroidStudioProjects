package com.bradychiu.easy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bradychiu.easy.databinding.FragmentEasyBinding

class EasyFragment : Fragment() {

    // setup viewmodel
    private val viewModel: CountViewModel by activityViewModels()

    private var _binding: FragmentEasyBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEasyBinding.inflate(inflater, container, false)

        binding.ivEasyButton.setOnClickListener {
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