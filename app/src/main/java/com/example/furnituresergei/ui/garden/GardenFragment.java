package com.example.furnituresergei.ui.garden;

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
import com.example.furnituresergei.databinding.FragmentGardenBinding;
import com.example.furnituresergei.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class GardenFragment extends Fragment {

    private FragmentGardenBinding binding;
    List<FurnitureModel> list_garden = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

//        GardenViewModel gardenViewModel = new ViewModelProvider(this).get(GardenViewModel.class);

        binding = FragmentGardenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter(false);
        adapter.setList_m(list_garden);
        binding.rvGarden.setAdapter(adapter);

        return root;
    }

    private void createList() {
        list_garden.add(new FurnitureModel("garden", "Садовый стол", "500", "Прочный садовый стол с пластиковой поверхностью. Этот стол идеально подойдет для вашего сада или террасы, обеспечивая удобное место для отдыха и приема пищи на свежем воздухе.", R.drawable.garden_table));
        list_garden.add(new FurnitureModel("garden", "Садовый стул", "250", "Удобный стул с мягкими подушками для сидения. Этот стул обеспечит вам комфортное и приятное времяпрепровождение в саду, позволяя насладиться красотой природы.", R.drawable.garden_chair));
        list_garden.add(new FurnitureModel("garden", "Садовая скамейка", "700", "Деревянная скамейка с устойчивой конструкцией. Эта скамейка станет прекрасным дополнением к вашему саду, создавая уютное место для отдыха и общения с друзьями и семьей.", R.drawable.garden_bench));
        list_garden.add(new FurnitureModel("garden", "Садовые качели", "1000", "Красивые качели для отдыха в саду. Эти качели помогут вам расслабиться и насладиться атмосферой вашего сада, предоставляя приятное место для отдыха и размышлений.", R.drawable.garden_swing));
        list_garden.add(new FurnitureModel("garden", "Садовый зонтик", "300", "Зонтик для создания тени во время жаркого дня. Этот зонтик защитит вас от солнечных лучей и обеспечит прохладу и комфорт во время отдыха на свежем воздухе.", R.drawable.garden_umbrella));
        list_garden.add(new FurnitureModel("garden", "Садовый гриль", "800", "Гриль для приготовления еды на свежем воздухе. Этот садовый гриль станет незаменимым помощником в организации пикников и вечеринок на природе, обеспечивая вам вкусные и ароматные блюда.", R.drawable.garden_grill));
        list_garden.add(new FurnitureModel("garden", "Садовый шезлонг", "400", "Удобный шезлонг для загара. Этот шезлонг позволит вам расслабиться и насладиться солнечным теплом, обеспечивая приятный и комфортный отдых в вашем саду или на террасе.", R.drawable.garden_lounger));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_garden_to_navigation_home);

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}