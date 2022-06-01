package net.iesseveroochoa.fernandomartinezperez.pfmk1.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.*;
import androidx.sqlite.db.SupportSQLiteDatabase;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Personaje;


import java.util.concurrent.*;

@Database(entities = {Personaje.class}, version = 1)

public abstract class PersonajeRoomDatabase extends RoomDatabase {

    public abstract PersonajeDAO personajeDAO();

    private static volatile PersonajeRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 400;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static PersonajeRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (PersonajeRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    PersonajeRoomDatabase.class,
                                    "Personaje_database")
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                PersonajeDAO mDao = INSTANCE.personajeDAO();
                Personaje personaje;


                personaje = new Personaje(
                        001,
                        "Euris",
                        "Guerrero Arcano",
                        "Semielfo",
                        "Legal Neutral",
                        "7",
                        "100/700",
                        "Oficial",
                        "4d10",
                        1,
                        2,
                        3,
                        5,
                        6,
                        7,
                        8,
                        10,
                        20,
                        30,
                        40,
                        50);
                mDao.insert(personaje);


            });
        }


        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
        }
    };
}
