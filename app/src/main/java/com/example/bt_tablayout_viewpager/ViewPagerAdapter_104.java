package com.example.bt_tablayout_viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter_104 extends FragmentStateAdapter {

    public ViewPagerAdapter_104(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new BestSellerFragment_104();
            case 1:
                return new GoodPriceFragment_104();
            case 2:
                return new NewArrivalFragment_104();
            default:
                return new BestSellerFragment_104();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}