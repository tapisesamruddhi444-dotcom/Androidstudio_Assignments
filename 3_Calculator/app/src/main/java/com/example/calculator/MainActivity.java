package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtDisplay;

    String firstNumber = "";
    String secondNumber = "";
    String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDisplay = findViewById(R.id.txtDisplay);

        int[] numberIds = {
                R.id.btn0, R.id.btn1, R.id.btn2,
                R.id.btn3, R.id.btn4, R.id.btn5,
                R.id.btn6, R.id.btn7, R.id.btn8,
                R.id.btn9
        };

        for (int id : numberIds) {
            Button btn = findViewById(id);

            btn.setOnClickListener(v -> {
                Button b = (Button) v;

                if (operator.isEmpty()) {
                    firstNumber += b.getText().toString();
                    txtDisplay.setText(firstNumber);
                } else {
                    secondNumber += b.getText().toString();
                    txtDisplay.setText(firstNumber + operator + secondNumber);
                }
            });
        }

        findViewById(R.id.btnPlus)
                .setOnClickListener(v -> operator = "+");

        findViewById(R.id.btnMinus)
                .setOnClickListener(v -> operator = "-");

        findViewById(R.id.btnMultiply)
                .setOnClickListener(v -> operator = "*");

        findViewById(R.id.btnDivide)
                .setOnClickListener(v -> operator = "/");

        findViewById(R.id.btnC)
                .setOnClickListener(v -> {
                    firstNumber = "";
                    secondNumber = "";
                    operator = "";
                    txtDisplay.setText("0");
                });

        findViewById(R.id.btnEqual)
                .setOnClickListener(v -> calculate());
    }

    private void calculate() {

        if (firstNumber.isEmpty() || secondNumber.isEmpty())
            return;

        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                result = num1 / num2;
                break;
        }

        txtDisplay.setText(String.valueOf(result));

        firstNumber = String.valueOf(result);
        secondNumber = "";
        operator = "";
    }
}