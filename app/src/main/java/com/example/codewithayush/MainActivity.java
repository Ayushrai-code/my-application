package com.example.codewithayush;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = (Button) findViewById(R.id.button);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                EditText textBoxMiles = (EditText) findViewById(R.id.editText2);
                EditText textBoxKM = (EditText) findViewById(R.id.editText3);
                double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                double vKM = vMiles / 0.62137 ;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKM.setText(formatVal.format(vKM));

            }
        });
        Button buttonConvKMtoMiles = (Button) findViewById(R.id.button2);
        buttonConvKMtoMiles.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                EditText textBoxMiles = (EditText) findViewById(R.id.editText2);
                EditText textBoxKM = (EditText) findViewById(R.id.editText3);
                double vKM = Double.valueOf(textBoxKM.getText().toString());
                double vMiles = vKM * 0.62137 ;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMiles));

            }
        });
    }
}
