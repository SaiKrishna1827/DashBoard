package com.sample.dashboard;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    BottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Sample Dashboard");

        bottomBar = (BottomBar) findViewById(R.id.bottomBar);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {


                final android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

                if (tabId == R.id.desk) {
                    //fragNavController.switchTab(TAB_FIRST);

                    if(fragmentManager.findFragmentByTag("0") != null) {
                        //if the fragment exists, show it.
                        String backStateName = new Desk().getClass().getName();
                        fragmentManager.beginTransaction().show(fragmentManager.findFragmentByTag("0")).commit();
                    } else {
                        //if the fragment does not exist, add it to fragment manager.
                        // fragmentManager.beginTransaction().add(R.id.layout, new Desk(), "one").commit();
                        String backStateName = new Desk().getClass().getName();
                        fragmentManager.beginTransaction().add(R.id.layout, new Desk(), "0").commit();
                    }
                    if(fragmentManager.findFragmentByTag("1") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("1")).commit();
                    }
                    if(fragmentManager.findFragmentByTag("2") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("2")).commit();
                    }
                    if(fragmentManager.findFragmentByTag("3") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("3")).commit();
                    }


                } else if (tabId == R.id.progress) {
                    //fragNavController.switchTab(TAB_SECOND);
                    fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("0")).commit();

                    if(fragmentManager.findFragmentByTag("1") != null) {
                        //if the fragment exists, show it.
                        String backStateName = new Progress().getClass().getName();
                        fragmentManager.beginTransaction().show(fragmentManager.findFragmentByTag("1")).commit();
                    } else {
                        //if the fragment does not exist, add it to fragment manager.
                        String backStateName = new Progress().getClass().getName();
                        fragmentManager.beginTransaction().add(R.id.layout, new Progress(), "1").commit();
                    }
                    if(fragmentManager.findFragmentByTag("0") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("0")).commit();
                    }
                    if(fragmentManager.findFragmentByTag("2") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("2")).commit();
                    }
                    if(fragmentManager.findFragmentByTag("3") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("3")).commit();
                    }

                } else if (tabId == R.id.performance) {
                    //fragNavController.switchTab(TAB_THIRD);

                    fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("0")).commit();

                    if(fragmentManager.findFragmentByTag("2") != null) {
                        //if the fragment exists, show it.
                        String backStateName = new Performance().getClass().getName();
                        fragmentManager.beginTransaction().show(fragmentManager.findFragmentByTag("2")).commit();
                    } else {
                        //if the fragment does not exist, add it to fragment manager.
                        String backStateName = new Performance().getClass().getName();
                        fragmentManager.beginTransaction().add(R.id.layout, new Performance(), "2").commit();
                    }
                    if(fragmentManager.findFragmentByTag("0") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("0")).commit();
                    }
                    if(fragmentManager.findFragmentByTag("1") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("1")).commit();
                    }
                    if(fragmentManager.findFragmentByTag("3") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("3")).commit();
                    }

                }else if (tabId == R.id.test_results) {
                    // fragNavController.switchTab(TAB_FOURTH);

                    fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("0")).commit();

                    if(fragmentManager.findFragmentByTag("3") != null) {
                        //if the fragment exists, show it.
                        String backStateName = new TestResults().getClass().getName();
                        fragmentManager.beginTransaction().show(fragmentManager.findFragmentByTag("3")).commit();
                    } else {
                        //if the fragment does not exist, add it to fragment manager.
                        String backStateName = new TestResults().getClass().getName();
                        fragmentManager.beginTransaction().add(R.id.layout, new TestResults(), "3").commit();
                    }
                    if(fragmentManager.findFragmentByTag("0") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("0")).commit();
                    }
                    if(fragmentManager.findFragmentByTag("1") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("1")).commit();
                    }
                    if(fragmentManager.findFragmentByTag("2") != null){
                        //if the other fragment is visible, hide it.
                        fragmentManager.beginTransaction().hide(fragmentManager.findFragmentByTag("2")).commit();
                    }

                }
            }
        });
    }
}
