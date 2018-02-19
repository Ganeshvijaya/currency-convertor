package com.example.ganesh.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    public void convertfunction(View view){
        EditText e1=(EditText)findViewById(R.id.dollar);
        TextView e2=(TextView) findViewById(R.id.result);

        String dolar=e1.getText().toString();
        double d=Integer.parseInt(dolar);
        double rs=d*60;
        e2.setText("Rs."+rs);




    }
    public void convert(View view){
        EditText e1=(EditText)findViewById(R.id.rupees);
        TextView e2=(TextView) findViewById(R.id.result1);

        String rupee=e1.getText().toString();
        double d=Integer.parseInt(rupee);
        double rs=d/60;
        e2.setText("$"+rs);




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
