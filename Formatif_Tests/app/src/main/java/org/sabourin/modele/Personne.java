package org.sabourin.modele;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Personne {

    @PrimaryKey(autoGenerate = true)
    public Long personneId;

    @ColumnInfo
    public String nom;





}
