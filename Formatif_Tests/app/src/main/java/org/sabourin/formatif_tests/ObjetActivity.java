package org.sabourin.formatif_tests;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import org.sabourin.formatif_tests.dao.maBD;
import org.sabourin.formatif_tests.databinding.ActivityInterfaceBinding;
import org.sabourin.formatif_tests.databinding.ActivityObjetBinding;
import org.sabourin.modele.Personne;

import java.util.ArrayList;
import java.util.List;

public class ObjetActivity extends AppCompatActivity {


    ActivityObjetBinding binding;
    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityObjetBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        maBD db = Room.databaseBuilder(getApplicationContext(),
                maBD.class, "database-Ghiles").fallbackToDestructiveMigration().allowMainThreadQueries().build();

        binding.btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<Personne> toutLesPersonnes = new ArrayList<>();
                toutLesPersonnes = db.userDao().touteLesPersonnes();
                Personne p = new Personne();
                p.nom = binding.nomPersonne.getText().toString();

                db.userDao().creerPersonne(p);


            }

        });





    }
}
