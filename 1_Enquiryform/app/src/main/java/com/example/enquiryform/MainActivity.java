package com.example.enquiryform;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Resources resources;
    ImageView img;
    TextView welcometobitcode , name , phone , email , yearospassing , collage , technology , enquiryform;
    EditText ename , ephone , eemail, eyearofpassing , ecollage , etechnology  ;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        resources = getResources();
        img = findViewById(R.id.image);
        welcometobitcode = findViewById(R.id.welcome_to_bitcode);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        yearospassing = findViewById(R.id.year_passing);
        collage = findViewById(R.id.collage);
        technology = findViewById(R.id.technology);
        enquiryform = findViewById(R.id.Enquiry_form);
        ename = findViewById(R.id.ename);
        ephone = findViewById(R.id.ephone);
        eemail = findViewById(R.id.eemail);
        eyearofpassing = findViewById(R.id.eyear_passing);
        ecollage = findViewById(R.id.ecollage);
        etechnology = findViewById(R.id.etechnoloy);
        btn = findViewById(R.id.Button);

    }
}