package org.sabourin.formatif_tests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.sabourin.formatif_tests.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        /* -------------- RIEN À VOIR / FAIRE ICI -------------*/

        setTitle("Final Ghiles Kouaou");
        Button btn = findViewById(R.id.btnFinal);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,InterfaceActivity.class);
                startActivity(i)    ;

            }
        });

    }
}