package com.bradychiu.jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.bradychiu.jetpacknavigation.databinding.FragmentThirdPageBinding

class ThirdPageFragment : Fragment() {

    companion object {
        const val NAV_SOURCE: String = "nav_source"
    }

    private var _binding: FragmentThirdPageBinding? = null
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
        _binding = FragmentThirdPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvThirdPageSubtitle.text = getText(R.string.third_page_subtitle)

        val contentRepeated = Array<String>(6) { "$contentSingle" }.joinToString("\n\n")
        binding.tvThirdPageContent.text = contentRepeated

        binding.btnThirdPageActionButton.setText(R.string.third_page_to_first_page_button)
        binding.btnThirdPageActionButton.setOnClickListener {
            val action = ThirdPageFragmentDirections.actionThirdPageToFirstPage()
            view.findNavController().navigate(action)
        }
    }

}