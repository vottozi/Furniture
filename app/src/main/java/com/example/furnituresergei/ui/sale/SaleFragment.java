package com.example.furnituresergei.ui.sale;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.furnituresergei.MAdapter;
import com.example.furnituresergei.R;
import com.example.furnituresergei.databinding.FragmentSaleBinding;
import com.example.furnituresergei.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class SaleFragment extends Fragment {

    private FragmentSaleBinding binding;
    List<FurnitureModel> list_sale = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSaleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter(true);
        adapter.setList_m(list_sale);
        binding.rvSale.setAdapter(adapter);

        return root;
    }

    private void createList() {
        list_sale.add(new FurnitureModel("hall", "Диван 'Уютный уголок'", "1200", "Комфортный диван с мягкими подушками для приятного отдыха в гостиной", "600$ 50%", R.drawable.sofa));
        list_sale.add(new FurnitureModel("hall", "Стенка 'Модерн'", "1500", "Современная стенка с большим количеством полок и ящиков для хранения вещей", "1050$ 30%", R.drawable.hall_wall_unit));
        list_sale.add(new FurnitureModel("bedroom", "Кровать Red Flame", "1690", "Кровать двухспальная размер 2.6м х 2.4м производство Турция," + " матрас набивной пружинный, кокосовая стружка", "1352$ 20%", R.drawable.redflame));
        list_sale.add(new FurnitureModel("bedroom", "Кровать Plot", "1340", " производство Италия, размер 2.2м х 2.15м" + " Riotello " + "отделка: хлопок и гобелен","940$ 30%", R.drawable.bedplot));
        list_sale.add(new FurnitureModel("garden", "Садовые качели", "1000", "Красивые качели для отдыха в саду", "600$ 40%", R.drawable.garden_swing));
        list_sale.add(new FurnitureModel("garden", "Садовый гриль", "800", "Гриль для приготовления еды на свежем воздухе", "720$ 10%", R.drawable.garden_grill));
        list_sale.add(new FurnitureModel("hallway", "Шкаф для верхней одежды", "800", "Просторный шкаф с вешалками и полками для хранения верхней одежды", "320$ 60%", R.drawable.hallway_closet));
        list_sale.add(new FurnitureModel("kitchen", "Кухонный гарнитур 'Солнечный день'", "2500", "Просторный кухонный гарнитур с большим количеством шкафчиков и ящиков", "1500 30%", R.drawable.kitchen_sunshine));
        list_sale.add(new FurnitureModel("kitchen", "Холодильник 'Морозильник'", "1200", "Просторный холодильник с морозильным отделением и системой No Frost", "960$ 20%", R.drawable.kitchen_fridge));
        list_sale.add(new FurnitureModel("kitchen", "Посудомоечная машина", "900", "Эффективная посудомоечная машина для быстрой и качественной мойки посуды", "450$ 50%", R.drawable.kitchen_dishwasher));
        list_sale.add(new FurnitureModel("child_room", "Кровать-машинка", "750", "Детская кровать в виде машины с ярким дизайном", "300$ 60%", R.drawable.child_bed_car));
        list_sale.add(new FurnitureModel("teen_room", "Кровать-диван", "850", "Удобная раскладывающаяся кровать-диван для подростков", "340$ 60%", R.drawable.teen_sofa_bed));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_saleFragment_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}