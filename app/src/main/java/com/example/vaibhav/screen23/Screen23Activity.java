package com.example.vaibhav.screen23;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.Tab_adapter1;
import adapter.TshirtAdapter;
import me.relex.circleindicator.CircleIndicator;
import model.TshirtModel;

public class Screen23Activity extends AppCompatActivity {

    TextView texta;

    private ViewPager viewPager1;
    private CircleIndicator circleIndicator;
    private Tab_adapter1 viewPagerAdapter;

    private RecyclerView recyclerView;
    private ArrayList<TshirtModel> tshirtModel;
    private TshirtAdapter tshirtAdapter;

    Integer tshirt[] = {R.drawable.tshirt1, R.drawable.boy1, R.drawable.giral1,R.drawable.boy2,
            R.drawable.tshirt1, R.drawable.boy1, R.drawable.giral1,R.drawable.boy2};
    String tv1[] = {"$ 349","$ 379","$ 349","379","$ 349","$ 379","$ 349","379"};
    String tv2[] = {"Neck T-Shirt", "Neck T-Shirt", "Neck T-Shirt","Neck T-Shirt", "Neck T-Shirt", "Neck T-Shirt",
            "Neck T-Shirt", "Neck T-Shirt"};
    String tv3[] = {"Aqua Blue","Only Black","Aqua Blue","Aqua Blue","Only Black","Aqua Blue",
            "Aqua Blue","Only Black"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen23);

        texta = findViewById(R.id.toolbar_text);
        texta.setText("Shop");

        //1st viewpager

        viewPager1 = (ViewPager) findViewById(R.id.vp1);
        circleIndicator = (CircleIndicator) findViewById(R.id.circleindicator);

        viewPagerAdapter = new Tab_adapter1(getSupportFragmentManager());
        viewPager1.setAdapter(viewPagerAdapter);
        circleIndicator.setViewPager(viewPager1);
        viewPagerAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());

        //recycler code
        recyclerView = findViewById(R.id.shope);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Screen23Activity.this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        tshirtModel = new ArrayList<>();

        for (int i = 0; i < tshirt.length; i++) {
            TshirtModel ab = new TshirtModel(tshirt[i],tv1[i],tv2[i],tv3[i]);
            tshirtModel.add(ab);
        }
        tshirtAdapter = new TshirtAdapter(Screen23Activity.this, tshirtModel);
        recyclerView.setAdapter(tshirtAdapter);
    }
}