package ro.cunbm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SimpleFragment extends Fragment {

    View view;
    Button firstButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_simple, container, false);
        view = inflater.inflate(R.layout.fragment_simple, container, false);
        // get the reference of Button
        firstButton = (Button) view.findViewById(R.id.firstButton);
        // perform setOnClickListener on first Button
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // display a message by using a Toast
                Toast.makeText(getActivity(), "Fragment's Button", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}