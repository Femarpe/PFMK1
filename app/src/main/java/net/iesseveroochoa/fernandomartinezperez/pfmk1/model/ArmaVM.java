package net.iesseveroochoa.fernandomartinezperez.pfmk1.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import net.iesseveroochoa.fernandomartinezperez.pfmk1.repository.ArmaRepository;

import java.util.List;

public class ArmaVM extends AndroidViewModel {
    private LiveData<List<Arma>> listLiveData;
    private ArmaRepository repository;

    private MutableLiveData<String> condicionBusquedaLiveData;
    private int salida;

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public ArmaVM(@NonNull Application application) {
        super(application);
        this.repository = ArmaRepository.getInstance(application);
        this.listLiveData = repository.getAllArmas();
        this.condicionBusquedaLiveData = new MutableLiveData<String>();
        this.condicionBusquedaLiveData.setValue("");
    }

    public LiveData<List<Arma>> getListaArmas() {
        return listLiveData;
    }

    /**
     * Este metodo sirve para añadir un Arma
     */
    public void addArma(Arma arma) {
        repository.insert(arma);
    }

    /**
     * Este metodo sirve para borrar una Arma
     */
    public void delArma(Arma arma) {
        repository.delete(arma);

    }

    public List<Arma> getArmasPorPersonaje(int idPersonaje){
        return repository.getArmasPorPersonaje(idPersonaje);
    }

}