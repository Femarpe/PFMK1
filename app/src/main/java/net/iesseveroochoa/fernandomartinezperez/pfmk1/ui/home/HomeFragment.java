package net.iesseveroochoa.fernandomartinezperez.pfmk1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import net.iesseveroochoa.fernandomartinezperez.pfmk1.databinding.FragmentPrincipalBinding;

public class HomeFragment extends Fragment {

    private FragmentPrincipalBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentPrincipalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.text;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}