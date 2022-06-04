package net.iesseveroochoa.fernandomartinezperez.pfmk1.database;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Arma;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.Personaje;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Arma.class}, version = 1)
public abstract class ArmaRoomDatabase extends RoomDatabase {

    public abstract ArmaDAO armaDAO();

    private static volatile ArmaRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static ArmaRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ArmaRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                                    context.getApplicationContext(),
                                    ArmaRoomDatabase.class,
                                    "PFMK1_Armas")
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
            Log.i("DB", "OnCreate"); //TODO Borrar
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                ArmaDAO mDao = INSTANCE.armaDAO();
                Arma arma;
            });
        }


        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            Log.i("DB", "OnOpen"); //TODO Borrar
            super.onOpen(db);
        }
    };
}