package com.bradychiu.jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.bradychiu.jetpacknavigation.databinding.FragmentSecondPageBinding

class SecondPageFragment : Fragment() {
    // companion object == static + singleton
    companion object {
        const val NAV_SOURCE: String = "nav_source"
    }

    private var _binding: FragmentSecondPageBinding? = null
    private val binding
        get() = _binding!!
    private lateinit var contentSingle: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            contentSingle = it.getString(NAV_SOURCE).toString()
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvSecondPageSubtitle.text = getText(R.string.second_page_subtitle)

        val contentRepeated = Array<String>(4) { "$contentSingle" }.joinToString("\n\n")
        binding.tvSecondPageContent.text = contentRepeated

        binding.btnSecondPageActionButton.setText(R.string.second_page_to_third_page_button)
        binding.btnSecondPageActionButton.setOnClickListener {
            val action = SecondPageFragmentDirections.actionSecondPageToThirdPage(
                    navSource = getString(R.string.lorem_ipsum)
            )
            view.findNavController().navigate(action)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}