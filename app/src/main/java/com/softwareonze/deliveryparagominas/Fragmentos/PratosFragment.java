package com.softwareonze.deliveryparagominas.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.softwareonze.deliveryparagominas.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PratosFragment extends Fragment {

    private TextView texto;

    public PratosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pratos, container, false);

        texto = view.findViewById(R.id.tela_pratos);
        texto.setText("Tela pratos alterada");
        return view;
    }

}
