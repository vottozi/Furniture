package com.example.furnituresergei.ui.youthfurniture;

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
import com.example.furnituresergei.databinding.FragmentYouthFurnitureBinding;
import com.example.furnituresergei.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class YouthFurnitureFragment extends Fragment {

    private FragmentYouthFurnitureBinding binding;
    List<FurnitureModel> list_youth = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        YouthFurnitureViewModel youthFurnitureViewModel = new ViewModelProvider(this).get(YouthFurnitureViewModel.class);

        binding = FragmentYouthFurnitureBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter(false);
        adapter.setList_m(list_youth);
        binding.rvYouth.setAdapter(adapter);

        return root;
    }

    private void createList() {
        // Мебель для детской комнаты
        list_youth.add(new FurnitureModel("child_room", "Кровать-машинка", "750", "Детская кровать в виде машины с ярким дизайном. Эта кровать станет прекрасным местом для сна и игр вашего ребенка.", R.drawable.child_bed_car));
        list_youth.add(new FurnitureModel("child_room", "Стол для рисования", "200", "Стол с меловой доской для рисования и игр. Этот стол поможет развивать творческие способности вашего ребенка и создаст удобные условия для игр и занятий.", R.drawable.child_drawing_table));
        list_youth.add(new FurnitureModel("child_room", "Стул для детей", "100", "Мягкий стул для удобного сидения за столом. Этот стул обеспечит комфорт и удобство вашему ребенку во время занятий и игр.", R.drawable.child_chair));
        list_youth.add(new FurnitureModel("child_room", "Книжная полка 'Дружба'", "150", "Полка для книг и игрушек с яркими изображениями. Эта полка поможет организовать пространство в детской комнате и сделает хранение книг и игрушек удобным и доступным.", R.drawable.child_bookshelf));
        list_youth.add(new FurnitureModel("child_room", "Шкаф для одежды 'Сказка'", "450", "Шкаф с ящиками и вешалками для хранения детской одежды. Этот шкаф обеспечит удобное и компактное хранение одежды вашего ребенка, а его яркий дизайн создаст атмосферу веселья и радости.", R.drawable.child_wardrobe));
        list_youth.add(new FurnitureModel("child_room", "Игровой ковер 'Приключения'", "120", "Ковер с изображением природы и животных для игр и развлечений. Этот ковер создаст атмосферу приключений и веселья в детской комнате и станет прекрасным местом для игр и фантазий.", R.drawable.child_carpet));

        list_youth.add(new FurnitureModel("teen_room", "Кровать-диван", "850", "Удобная раскладывающаяся кровать-диван для подростков. Эта кровать обеспечит комфортный сон и отдых вашему подростку, а также станет удобным местом для приема гостей.", R.drawable.teen_sofa_bed));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_youth_to_navigation_home);

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}