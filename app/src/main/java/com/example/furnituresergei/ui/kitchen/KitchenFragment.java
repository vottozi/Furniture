package com.example.furnituresergei.ui.kitchen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.furnituresergei.MAdapter;
import com.example.furnituresergei.R;
import com.example.furnituresergei.databinding.FragmentKitchenBinding;
import com.example.furnituresergei.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class KitchenFragment extends Fragment {

    private FragmentKitchenBinding binding;
    List<FurnitureModel> list_kitchen = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        KitchenViewModel kitchenViewModel = new ViewModelProvider(this).get(KitchenViewModel.class);

        binding = FragmentKitchenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter(false);
        adapter.setList_m(list_kitchen);
        binding.rvKitchen.setAdapter(adapter);

        return root;
    }

    private void createList() {
        list_kitchen.add(new FurnitureModel("kitchen", "Кухонный гарнитур 'Солнечный день'", "2500", "Просторный кухонный гарнитур с большим количеством шкафчиков и ящиков. Этот гарнитур поможет вам организовать пространство на кухне и хранить ваши кухонные принадлежности в порядке.", R.drawable.kitchen_sunshine));
        list_kitchen.add(new FurnitureModel("kitchen", "Стол для кухни", "600", "Удобный кухонный стол со столешницей из прочного материала. Этот стол станет идеальным местом для приема пищи и приятного времяпрепровождения с семьей.", R.drawable.kitchen_table));
        list_kitchen.add(new FurnitureModel("kitchen", "Стул для кухни", "100", "Комфортный стул с мягким сиденьем для приятного времяпрепровождения за кухонным столом. Этот стул обеспечит вам комфорт и удобство во время приема пищи.", R.drawable.kitchen_chair));
        list_kitchen.add(new FurnitureModel("kitchen", "Вытяжка 'Чистый воздух'", "300", "Мощная вытяжка для удаления запахов при готовке. Эта вытяжка обеспечит свежий воздух на вашей кухне и создаст комфортные условия для приготовления пищи.", R.drawable.kitchen_hood));
        list_kitchen.add(new FurnitureModel("kitchen", "Встраиваемая духовка", "800", "Современная духовка с множеством функций и режимов приготовления. Эта духовка позволит вам готовить разнообразные блюда с легкостью и получать идеальный результат каждый раз.", R.drawable.kitchen_oven));
        list_kitchen.add(new FurnitureModel("kitchen", "Холодильник 'Морозильник'", "1200", "Просторный холодильник с морозильным отделением и системой No Frost. Этот холодильник обеспечит надежное хранение продуктов и сохранит их свежесть на долгое время.", R.drawable.kitchen_fridge));
        list_kitchen.add(new FurnitureModel("kitchen", "Посудомоечная машина", "900", "Эффективная посудомоечная машина для быстрой и качественной мойки посуды. Эта машина сэкономит ваше время и усилит удовольствие от готовки, обеспечивая идеальную чистоту посуды каждый раз.", R.drawable.kitchen_dishwasher));
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_kitchen_to_navigation_home);

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}