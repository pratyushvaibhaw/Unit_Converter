package com.example.unicon_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview2,textview3,textview4;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textview2=findViewById(R.id.textView2);
        textview3=findViewById(R.id.textView3);
        textview4 = findViewById(R.id.textView4);
        editText2 =findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "value displayed", Toast.LENGTH_SHORT).show();
                String s=editText2.getText().toString();
                double mt=Double.parseDouble(s);
                double in=mt*39.3701;
                double ft=mt*3.281;
                double yd=mt*1.094;
                textview2.setText(""+in+"  inches");
                textview3.setText(""+ft+" feets");
                textview4.setText(""+yd+" yards");



            }
        });


    }
}