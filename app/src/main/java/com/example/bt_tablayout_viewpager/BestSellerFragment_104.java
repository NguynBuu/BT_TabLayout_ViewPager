package com.example.bt_tablayout_viewpager;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class BestSellerFragment_104 extends Fragment {

    private RecyclerView recyclerView_104;
    private FlowerAdapter_104 adapter_104;
    private List<FlowerModel_104> flowerList_104;

    public BestSellerFragment_104() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view_104 = inflater.inflate(R.layout.fragment_flower_list, container, false);

        recyclerView_104 = view_104.findViewById(R.id.recyclerView_104);
        recyclerView_104.setLayoutManager(new LinearLayoutManager(getContext()));
        flowerList_104 = new ArrayList<>();
        flowerList_104.add(new FlowerModel_104("Bó Hồng Đỏ", "450,000đ", "rose_red"));
        flowerList_104.add(new FlowerModel_104("Hoa Tulip Hồng", "320,000đ", "tulip_pink"));
        flowerList_104.add(new FlowerModel_104("Giỏ Lan Trắng", "800,000đ", "orchid_white"));

        adapter_104 = new FlowerAdapter_104(getContext(), flowerList_104, R.layout.item_flower_linear);
        recyclerView_104.setAdapter(adapter_104);

        return view_104;
    }
}