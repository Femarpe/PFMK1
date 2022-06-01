package net.iesseveroochoa.fernandomartinezperez.pfmk1;

import android.app.Application;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.database.PersonajeRoomDatabase;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.databinding.ActivityMainBinding;
import net.iesseveroochoa.fernandomartinezperez.pfmk1.model.PersonajeVM;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    PersonajeVM personajeVM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_principal, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        personajeVM = new ViewModelProvider(this).get(PersonajeVM.class);
        //personajeVM.getListaPersonajes().observe(this, adapter::setListaDias);
        }

}