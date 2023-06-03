package com.example.apm_luzidio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.apm_luzidio.databinding.ActivityThemeDetailsBinding;

public class ThemeDetailsActivity extends AppCompatActivity {

    private ActivityThemeDetailsBinding binding;
    private String authorName;

    Tema tema;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThemeDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);
        new Tema();
        binding.etDId.setEnabled(false);
        binding.etDAuthor.setEnabled(false);
        binding.etDTheme.setEnabled(false);;
        binding.etDDescription.setEnabled(false);;
        Intent intent = getIntent();

        int id = intent.getIntExtra("id", 0);
        String author = intent.getStringExtra("author");
        authorName = author;
        String theme = intent.getStringExtra("theme");
        String description = intent.getStringExtra("description");


        binding.etDId.setText(String.valueOf(id));
        binding.etDAuthor.setText(author);
        binding.etDTheme.setText(theme);
        binding.etDDescription.setText(description);

//
//        binding.btnDelete.setOnClickListener(v -> {
//            deleteStudent();
//        });
//
//        binding.btnUpdate.setOnClickListener(v -> {
//            binding.etDName.setEnabled(true);
//            binding.etDAge.setEnabled(true);;
//            binding.etDSex.setEnabled(true);;
//            binding.etDAdress.setEnabled(true);
//            binding.etDTel.setEnabled(true);
//
//            binding.btnUpdate.setClickable(false);
//        });
//
//        binding.btnDSave.setOnClickListener(v -> {
//            updateStudent();
//        });

    }

//    private void deleteStudent() {
//        System.out.println(studentName);
//        databaseHelper.delete(studentName);
//
//        this.finish();
//    }


//    private void updateStudent() {
//        int id = Integer.parseInt(binding.etDId.getText().toString().trim());
//        String name = binding.etDName.getText().toString().trim();
//        int age = Integer.parseInt(binding.etDAge.getText().toString().trim());
//        String sex = binding.etDSex.getText().toString().trim();
//        String address = binding.etDAdress.getText().toString().trim();
//        int telefone = Integer.parseInt(binding.etDTel.getText().toString().trim());
//
//        databaseHelper.update(id, name, age, sex, address, telefone);
//
//        Toast.makeText(this, "Estudante atualizado com sucesso", Toast.LENGTH_SHORT).show();
//        finish();
//    }

}