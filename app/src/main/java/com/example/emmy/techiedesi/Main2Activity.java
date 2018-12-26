package com.example.emmy.techiedesi;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.Toolbar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
     NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setUpToolbar();
        navigationView =findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
     switch (Item.getItemId()){
         case R.id.Nav_home:
             Toast.makeText(Main2Activity.this,"Clickedd Home",Toast.LENGTH_SHORT).show();
             break;
         case R.id.Nav_profile:
             Toast.makeText(Main2Activity.this,"Clickedd profile",Toast.LENGTH_SHORT).show();
             break;

     }
                return false;

            }


        });
    }
    private void setUpToolbar()
    {
 drawerLayout=(DrawerLayout) findViewById(R.id.drawerwlayout);
 toolbar = findViewById(R.id.toolbar);
 setSupportActionBar(toolbar);
 actionBarDrawerToggle =new android.support.v7.app.ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
 drawerLayout.addDrawerListener(actionBarDrawerToggle);
 actionBarDrawerToggle.syncState();
    }

}
