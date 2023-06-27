package com.example.fragment_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fragment_layout.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
           ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Pager_Adapter adapter=new Pager_Adapter(getSupportFragmentManager());
        ViewPager viewPager=binding.viewPager;

        adapter.addFragment(new One_Fragment(),"Tab-1");
        adapter.addFragment(new Two_Fragment(),"Tab-2");
        adapter.addFragment(new Three_Fragment(),"Tab-3");
        viewPager.setAdapter(adapter);
        TabLayout tabs=binding.tabs;
        tabs.setupWithViewPager(viewPager);

    }
}