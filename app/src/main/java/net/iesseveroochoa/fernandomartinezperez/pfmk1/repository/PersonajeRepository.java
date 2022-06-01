package net.iesseveroochoa.fernandomartinezperez.pfmk1.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.database.PersonajeDAO;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.database.PersonajeRoomDatabase;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Personaje;

import java.util.List;

public class PersonajeRepository {
    private static volatile PersonajeRepository INSTANCE;

    private PersonajeDAO personajeDAO;
    private LiveData<List<Personaje>> mAllPersonajes;

    //singleton
    public static PersonajeRepository getInstance(Application application) {
        if (INSTANCE == null) {
            synchronized (PersonajeRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PersonajeRepository(application);
                }
            }
        }
        return INSTANCE;
    }

    private PersonajeRepository(Application application) {
        PersonajeRoomDatabase db = PersonajeRoomDatabase.getDatabase(application);
        personajeDAO = db.personajeDAO();
        mAllPersonajes = personajeDAO.getAllPersonaje();
    }

    public LiveData<List<Personaje>> getAllPersonajes() {
        return mAllPersonajes;
    }


    public LiveData<List<Personaje>> getPersonajesOrderBy(String order_by, String order) {
        mAllPersonajes = personajeDAO.getPersonajeOrderBy(order_by, order);
        return mAllPersonajes;
    }


    public void insert(Personaje personaje) {
        PersonajeRoomDatabase.databaseWriteExecutor.execute(() -> {
            personajeDAO.insert(personaje);
        });


    }


    public void delete(Personaje personaje) {
        PersonajeRoomDatabase.databaseWriteExecutor.execute(() -> {
            personajeDAO.deleteByPersonaje(personaje);
        });
    }



}
