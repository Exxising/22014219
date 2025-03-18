package com.example.signup_22014219;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText eInputId;
    EditText eInputPassword;
    EditText eInputPhone;

    TextView tViewId;
    TextView tViewPassword;
    TextView tViewPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // edit texts
        eInputId        = findViewById(R.id.editTextId);
        eInputPassword  = findViewById(R.id.editTextPassword);
        eInputPhone     = findViewById(R.id.editTextPhone);

        // text views
        tViewId         = findViewById(R.id.textViewId);
        tViewPassword   = findViewById(R.id.textViewPassword);
        tViewPhone      = findViewById(R.id.textViewPhone);
    }

    public void OnClickSignUp(View view)
    {
        tViewId.setText("아이디: " + eInputId.getText());
        tViewPassword.setText("패스워드: " + eInputPassword.getText());
        tViewPhone.setText("전화 번호: " + eInputPhone.getText());
    }
}