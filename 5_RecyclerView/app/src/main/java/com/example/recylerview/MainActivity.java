package com.example.recylerview;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtMain;
    Button btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMain = findViewById(R.id.edtMain);
        btnDialog = findViewById(R.id.btnDialog);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog_layout);

                EditText edtDialog =
                        dialog.findViewById(R.id.edtDialog);

                RadioButton rbUpper =
                        dialog.findViewById(R.id.rbUpper);

                RadioButton rbLower =
                        dialog.findViewById(R.id.rbLower);

                RadioButton rbReverse =
                        dialog.findViewById(R.id.rbReverse);

                Button btnOk =
                        dialog.findViewById(R.id.btnOk);

                edtDialog.setText(
                        edtMain.getText().toString()
                );

                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String text =
                                edtDialog.getText().toString();

                        if (rbUpper.isChecked()) {
                            edtMain.setText(
                                    text.toUpperCase()
                            );
                        }
                        else if (rbLower.isChecked()) {
                            edtMain.setText(
                                    text.toLowerCase()
                            );
                        }
                        else if (rbReverse.isChecked()) {
                            String rev =
                                    new StringBuilder(text)
                                            .reverse()
                                            .toString();

                            edtMain.setText(rev);
                        }

                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }
}