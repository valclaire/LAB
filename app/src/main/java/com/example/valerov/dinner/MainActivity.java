package com.example.valerov.dinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




   private   EditText mMenuEditText;
   private   EditText mPorsiEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenuEditText = (EditText)findViewById(R.id.editText_menu);
        mPorsiEditText = (EditText)findViewById(R.id.editText_porsi);

    }



    public void Eatbus(View view) {
    Intent intent = new Intent(this, SecondActivity.class);
        mMenuEditText = (EditText)findViewById(R.id.editText_menu);
        mPorsiEditText = (EditText)findViewById(R.id.editText_porsi);
    String porsi = String.valueOf(mPorsiEditText.getText());
    if (mMenuEditText.getText().toString().equalsIgnoreCase("Nasi Uduk")
            &&porsi.equalsIgnoreCase("2")){
        String eatbus = "eatbus";
        intent.putExtra("button", eatbus);
        startActivity(intent);
    }
    else{
        Toast.makeText(getApplicationContext(),"Menu Makanan diisi dengan 'Nasi Uduk' dan Porsi diisi dengan '2'",
                Toast.LENGTH_LONG).show();
    }




    }

    public void Apnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        mMenuEditText = (EditText)findViewById(R.id.editText_menu);
        mPorsiEditText = (EditText)findViewById(R.id.editText_porsi);
        String porsi = String.valueOf(mPorsiEditText.getText());
        if (mMenuEditText.getText().toString().equalsIgnoreCase("Nasi Uduk")
                &&porsi.equalsIgnoreCase("2")){
        String apnormal = "apnormal";
                intent.putExtra("button", apnormal);
        startActivity(intent);
        }
    else{
            Toast.makeText(getApplicationContext(),"Menu Makanan diisi dengan 'Nasi Uduk' dan Porsi diisi dengan '2'",
                    Toast.LENGTH_LONG).show();
        }

    }

}
