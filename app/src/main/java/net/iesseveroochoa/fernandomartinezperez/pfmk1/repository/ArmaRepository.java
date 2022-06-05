package net.iesseveroochoa.fernandomartinezperez.pfmk1.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;


import net.iesseveroochoa.fernandomartinezperez.pfmk1.database.ArmaDAO;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.database.ArmaRoomDatabase;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Arma;

import java.util.List;

public class ArmaRepository {
    private static volatile ArmaRepository INSTANCE;

    private ArmaDAO armaDAO;
    private LiveData<List<Arma>> mAllArmas;
    private LiveData<List<Arma>> mArmasPorPersonaje;

    //singleton
    public static ArmaRepository getInstance(Application application) {
        if (INSTANCE == null) {
            synchronized (ArmaRepository.class) {
                INSTANCE = new ArmaRepository(application);
            }
        }
        return INSTANCE;
    }

    private ArmaRepository(Application application) {
        ArmaRoomDatabase db = ArmaRoomDatabase.getDatabase(application);
        this.armaDAO = db.armaDAO();
        this.mAllArmas = armaDAO.getAllArma();
    }

    public ArmaDAO getDao() {
        return this.armaDAO;
    }

    public LiveData<List<Arma>> getAllArmas() {
        return mAllArmas;
    }


    public LiveData<List<Arma>> getArmasOrderBy(String order_by, String order) {
        mAllArmas = armaDAO.getArmaOrderBy(order_by, order);
        return mAllArmas;
    }



    public void insert(Arma arma) {
        ArmaRoomDatabase.databaseWriteExecutor.execute(() -> {
            armaDAO.insert(arma);
        });


    }


    public void delete(Arma arma) {
        ArmaRoomDatabase.databaseWriteExecutor.execute(() -> {
            armaDAO.deleteByArma(arma);
        });
    }

    public List<Arma> getArmasPorPersonaje(int idPersonaje){
        return armaDAO.getArmasPorPersonaje(idPersonaje);
    }

}
