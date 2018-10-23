package com.ricardogwill.mxparsertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expressionString = "(12+3)-5*2";
                Expression expression = new Expression(expressionString);
                String result = String.valueOf(expression.calculate());
                textview.setText(result);
            }
        });

    }
}
