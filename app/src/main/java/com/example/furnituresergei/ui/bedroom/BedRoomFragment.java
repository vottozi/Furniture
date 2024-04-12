package com.example.furnituresergei.ui.bedroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.furnituresergei.MAdapter;
import com.example.furnituresergei.R;
import com.example.furnituresergei.databinding.FragmentBedroomBinding;
import com.example.furnituresergei.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class BedRoomFragment extends Fragment {

    private FragmentBedroomBinding binding;
    List<FurnitureModel> list_bedroom = new ArrayList<>();
    MAdapter adapter;
    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentBedroomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter(false);
        adapter.setList_m(list_bedroom);
        binding.rvBedroom.setAdapter(adapter);

        return root;
    }

    private void createList() {
        list_bedroom.add(new FurnitureModel("bedroom", "Кровать Red Flame", "1690", "Кровать двухспальная размер 2.6м х 2.4м производство Турция, матрас набивной пружинный, кокосовая стружка. Эта удивительная кровать Red Flame станет прекрасным дополнением к вашей спальне. Ее элегантный дизайн и высокое качество материалов обеспечат вам комфортный сон и отличный отдых.", R.drawable.redflame));
        list_bedroom.add(new FurnitureModel("bedroom", "Кровать Red sunrise", "1100", " производство Италия, размер 2.6м х 2.4м Mario Fabric отделка: натуральная кожа и гобелен, набивной, специальный состав. Эта элегантная кровать Red Sunrise привнесет нотку роскоши в вашу спальню. Изысканный дизайн и первоклассные материалы обеспечат вам комфорт и уют.", R.drawable.redbed));
        list_bedroom.add(new FurnitureModel("bedroom", "Кровать Plot", "1340", " производство Италия, размер 2.2м х 2.15м Riotello отделка: хлопок и гобелен, набивной, специальный состав. Кровать Plot - это превосходное сочетание стиля и комфорта. Ее изысканный дизайн и высококачественные материалы гарантируют вам приятный и уютный отдых.", R.drawable.bed_super_stable));
        list_bedroom.add(new FurnitureModel("bedroom", "Кровать Parlament", "1200", " производство Италия, размер 2.2м х 2.4м Mario Fabric отделка: хлопок и атлас, набивной, специальный состав. Кровать Parlament - это прекрасный выбор для вашей спальни. Ее элегантный дизайн и высокое качество материалов обеспечат вам отличный сон и комфорт.", R.drawable.bedparlament));
        list_bedroom.add(new FurnitureModel("bedroom", "Кровать Red Flame", "1690", "Кровать двухспальная размер 2.6м х 2.4м производство Турция, матрас набивной пружинный, кокосовая стружка. Эта удивительная кровать Red Flame станет прекрасным дополнением к вашей спальне. Ее элегантный дизайн и высокое качество материалов обеспечат вам комфортный сон и отличный отдых.", R.drawable.redflame));
        list_bedroom.add(new FurnitureModel("bedroom", "Кровать Red sunrise", "1100", " производство Италия, размер 2.6м х 2.4м Mario Fabric отделка: натуральная кожа и гобелен, набивной, специальный состав. Эта элегантная кровать Red Sunrise привнесет нотку роскоши в вашу спальню. Изысканный дизайн и первоклассные материалы обеспечат вам комфорт и уют.", R.drawable.redbed));
        list_bedroom.add(new FurnitureModel("bedroom", "Кровать Plot", "1340", " производство Италия, размер 2.2м х 2.15м Riotello отделка: хлопок и гобелен", R.drawable.bedplot));
        list_bedroom.add(new FurnitureModel("bedroom", "Кровать Parlament", "1200", " производство Италия, размер 2.2м х 2.4м Mario Fabric отделка: хлопок и атлас, набивной, специальный состав. Кровать Parlament - это прекрасный выбор для вашей спальни. Ее элегантный дизайн и высокое качество материалов обеспечат вам отличный сон и комфорт.", R.drawable.bedparlament));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_bedroom_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}