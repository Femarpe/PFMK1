package net.iesseveroochoa.fernandomartinezperez.pfmk1.database;

import androidx.lifecycle.LiveData;
import androidx.room.Embedded;
import androidx.room.Relation;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Arma;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Personaje;

import java.util.List;

public class PersonajeConArmas {
    @Embedded public Personaje personaje;
    @Relation(
            parentColumn = "idPersonaje",
            entityColumn = "fkIdPersonaje"
    )
    public List<Arma> armas;
}
