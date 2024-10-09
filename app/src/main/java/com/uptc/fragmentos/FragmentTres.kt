package com.uptc.fragmentos


import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentTres : Fragment(R.layout.fragment_tres) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar botones de navegación en Fragment Dos
        view.findViewById<Button>(R.id.btnPantallaUno).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentTres_to_fragmentUno)
        }
        view.findViewById<Button>(R.id.btnPantallaDos).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentTres_to_fragmentDos)
        }
    }
}