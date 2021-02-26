package com.bradychiu.stonks.timeseries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bradychiu.stonks.R

class TimeSeriesFragment() : Fragment() {

    companion object {
        fun newInstance() = TimeSeriesFragment()
    }

    private lateinit var viewModel: TimeSeriesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.time_series_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TimeSeriesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}