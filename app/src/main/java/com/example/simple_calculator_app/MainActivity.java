package com.example.simple_calculator_app;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    ImageView btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    ImageView btn_dot, btn_equal, btn_ac, btn_divide, btn_plus, btn_minus, btn_multiplication,btn_start_bracket,btn_end_bracket;

    TextView inputTxt, outPuttxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outPuttxt = findViewById(R.id.outPuttxt);
        inputTxt = findViewById(R.id.inputTxt);

        btn_0 = findViewById(R.id.image_btn_0);
        btn_1 = findViewById(R.id.image_btn_1);
        btn_2 = findViewById(R.id.image_btn_2);
        btn_3 = findViewById(R.id.image_btn_3);
        btn_4 = findViewById(R.id.image_btn_4);
        btn_5 = findViewById(R.id.image_btn_5);
        btn_6 = findViewById(R.id.image_btn_6);
        btn_7 = findViewById(R.id.image_btn_7);
        btn_8 = findViewById(R.id.image_btn_8);
        btn_9 = findViewById(R.id.image_btn_9);

        btn_dot = findViewById(R.id.image_btn_dot);
        btn_equal = findViewById(R.id.image_btn_equal);
        btn_ac = findViewById(R.id.image_btn_ac);
        btn_start_bracket = findViewById(R.id.image_btn_start_bracket);
        btn_end_bracket = findViewById(R.id.image_btn_end_bracket);
        btn_divide = findViewById(R.id.image_btn_divide);
        btn_plus = findViewById(R.id.image_btn_plus);
        btn_minus = findViewById(R.id.image_btn_minus);
        btn_multiplication = findViewById(R.id.image_btn_multiplication);
    }

    public void fun_0(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "0");
    }

    public void fun_1(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "1");
    }

    public void fun_2(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "2");
    }

    public void fun_3(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "3");
    }

    public void fun_4(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "4");
    }

    public void fun_5(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "5");
    }

    public void fun_6(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "6");
    }

    public void fun_7(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "7");
    }

    public void fun_8(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "8");
    }

    public void fun_9(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "9");
    }

    public void plus_fun(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "+");
    }

    public void minus_fun(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "-");
    }

    public void multiplication_fun(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "x");
    }

    public void divide_fun(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "/");
    }

    public void dot_fun(View view) {
        inputTxt.setText(inputTxt.getText().toString() + ".");
    }

    public void start_bracket_fun(View view) {
        inputTxt.setText(inputTxt.getText().toString() + "(");
    }

    public void end_bracket_fun(View view) {
        inputTxt.setText(inputTxt.getText().toString() + ")");
    }

    public void ac_fun(View view) {
        inputTxt.setText("");
        outPuttxt.setText("");
    }

    public void equal_fun(View view) {

    }
}