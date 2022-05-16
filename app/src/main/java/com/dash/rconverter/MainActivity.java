package com.dash.rconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    private EditText input;
    private TextView output;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.input);
        output=findViewById(R.id.output);
        submit=findViewById(R.id.submit);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String input_value = input.getText().toString();
                    if(!input_value.equals("")) {
                        double value_in_Kg = Double.parseDouble(input_value);
                        double value_in_Pound = 2.205 * value_in_Kg;
                        output.setText(value_in_Pound + " Pound");
                    }else{
                        output.setText("Please enter a valid input value");
                    }
                }
            });
    }
}
