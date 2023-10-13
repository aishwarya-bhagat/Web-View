package com.bhagataishwarya430.webviewpractical;


import static com.bhagataishwarya430.webviewpractical.R.id.send_text_id;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    // define the variable
    Button send_button;
    EditText send_text;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button = findViewById(R.id.send_button_id);
        send_text = findViewById(send_text_id);
        send_button.setOnClickListener(v -> {
            String str = send_text.getText().toString();
            Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
            intent.putExtra("message", str);
            // start the Intent
            startActivity(intent);
        });
    }
}
