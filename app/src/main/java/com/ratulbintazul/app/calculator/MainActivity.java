package com.ratulbintazul.app.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

        result = findViewById(R.id.res);
    }

    public void add(View v) {

        String stringEdittext1 = et1.getText().toString(); //Getting the text from EditText 1
        float numberEdittext1 = Float.parseFloat(stringEdittext1); //Converting it to float

        String stringEdittext2 = et2.getText().toString(); //Getting the text from EditText 2
        float numberEdittext2 = Float.parseFloat(stringEdittext2); //Converting it to float

        float calculationResult = numberEdittext1 + numberEdittext2; //Adding the 2 floats
        result.setText("Result is "+calculationResult); //showing the result in res Textview

        Toast.makeText(MainActivity.this,"Result is "+result,Toast.LENGTH_SHORT).show();
    }
    public void sub(View v) {

        String stringEdittext1 = et1.getText().toString();
        float numberEdittext1 = Float.parseFloat(stringEdittext1);

        String stringEdittext2 = et2.getText().toString();
        float numberEdittext2 = Float.parseFloat(stringEdittext2);

        float calculationResult = numberEdittext1 - numberEdittext2;
        result.setText("Result is "+calculationResult);

        Toast.makeText(MainActivity.this,"Result is "+result,Toast.LENGTH_SHORT).show();
    }
    public void mul(View v) {

        String stringEdittext1 = et1.getText().toString();
        float numberEdittext1 = Float.parseFloat(stringEdittext1);

        String stringEdittext2 = et2.getText().toString();
        float numberEdittext2 = Float.parseFloat(stringEdittext2);

        float calculationResult = numberEdittext1 * numberEdittext2;
        result.setText("Result is "+calculationResult);

        Toast.makeText(MainActivity.this,"Result is "+result,Toast.LENGTH_SHORT).show();

    }
    public void div(View v) {

        String stringEdittext1 = et1.getText().toString();
        float numberEdittext1 = Float.parseFloat(stringEdittext1);

        String stringEdittext2 = et2.getText().toString();
        float numberEdittext2 = Float.parseFloat(stringEdittext2);

        float calculationResult = numberEdittext1 / numberEdittext2;
        result.setText("Result is "+calculationResult);

        Toast.makeText(MainActivity.this,"Result is "+result,Toast.LENGTH_SHORT).show();
    }
}
