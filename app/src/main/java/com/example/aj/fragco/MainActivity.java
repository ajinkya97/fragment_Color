package com.example.aj.fragco;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnone,btntwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnone=(Button)findViewById(R.id.one);
        btntwo=(Button)findViewById(R.id.two);
        btnone.setOnClickListener(this);
        btntwo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
try{

        Fragment fragment=null;

        if(v.getId()==R.id.one)
        {
            fragment=new Fragmentone();
        }
        else
        {
            fragment=new Fragmenttwo();
        }

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frag1,fragment);
        ft.commit();
}
catch(Exception e)
        {
            Toast.makeText(MainActivity.this, ""+e, Toast.LENGTH_SHORT).show();
        }
}

}
