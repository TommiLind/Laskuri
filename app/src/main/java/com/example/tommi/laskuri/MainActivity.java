package com.example.tommi.laskuri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number1, number2;
    Button multiply;


    Double result_num;
    Double num1, num2;
    Double num3 = Double.valueOf(1000);

    DecimalFormat twoDForm = new DecimalFormat("#.##");



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        multiply = (Button)findViewById(R.id.multiply);

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                try {
                    num1 = Double.parseDouble(number1.getText().toString());
                    num2 = Double.parseDouble(number2.getText().toString());
                    result_num = (num1 / num3) * (num2 / num3);
                    result.setText(String.valueOf(twoDForm.format(result_num)));
                    } catch (NumberFormatException e) {
                    num1 = 0.00;
                    num2 = 0.00;
                    Toast.makeText(MainActivity.this, "Enter a value!", Toast.LENGTH_SHORT).show();

                    }
            }
        });



    }
}
