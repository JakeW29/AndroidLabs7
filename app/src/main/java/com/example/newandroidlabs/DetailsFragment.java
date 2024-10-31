package com.example.newandroidlabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_details, container, false);

        TextView name = view.findViewById(R.id.name);
        TextView height = view.findViewById(R.id.height);
        TextView mass = view.findViewById(R.id.mass);

        Bundle args = getArguments();
        if (args != null) {

            name.setText("Name: " + args.getString("name"));
            height.setText("Height: " + args.getString("height"));
            mass.setText("Mass: " + args.getString("mass"));
        }

        return view;
    }
}
