package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker date;
    Button butn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butn = findViewById(R.id.ButtonId);
        date = findViewById(R.id.datePickid);
        text = findViewById(R.id.textId);
        text.setText(cureeentDate());
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(cureeentDate());

            }
        });

    }

    String cureeentDate() {
        StringBuilder str = new StringBuilder();
        str.append(date.getDayOfMonth() + "-");
        str.append(date.getMonth() + "-");
        str.append(date.getYear());
        return str.toString();

    }
}