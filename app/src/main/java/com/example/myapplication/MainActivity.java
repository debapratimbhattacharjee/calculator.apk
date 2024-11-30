package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private String currentInput = "";
    private double firstOperand = 0.0;
    private double secondOperand = 0.0;
    private String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);

        // Set up the number buttons (0-9)
        findViewById(R.id.button0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "0";
                resultTextView.setText(currentInput);
            }
        });

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "1";
                resultTextView.setText(currentInput);
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "2";
                resultTextView.setText(currentInput);
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "3";
                resultTextView.setText(currentInput);
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "4";
                resultTextView.setText(currentInput);
            }
        });

        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "5";
                resultTextView.setText(currentInput);
            }
        });

        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "6";
                resultTextView.setText(currentInput);
            }
        });

        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "7";
                resultTextView.setText(currentInput);
            }
        });

        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "8";
                resultTextView.setText(currentInput);
            }
        });

        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "9";
                resultTextView.setText(currentInput);
            }
        });

        // Set up operator buttons
        findViewById(R.id.buttonAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstOperand = Double.parseDouble(currentInput);
                operator = "+";
                currentInput = "";
            }
        });

        findViewById(R.id.buttonSubtract).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstOperand = Double.parseDouble(currentInput);
                operator = "-";
                currentInput = "";
            }
        });

        findViewById(R.id.buttonMultiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstOperand = Double.parseDouble(currentInput);
                operator = "*";
                currentInput = "";
            }
        });

        findViewById(R.id.buttonDivide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstOperand = Double.parseDouble(currentInput);
                operator = "/";
                currentInput = "";
            }
        });

        // Handle equals button to perform calculation
        findViewById(R.id.buttonEquals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondOperand = Double.parseDouble(currentInput);
                double result = 0.0;
                switch (operator) {
                    case "+":
                        result = firstOperand + secondOperand;
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        break;
                    case "/":
                        if (secondOperand != 0) {
                            result = firstOperand / secondOperand;
                        } else {
                            resultTextView.setText("Error");
                            return;
                        }
                        break;
                }
                resultTextView.setText(String.valueOf(result));
                currentInput = String.valueOf(result);
            }
        });

        // Handle clear button
        findViewById(R.id.buttonClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput = "";
                resultTextView.setText("0");
            }
        });
    }
}
