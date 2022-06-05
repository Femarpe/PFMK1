package net.iesseveroochoa.fernandomartinezperez.pfmk1.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Arma;

import java.util.List;

@Dao
public interface ArmaDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Arma arma);

    @Query("DELETE FROM " + Arma.TABLE_NAME)
    void deleteAll();

    @Delete
    void deleteByArma(Arma arma);

    @Update
    void update(Arma arma);

    @Query("SELECT * FROM " + Arma.TABLE_NAME + " ORDER BY idArma")
    LiveData<List<Arma>> getAllArma();


    @Query("SELECT COUNT(*) from" + Arma.TABLE_NAME)
    int countArma();


    @Query(
            "SELECT * FROM  " + Arma.TABLE_NAME + " ORDER BY " +
                    "CASE WHEN :sort_by = 'id'   AND :sort = 'ASC' THEN idArma END ASC, " +
                    "CASE WHEN :sort_by = 'id'   AND :sort = 'DESC' THEN idArma END DESC"
    )
    LiveData<List<Arma>> getArmaOrderBy(String sort_by, String sort);

    @Query("SELECT * FROM " + Arma.TABLE_NAME + " WHERE fkIdPersonaje =:idPersonaje"  )
    List<Arma> getArmasPorPersonaje( int idPersonaje);

}
