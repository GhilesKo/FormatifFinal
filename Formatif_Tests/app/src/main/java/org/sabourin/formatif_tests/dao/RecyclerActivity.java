package org.sabourin.formatif_tests.dao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.sabourin.formatif_tests.databinding.ActivityMainBinding;
import org.sabourin.formatif_tests.databinding.ActivityRecyclerBinding;

public class RecyclerActivity extends AppCompatActivity {
        ActivityRecyclerBinding binding;
        CptAdapteur adapteur;
        int cpt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        RecyclerInit();

        binding.cptPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cpt++;
                adapteur.listeNomrbes.add(cpt); 
                adapteur.notifyDataSetChanged();




            }
        });



    }



    private void RecyclerInit() {

        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapteur = new CptAdapteur();
        recyclerView.setAdapter(adapteur);

    }
}
