package com.example.furnituresergei.ui.hall;

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
import com.example.furnituresergei.databinding.FragmentHallBinding;
import com.example.furnituresergei.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class HallFragment extends Fragment {

    private FragmentHallBinding binding;
    List<FurnitureModel> list_hall = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        NotificationsViewModel notificationsViewModel = new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentHallBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter(false);
        adapter.setList_m(list_hall);
        binding.rvHallRoom.setAdapter(adapter);

        return root;
    }

    private void createList() {
        list_hall.add(new FurnitureModel("hall", "Диван 'Уютный уголок'", "1200", "Комфортный диван с мягкими подушками для приятного отдыха в гостиной. Этот диван станет идеальным местом для отдыха после трудового дня, обеспечивая вам уют и комфорт.", R.drawable.sofa));
        list_hall.add(new FurnitureModel("hall", "Журнальный столик", "300", "Столик из натурального дерева с удобной полочкой для хранения журналов и книг. Этот столик станет стильным и функциональным дополнением к вашей гостиной, обеспечивая удобство и практичность.", R.drawable.hall_table));
        list_hall.add(new FurnitureModel("hall", "Тумба для ТВ", "400", "Современная тумба для телевизора с открытой и закрытой полкой. Эта тумба идеально подойдет для размещения телевизора и другой аудио-видео аппаратуры, обеспечивая вам удобство и функциональность.", R.drawable.hall_tv_stand));
        list_hall.add(new FurnitureModel("hall", "Книжная полка", "250", "Надежная книжная полка для хранения книг и декоративных предметов. Эта полка поможет вам организовать пространство в гостиной и создать уютную атмосферу, обеспечивая удобство и функциональность.", R.drawable.hall_bookshelf));
        list_hall.add(new FurnitureModel("hall", "Кресло 'Релакс'", "500", "Уютное кресло с мягкими подлокотниками для комфортного отдыха после рабочего дня. Это кресло станет вашим любимым местом для отдыха, обеспечивая вам комфорт и расслабление.", R.drawable.hall_armchair));
        list_hall.add(new FurnitureModel("hall", "Стенка 'Модерн'", "1500", "Современная стенка с большим количеством полок и ящиков для хранения вещей. Эта стенка поможет вам организовать пространство в гостиной, обеспечивая удобство и функциональность.", R.drawable.hall_wall_unit));
        list_hall.add(new FurnitureModel("hall", "Ковер 'Абстракция'", "200", "Ковер с абстрактным узором, который придаст гостиной особый стиль. Этот ковер станет элегантным и стильным аксессуаром, добавляя в интерьер гостиной нотку индивидуальности и уюта.", R.drawable.hall_carpet));
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_hall_to_navigation_home);

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}