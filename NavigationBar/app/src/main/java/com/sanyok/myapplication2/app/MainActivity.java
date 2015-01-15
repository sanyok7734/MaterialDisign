package com.sanyok.myapplication2.app;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private ActionBarDrawerToggle toggle;
    private DrawerLayout drawerLayout;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    public static Context context;
    public static Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        activity = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.my_drawer_layout);
        drawerLayout.setStatusBarBackgroundColor(getResources().getColor(R.color.defolt));
        drawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_close , R.string.navigation_drawer_open);


        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        //startDefaultFragment
        (findViewById(R.id.listItem)).setBackgroundResource(R.color.selectItem);
        setContent(new FragmentList());


    }

    public void onItemClick(View view) {
        defaultSelect();
        switch (view.getId()) {
            case R.id.listItem:
                (findViewById(R.id.listItem)).setBackgroundResource(R.color.selectItem);
                setContent(new FragmentList());
                break;
            case R.id.favoriteItem:
                (findViewById(R.id.favoriteItem)).setBackgroundResource(R.color.selectItem);
                setContent(new FavoriteFragment());
                break;
            case R.id.breakItem:
                (findViewById(R.id.breakItem)).setBackgroundResource(R.color.selectItem);
                break;
        }
        drawerLayout.closeDrawers();
    }



    private void defaultSelect() {
        (findViewById(R.id.listItem)).setBackgroundResource(R.color.defolt);
        (findViewById(R.id.favoriteItem)).setBackgroundResource(R.color.defolt);
        (findViewById(R.id.breakItem)).setBackgroundResource(R.color.defolt);
    }

    private void setContent(Fragment fragment) {
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }

}
