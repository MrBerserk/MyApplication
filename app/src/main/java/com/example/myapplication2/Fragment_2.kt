package com.example.myapplication2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.myapplication2.R

class Fragment_2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = getView()?.findViewById<Button>(R.id.button)
        button?.setOnClickListener{view ->
            var bundle = bundleOf("Pizdec_pomogite" to this::class.toString())
            view.findNavController().navigate(R.id.action_fragment_2_to_fragment_6, bundle)
        }
    }
}