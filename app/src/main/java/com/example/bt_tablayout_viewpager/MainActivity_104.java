package com.example.bt_tablayout_viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity_104 extends AppCompatActivity {

    private TabLayout tabLayout_104;
    private ViewPager2 viewPager_104;
    private ViewPagerAdapter_104 adapter_104;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout_104 = findViewById(R.id.tabLayout_104);
        viewPager_104 = findViewById(R.id.viewPager_104);

        adapter_104 = new ViewPagerAdapter_104(this);
        viewPager_104.setAdapter(adapter_104);

        new TabLayoutMediator(tabLayout_104, viewPager_104,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Hoa Bán Chạy");
                            break;
                        case 1:
                            tab.setText("Hoa Giá Tốt");
                            break;
                        case 2:
                            tab.setText("Hoa Mới");
                            break;
                    }
                }
        ).attach();
    }
}