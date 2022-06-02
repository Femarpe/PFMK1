package net.iesseveroochoa.fernandomartinezperez.pfmk1.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Personaje;

import java.util.List;

@Dao
public interface PersonajeDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Personaje personaje);

    @Query("DELETE FROM " + Personaje.TABLE_NAME)
    void deleteAll();

    @Delete
    void deleteByPersonaje(Personaje personaje);

    @Update
    void update(Personaje personaje);

    @Query("SELECT * FROM " + Personaje.TABLE_NAME + " ORDER BY _id")
    LiveData<List<Personaje>> getAllPersonaje();


    @Query("SELECT COUNT(*) from" + Personaje.TABLE_NAME)
    int countPersonaje();


    @Query(
            "SELECT * FROM  " + Personaje.TABLE_NAME + " ORDER BY " +
            "CASE WHEN :sort_by = 'id'   AND :sort = 'ASC' THEN _id END ASC, " +
            "CASE WHEN :sort_by = 'id'   AND :sort = 'DESC' THEN _id END DESC"
    )
    LiveData<List<Personaje>> getPersonajeOrderBy(String sort_by, String sort);


}