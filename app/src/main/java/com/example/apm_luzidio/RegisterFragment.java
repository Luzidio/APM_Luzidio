package com.example.apm_luzidio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.apm_luzidio.databinding.FragmentRegBinding;

import java.util.ArrayList;

public class RegisterFragment extends Fragment {

    private DatabaseHelper databaseHelper;
    private FragmentRegBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Use o binding para inflar e acessar os elementos do layout
        binding = FragmentRegBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        databaseHelper = new DatabaseHelper(getActivity());

        // Obtenha as referências aos elementos do layout usando o binding
        EditText txtDescription = binding.txtDescription;
        EditText txtAutor = binding.txtAutor;
        EditText txtTheme = binding.txtTheme;
        Button btnRegister = binding.btnRegister;

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveTheme();

                ArrayList<Tema> temas = databaseHelper.getAllThemes();

                System.out.println(temas);
            }
        });

        return view;
    }

    public void saveTheme() {
        String description = binding.txtDescription.getText().toString();
        String autor = binding.txtAutor.getText().toString();
        String theme = binding.txtTheme.getText().toString();

        databaseHelper.save(autor, theme, description);
        Toast.makeText(getActivity(), "Tema registrado com sucesso!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        binding = null;
    }
}
