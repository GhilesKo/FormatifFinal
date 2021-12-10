package org.sabourin.formatif_tests.dao;



import androidx.room.Database;
import androidx.room.RoomDatabase;

import org.sabourin.modele.Personne;

@Database(entities = {Personne.class}, version = 1)
public abstract class maBD extends RoomDatabase {
    public abstract monDao userDao();
}


