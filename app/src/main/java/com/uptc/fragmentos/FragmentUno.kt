package com.uptc.fragmentos

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentUno : Fragment(R.layout.fragment_uno) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar botones de navegación en Fragment Uno
        view.findViewById<Button>(R.id.btnPantallaDos).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentUno_to_fragmentDos)
        }
        view.findViewById<Button>(R.id.btnPantallaTres).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentUno_to_fragmentTres)
        }
    }
}
