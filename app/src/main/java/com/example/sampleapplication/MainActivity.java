package com.example.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Color;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et = findViewById(R.id.et1);
        Button bt = findViewById(R.id.btn);
        TextView tv = findViewById(R.id.tv1);
        //TextView tv2 = findViewById(R.id.tv2);



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = et.getText().toString();
                float kilos = Float.parseFloat(value);
                float pound = (float) (kilos * 2.20462);

                tv.setText(""+ pound);
            }
        });

    }
}
