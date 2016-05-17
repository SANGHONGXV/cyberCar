package com.fat246.cybercar.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.fat246.cybercar.R;
import com.fat246.cybercar.fragments.MyOrdersFragment;

public class MyOrdersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);

        initToolbar();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_my_orders_container, MyOrdersFragment.newInstance()).commit();
    }

    //initToolbar
    private void initToolbar() {

        View rootView = findViewById(R.id.activity_my_orders_toolbar);

        if (rootView != null) {

            Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);

            setSupportActionBar(toolbar);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    MyOrdersActivity.this.finish();
                }
            });
        }
    }
}