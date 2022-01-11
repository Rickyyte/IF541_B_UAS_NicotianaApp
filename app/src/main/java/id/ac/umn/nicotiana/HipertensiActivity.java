package id.ac.umn.nicotiana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HipertensiActivity extends AppCompatActivity {

    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hipertensi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.solusi);
        textView.setText(R.string.solusi_hipertensi);

        home = (Button) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent halamanhome = new Intent(HipertensiActivity.this,
                        MainmenuActivity.class);
                startActivity(halamanhome);
            }
        });
    }
}