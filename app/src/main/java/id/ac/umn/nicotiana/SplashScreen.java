package id.ac.umn.nicotiana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private int waktu_loading=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.screen_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent halamaninput = new Intent(SplashScreen.this,
                        LoginActivity.class);
                startActivity(halamaninput);
                finish();
            }
        },waktu_loading);
    }
}