package com.example.flower;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Resources resources;
    ImageView imgmain;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    TextView welcome_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initViews();
        attachListener();

    }

    public void initViews() {
        resources = getResources();
        imgmain = findViewById(R.id.backimg);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        welcome_txt = findViewById(R.id.welcome_txt);
    }

    public void attachListener() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("flower1", R.drawable.rose1);
                intent.putExtra("flower2", R.drawable.rose2);
                intent.putExtra("flower3", R.drawable.rose3);
                intent.putExtra("flower4", R.drawable.rose4);
                startActivityForResult(intent, 1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("flower1", R.drawable.lily1);
                intent.putExtra("flower2", R.drawable.lily2);
                intent.putExtra("flower3", R.drawable.lily3);
                intent.putExtra("flower4", R.drawable.lily4);
                startActivityForResult(intent, 1);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("flower1", R.drawable.tulip1);
                intent.putExtra("flower2", R.drawable.tulip2);
                intent.putExtra("flower3", R.drawable.tulip3);
                intent.putExtra("flower4", R.drawable.tulip4);
                startActivityForResult(intent, 1);           }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("flower1", R.drawable.lotus1);
                intent.putExtra("flower2", R.drawable.lotus2);
                intent.putExtra("flower3", R.drawable.lotus3);
                intent.putExtra("flower4", R.drawable.lotus4);
                startActivityForResult(intent, 1);
            }
        });




    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1 && resultCode == 1){
            int selectedImage =
                    data.getIntExtra("img1",0);
            imgmain.setImageResource(selectedImage);
            welcome_txt.setText("Love for flowers");

        }

        if(requestCode == 1 && resultCode == 2){
            int selectedImage =
                    data.getIntExtra("img2",0);
            imgmain.setImageResource(selectedImage);
            welcome_txt.setText("Love for flowers");
        }

        if(requestCode == 1 && resultCode == 3){
            int selectedImage =
                    data.getIntExtra("img3",0);
            imgmain.setImageResource(selectedImage);
            welcome_txt.setText("Love for flowers");
        }

        if(requestCode == 1 && resultCode == 4){
            int selectedImage =
                    data.getIntExtra("img4",0);
            imgmain.setImageResource(selectedImage);
            welcome_txt.setText("Love for flowers");
        }
    }
}