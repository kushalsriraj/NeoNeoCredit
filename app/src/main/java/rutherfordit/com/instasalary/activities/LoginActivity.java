package rutherfordit.com.instasalary.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import rutherfordit.com.instasalary.R;

public class LoginActivity extends AppCompatActivity {

    RelativeLayout loginbottombutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        loginbottombutton = findViewById(R.id.loginbottombutton);

        loginbottombutton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EnterOTPActivity.class);
                startActivity(intent);
                loginbottombutton.setBackgroundColor(Color.rgb(16, 221, 188));
            }
        });

    }

    @Override
    public void onBackPressed() {
        //  super.onBackPressed();
        finishAffinity();
    }
}