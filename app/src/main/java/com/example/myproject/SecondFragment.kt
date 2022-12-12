package com.example.myproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.switchToFirstButton)
        button.setOnClickListener {
            (requireActivity() as MainActivity).switchToFirstFragment()
        }
    }
    companion object {
        @JvmStatic
        fun newInstance() =
            SecondFragment()

    }
}