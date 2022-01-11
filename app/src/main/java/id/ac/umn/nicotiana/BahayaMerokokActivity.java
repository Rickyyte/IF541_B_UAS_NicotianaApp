package id.ac.umn.nicotiana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BahayaMerokokActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahaya_merokok);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}