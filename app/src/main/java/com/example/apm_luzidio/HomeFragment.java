package com.example.apm_luzidio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.apm_luzidio.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private DatabaseHelper databaseHelper;
    private FragmentHomeBinding binding;

    ArrayList<Tema> temas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        databaseHelper = new DatabaseHelper(getActivity());

        temas = databaseHelper.getAllThemes();

        ThemeAdapter adapter = new ThemeAdapter( temas, getActivity());
        binding.lvThemes.setAdapter(adapter);




        return view;
    }
}