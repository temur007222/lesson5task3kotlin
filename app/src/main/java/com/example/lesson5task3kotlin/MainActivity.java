package com.example.lesson5task3kotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.lesson5task3kotlin.Model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        EditText Uid = findViewById(R.id.u_length);
        EditText Upw = findViewById(R.id.pw_detail);

        String id = Uid.getText().toString();
        String pw = Upw.getText().toString();

        User user = new User(id, pw);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(User.class.getSimpleName(), user);
        startActivity(intent);
    }
}