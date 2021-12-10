package org.sabourin.formatif_tests;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.sabourin.formatif_tests.databinding.ActivityInterfaceBinding;
import org.sabourin.formatif_tests.databinding.ActivityMainBinding;

public class InterfaceActivity extends AppCompatActivity {

    ActivityInterfaceBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInterfaceBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setTitle("Interface Ghiles Kouaou");

        binding.btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(InterfaceActivity.this, ObjetActivity.class);
                startActivity(i);


            }
        });

    }
}
