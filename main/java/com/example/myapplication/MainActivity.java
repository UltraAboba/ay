package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import static com.example.myapplication.DataBase.post;
import static com.example.myapplication.DataBase.pass;

public class MainActivity extends AppCompatActivity {
    EditText Mail;
    EditText Password;
    String mp;
    String pp;
    int ori;
    int orix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mail = (EditText) findViewById(R.id.adress);
        Password = (EditText) findViewById(R.id.password);
        Mail.setText(mp);
        Password.setText(pp);

        // Не работает:
        //ori = Integer.parseInt(String.valueOf(Mail));
        //orix = Integer.parseInt(String.valueOf(Password));
        // работает:
        //ori = 123456;
        //orix = 123456;
    }
    public void vhod(View View) {
        {
            //Intent intent;
            //intent = new Intent(this, MainActivity2.class);
            //startActivity(intent);
            startActivity(new Intent(this, MainActivity2.class));
            //тоже самое что и вверху
        }
    }

    public void idi(View View) {
        if (mp == post && pp == pass) {
            startActivity(new Intent(this, MainActivity3.class));
            //Intent intent;
            //intent = new Intent(this, MainActivity3.class);
            //startActivity(intent);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "mistake!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}

