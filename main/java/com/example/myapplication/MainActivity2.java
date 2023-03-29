package com.example.myapplication;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;;
import android.widget.EditText;
import android.widget.Toast;
import static com.example.myapplication.DataBase.post;
import static com.example.myapplication.DataBase.pass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity2 extends AppCompatActivity {
    EditText email;
    EditText epassword;
    String ay;
    String ai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        email = (EditText) findViewById(R.id.adress12);
        epassword = (EditText)findViewById(R.id.password12);
        email.setText(ay);

    }
    //aaaa
    public void prochod(View View) {
        if (epassword.getText().toString().length() ==6 && email.getText().toString().length() == 6 && ay == post){
            if(ay == post){
                Toast toast = Toast.makeText(getApplicationContext(), "mistale2", Toast.LENGTH_SHORT);
                toast.show();
            }
        startActivity(new Intent(this, MainActivity.class));
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "mistake!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void user(View View) {
        DataBase user = new DataBase();
        user.setPassword(epassword.getText().toString());
        user.setMail(email.getText().toString());
    }
    }
    /*public void error(){
        if(ay == post){
            Toast toast = Toast.makeText(getApplicationContext(), "mistale2", Toast.LENGTH_SHORT);
            toast.show();
        }

    }*/

}