package com.bradychiu.viewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ScreenSlidePageFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen_slide_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tvTitle: TextView = view.findViewById(R.id.tv_title)
        tvTitle.setText(R.string.title)
        val tvContent: TextView = view.findViewById(R.id.tv_content)
        tvContent.setText(R.string.large_text)
    }
}

