package com.softwareonze.deliveryparagominas.ModeloInterno;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.softwareonze.deliveryparagominas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CardapioFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cardapio, container, false);

        view.findViewById(R.id.button_prato1).setOnClickListener(mListener);
        view.findViewById(R.id.button_prato2).setOnClickListener(mListener);
        view.findViewById(R.id.button_prato3).setOnClickListener(mListener);
        view.findViewById(R.id.button_prato4).setOnClickListener(mListener);
        view.findViewById(R.id.button_prato5).setOnClickListener(mListener);

        return view;

    }

    private final View.OnClickListener mListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_prato1:
                    Intent intent = new Intent(v.getContext(), PratoActivity.class);
                    startActivity(intent);

                case R.id.button_prato2:
                    intent = new Intent(CardapioFragment.this.getActivity(), PratoActivity.class);
                    startActivity(intent);

                case R.id.button_prato3:
                    intent = new Intent(CardapioFragment.this.getActivity(), PratoActivity.class);
                    startActivity(intent);

                case R.id.button_prato4:
                    intent = new Intent(CardapioFragment.this.getActivity(), PratoActivity.class);
                    startActivity(intent);

                case R.id.button_prato5:
                    intent = new Intent(CardapioFragment.this.getActivity(), PratoActivity.class);
                startActivity(intent);
            }

        }

    };

}
