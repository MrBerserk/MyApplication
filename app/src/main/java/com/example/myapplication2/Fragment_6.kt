package com.example.myapplication2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar

class Fragment_6 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_6, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.getString("Pizdec_pomogite")?:"Default"
        Snackbar.make(view,text,Snackbar.LENGTH_LONG).show()
    }
}
