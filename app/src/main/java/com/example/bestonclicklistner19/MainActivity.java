package com.example.bestonclicklistner19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    // implements View.OnClickListener

    private TextView tv, tv2;
    private Button btn, btn2;
    int c = 0;
    int cn = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        tv = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);


        // onClcik listner set koralm , ei class a ase tai this use korsi.
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);


        // button's are clicked to set onClickListner

        /*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c++;
                tv.setText("Login Button is Clicked - "+c);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               cn++;
                tv2.setText("Logout Button is clicked - "+cn);
            }
        });

        */


        // Inner class / Handler to onClick Listner.


        /*

        // Handler er madhome amara listner gulo ke handle korbo..
        Handler handler = new Handler();
        // # button gulor sathe listner ti add kore dite hobe. parameter hisahbe pass korte hobe handler .
        btn.setOnClickListener(handler);
        btn2.setOnClickListener(handler);


         */


    }

    // # onClick listener ei class ti keo implement korle sei method take obosshow override kote hobe.

  /*  class Handler implements View.OnClickListener {


        @Override
        public void onClick(View v) {

            if (v.getId() == R.id.button) {

                tv.setText("Login button is clicked " + c++);
            } else {

                tv2.setText("Logout button is clicked " + cn++);
            }
        }

        */


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button) {

            tv.setText("Login button is clicked - " + c++);
        } else {

            tv2.setText("Logout Button is clicked - " + cn++);
        }

    }
}
