package com.example.bt_tablayout_viewpager;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class NewArrivalFragment_104 extends Fragment {

    private RecyclerView recyclerView_104;
    private FlowerAdapter_104 adapter_104;
    private List<FlowerModel_104> flowerList_104;

    public NewArrivalFragment_104() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view_104 = inflater.inflate(R.layout.fragment_flower_list, container, false);

        recyclerView_104 = view_104.findViewById(R.id.recyclerView_104);

        recyclerView_104.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        flowerList_104 = new ArrayList<>();
        flowerList_104.add(new FlowerModel_104("Sen Đá Viền Hồng", "95,000đ", "succulent_pink"));
        flowerList_104.add(new FlowerModel_104("Hoa Mẫu Đơn Đỏ", "600,000đ", "peony_red"));
        flowerList_104.add(new FlowerModel_104("Hoa Ly Vàng", "350,000đ", "lily_yellow"));

        adapter_104 = new FlowerAdapter_104(getContext(), flowerList_104, R.layout.item_flower_grid);
        recyclerView_104.setAdapter(adapter_104);

        return view_104;
    }
}