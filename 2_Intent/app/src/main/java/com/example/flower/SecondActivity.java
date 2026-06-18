package com.example.flower;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity  extends AppCompatActivity {

    Resources resources;
    TextView selecttext;
    ImageView img1,img2,img3,img4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initviews();
    }
    public void initviews(){
        resources = getResources();
        selecttext = findViewById(R.id.selectText);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

        Intent i = getIntent();
        int imgid = i.getIntExtra("flower1",0);
        img1.setImageResource(imgid);

        int imgid1 = i.getIntExtra("flower2",0);
        img2.setImageResource(imgid1);

        int imgid2 = i.getIntExtra("flower3",0);
        img3.setImageResource(imgid2);

        int imgid3 = i.getIntExtra("flower4",0);
        img4.setImageResource(imgid3);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("img1",imgid);
                setResult(1,intent);
                finish();
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("img1",imgid1);
                setResult(1,intent);
                finish();
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("img1",imgid2);
                setResult(1,intent);
                finish();
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("img1",imgid3);
                setResult(1,intent);
                finish();
            }
        });






    }




}