package com.example.boss.dd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView result;
    Button buttonclick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=(TextView) findViewById(R.id.result);
        buttonclick=(Button) findViewById(R.id.buttonclick);
        buttonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String g="Random Text";
                result.setText(g);
            }
        });
    }
}
