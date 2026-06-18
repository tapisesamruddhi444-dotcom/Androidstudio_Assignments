package com.example.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
        implements AddContactDialog.OnContactAddedListener
{
    Button btnAddContact;

    TextView txtContact;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnAddContact = findViewById(R.id.btnAddContact);

        txtContact = findViewById(R.id.txtContact);

        btnAddContact.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        AddContactDialog dialog;

                        dialog = new AddContactDialog(
                                MainActivity.this,
                                MainActivity.this
                        );

                        dialog.show();
                    }
                });
    }

    @Override
    public void onContactAdded(
            String name,
            String phone)
    {
        txtContact.setText(
                "Name : " + name +
                        "\nPhone : " + phone
        );
    }
}