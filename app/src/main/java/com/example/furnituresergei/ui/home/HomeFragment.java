package com.example.furnituresergei.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.example.furnituresergei.R;
import com.example.furnituresergei.databinding.FragmentHomeBinding;
import com.example.furnituresergei.models.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    List<CategoryModel> list_category = new ArrayList<>();
    CategoryAdapter adapter;
    LottieAnimationView lotty_sale, lotty_advertising;
    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();

        // Создание адаптера и установка списка в RecyclerView
        adapter = new CategoryAdapter();
        adapter.setMain_list(list_category);
        binding.rvCatalogCategory.setAdapter(adapter);

        lotty_advertising = binding.lottyAdvertising;
        lotty_advertising.setAnimation(R.raw.roomanim);

        lotty_sale = binding.lottySale;
        lotty_sale.setAnimation(R.raw.sale);
        lotty_sale.setRepeatCount(LottieDrawable.INFINITE);

        return root;
    }

    private void createList() {
        list_category.add(new CategoryModel("Мебель для спальни", R.drawable.bedroom));
        list_category.add(new CategoryModel("Мебель для гостинной", R.drawable.hall));
        list_category.add(new CategoryModel("Кухонная мебель", R.drawable.kitchen));
        list_category.add(new CategoryModel("Юношеские гарнитуры", R.drawable.youth));
        list_category.add(new CategoryModel("Садовая мебель", R.drawable.gardenn));
        list_category.add(new CategoryModel("Мебель для прихожей", R.drawable.hallway));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.saleCardView.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_home_to_saleFragment);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}