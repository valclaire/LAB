package com.example.valerov.dinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView Place;
    private TextView Harga;
    private TextView Menu;
    private TextView Porsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Place = (TextView)findViewById(R.id.textView_place);
        Harga = (TextView)findViewById(R.id.textView_harga);
        Menu = (TextView)findViewById(R.id.textView_menu);
        Porsi = (TextView)findViewById(R.id.textView_porsi);
        Intent intent = getIntent();
        Bundle take = intent.getExtras();
        String resource = (String)take.get("button");
        if (resource.equalsIgnoreCase("eatbus")){
            Place.setText("Eatbus");
            Menu.setText("Nasi Uduk");
            Porsi.setText("2");
            Harga.setText("100000");
            Toast.makeText(getApplicationContext(),"Jangan disini makan malamnya uang kamu tidak cukup",
                    Toast.LENGTH_LONG).show();
        }
        else if (resource.equalsIgnoreCase("apnormal")) {
        Place.setText("Apnormal");
        Menu.setText("Nasi Uduk");
        Porsi.setText("2");
        Harga.setText("60000");
        Toast.makeText(getApplicationContext(),"Disini aja makan malamnya",Toast.LENGTH_LONG).show();
        }
        

    }
}
