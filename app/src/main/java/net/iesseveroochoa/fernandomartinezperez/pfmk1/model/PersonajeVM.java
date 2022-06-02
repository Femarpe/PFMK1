package net.iesseveroochoa.fernandomartinezperez.pfmk1.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.repository.PersonajeRepository;

import java.util.List;

public class PersonajeVM extends AndroidViewModel {
    private LiveData<List<Personaje>> listLiveData;
    private PersonajeRepository repository;
    
    private MutableLiveData<String> condicionBusquedaLiveData;
    private int salida;

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public PersonajeVM(@NonNull Application application) {
        super(application);
        this.repository = PersonajeRepository.getInstance(application);
        this.listLiveData = repository.getAllPersonajes();
        this.condicionBusquedaLiveData = new MutableLiveData<String>();
        this.condicionBusquedaLiveData.setValue("");
    }

    public LiveData<List<Personaje>> getListaPersonajes() {
        return listLiveData;
    }

    /**
     * Este metodo sirve para añadir un personaje
     */
    public void addPersonaje(Personaje personaje) {
        repository.insert(personaje);
    }

    /**
     * Este metodo sirve para borrar una personaje
     */
    public void delPersonaje(Personaje personaje) {
        repository.delete(personaje);

    }


}
