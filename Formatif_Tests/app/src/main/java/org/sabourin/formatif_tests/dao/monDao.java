package org.sabourin.formatif_tests.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import org.sabourin.modele.Personne;

import java.util.List;

@Dao
public abstract class monDao {

    @Insert
    public abstract Long creerPersonne(Personne p);

    @Query("SELECT * FROM Personne")
    public abstract List<Personne> touteLesPersonnes();

}
