package com.example.bookshelf;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DrawableUtils;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private Toolbar toolbar;
    private NavigationView mNavigationView;
    private ActionBarDrawerToggle toggle;

    private DrawerLayout drawer_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.toolbar);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("BookShelf");//设置toolbar 标题
        toolbar.inflateMenu(R.menu.app_bar_menu);
        //菜单点击监听器
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if(item.getItemId()==R.id.action_bar_title){
                    Toast.makeText(getApplication(),"this is title ",Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });



        drawer_layout=(DrawerLayout)findViewById(R.id.drawer_layout);
        toggle =new ActionBarDrawerToggle(this,drawer_layout,toolbar,R.string.open,R.string.close);
        drawer_layout.addDrawerListener(toggle);
        toggle.syncState();

        mNavigationView=(NavigationView)findViewById(R.id.nav_view);

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_camera:
                        Toast.makeText(getApplication(),"实例1 ",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_gallery:
                        Toast.makeText(getApplication(),"实例2 ",Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

    }

}
