package com.example.furnituresergei.ui.hallway;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.furnituresergei.MAdapter;
import com.example.furnituresergei.R;
import com.example.furnituresergei.databinding.FragmentHallwayBinding;
import com.example.furnituresergei.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class HallwayFragment extends Fragment {

    private FragmentHallwayBinding binding;
    List<FurnitureModel> list_hallway = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

//        HallwayViewModel hallwayViewModel = new ViewModelProvider(this).get(HallwayViewModel.class);

        binding = FragmentHallwayBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter(false);
        adapter.setList_m(list_hallway);
        binding.rvHallway.setAdapter(adapter);

        return root;
    }

    private void createList() {
        list_hallway.add(new FurnitureModel("hallway", "Шкаф для верхней одежды", "800", "Просторный шкаф с вешалками и полками для хранения верхней одежды. Этот шкаф поможет вам организовать пространство в прихожей и хранить ваши вещи в порядке.", R.drawable.hallway_closet));
        list_hallway.add(new FurnitureModel("hallway", "Тумба для обуви", "300", "Удобная тумба с ящиками и полками для хранения обуви. Эта тумба поможет вам организовать хранение обуви в прихожей и сохранить порядок.", R.drawable.hallway_shoe_cabinet));
        list_hallway.add(new FurnitureModel("hallway", "Вешалка настенная", "100", "Настенная вешалка для верхней одежды. Эта вешалка позволит вам удобно разместить верхнюю одежду в прихожей, экономя пространство.", R.drawable.hallway_coat_rack));
        list_hallway.add(new FurnitureModel("hallway", "Пуфик", "150", "Мягкий пуфик для удобного сидения при надевании обуви. Этот пуфик станет удобным помощником в прихожей, обеспечивая комфорт и удобство.", R.drawable.hallway_pouf));
        list_hallway.add(new FurnitureModel("hallway", "Зеркало", "200", "Большое зеркало для последней проверки перед выходом из дома. Это зеркало поможет вам всегда выглядеть на высоте и сохранить уверенность в себе.", R.drawable.hallway_mirror));
        list_hallway.add(new FurnitureModel("hallway", "Ключница", "50", "Ключница для удобного хранения ключей. Эта ключница поможет вам всегда знать, где находятся ваши ключи, обеспечивая порядок в прихожей.", R.drawable.hallway_key_holder));
        list_hallway.add(new FurnitureModel("hallway", "Коврик", "50", "Коврик для удобной уборки обуви. Этот коврик защитит пол в прихожей от грязи и пыли, обеспечивая чистоту и порядок.", R.drawable.hallway_mat));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_hallway_to_navigation_home);

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}