package com.bradychiu.jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.bradychiu.jetpacknavigation.databinding.FragmentFirstPageBinding

class FirstPageFragment : Fragment() {
    /**
     * fragment:
     * 1) onCreate
     * 2) onCreateView
     * 3) onViewCreated
     *
     * binding:
     * 1) setup binding var to handle null (will be null beyond onCreateView and onDestroyView)
     * 2) instantiate binding
     * 3) null _binding when onDestroy
     */

    /**
     * binding 1) + 2)
     * ? declares var as nullable
     * !! is null safety check and will throw NPE if null
     */

    private var _binding: FragmentFirstPageBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // binding 2) instantiate binding
        _binding = FragmentFirstPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvFirstPageSubtitle.text = getText(R.string.first_page_subtitle)

        val contentSingle = getString(R.string.lorem_ipsum)
        val contentRepeated = Array<String>(2) { "$contentSingle" }.joinToString("\n\n")
        binding.tvFirstPageContent.text = contentRepeated

        binding.btnFirstPageAction.setText(R.string.first_page_to_second_page_button)
        binding.btnFirstPageAction.setOnClickListener {
                       val action = FirstPageFragmentDirections.actionFirstPageToSecondPage(
                           navSource = getString(R.string.lorem_ipsum)
                       )
            view.findNavController().navigate(action)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // 3) null _binding when onDestroy
        _binding = null
    }
}