package com.example.nikolay.communicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {

    public static final String NAME = "com.example.nikolay.communicate";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Button connectBtn = (Button) findViewById(R.id.connectBtn);

        connectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this, Chat.class);
                EditText editText = (EditText) findViewById(R.id.logInTxt);
                String message = editText.getText().toString();
                intent.putExtra(NAME, message);
                startActivity(intent);
            }
        });
    }
}
