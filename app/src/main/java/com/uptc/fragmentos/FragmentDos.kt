package com.uptc.fragmentos

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentDos : Fragment(R.layout.fragment_dos) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar botones de navegación en Fragment Dos
        view.findViewById<Button>(R.id.btnPantallaUno).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentDos_to_fragmentUno)
        }
        view.findViewById<Button>(R.id.btnPantallaTres).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentDos_to_fragmentTres)
        }
    }
}