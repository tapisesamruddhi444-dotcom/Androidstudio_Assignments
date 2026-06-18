package com.example.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class AddContactDialog extends Dialog
{
    EditText edtName;
    EditText edtPhone;

    Button btnSave;
    Button btnCancel;

    OnContactAddedListener listener;
    public interface OnContactAddedListener
    {
        void onContactAdded(String name, String phone);
    }

    public AddContactDialog(
            @NonNull Context context,
            OnContactAddedListener listener)
    {
        super(context);

        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dialog_add_contact);

        edtName = findViewById(R.id.edtName);
        edtPhone = findViewById(R.id.edtPhone);

        btnSave = findViewById(R.id.btnSave);
        btnCancel = findViewById(R.id.btnCancel);

        btnSave.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String name;
                String phone;

                name = edtName.getText().toString();
                phone = edtPhone.getText().toString();

                if(name.isEmpty() || phone.isEmpty())
                {
                    Toast.makeText(
                            getContext(),
                            "Enter all fields",
                            Toast.LENGTH_SHORT
                    ).show();

                    return;
                }

                listener.onContactAdded(name, phone);

                dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                dismiss();
            }
        });
    }
}
