package com.example.yum;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class DirectoryLocation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private NavigationView mainNavView;
    private View mainNavHeader;
    private ImageView mainIcon;
    private DrawerLayout mainDrawer;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory_location);
        mainNavView = findViewById(R.id.main_nav_view);
        mainNavHeader = mainNavView.getHeaderView(0);
        startAnimation();

        mainDrawer = findViewById(R.id.main_drawer);
        toolbar = findViewById(R.id.toolbar);

//        mainDrawer.closeDrawer(GravityCompat.START);
//        mainDrawer.close();
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mainDrawer, toolbar, R.string.app_name, R.string.app_name);
        mainDrawer.addDrawerListener(toggle);
        toggle.syncState();
        toggle.getDrawerArrowDrawable().setColor(getColor(R.color.white));
        mainNavView.bringToFront();
        mainNavView.setCheckedItem(R.id.location_op);

        mainNavView.setNavigationItemSelectedListener(this);


    }


    public void onBackPressed(){
        Toast.makeText(getApplicationContext(), " Press Back again to Exit ", Toast.LENGTH_SHORT).show();
        if (mainDrawer.isDrawerOpen(GravityCompat.START)){
            Toast.makeText(getApplicationContext(), " Press Back again to Exit ", Toast.LENGTH_SHORT).show();
            mainDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    private void startAnimation() {
        AnimationDrawable mainNavAnimation = (AnimationDrawable) mainNavHeader.getBackground();
        mainNavAnimation.setEnterFadeDuration(1000);
        mainNavAnimation.setExitFadeDuration(3000);
        mainNavAnimation.start();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.cuisine_op:
                Intent anIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(anIntent);
                mainDrawer.closeDrawers();
                break;
        }
        return true;
    }


}