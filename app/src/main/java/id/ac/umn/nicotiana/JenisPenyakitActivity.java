package id.ac.umn.nicotiana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class JenisPenyakitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_penyakit);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView = findViewById(R.id.jenisPenyakit);
        List<String> list = new ArrayList<>();
        list.add("Kanker Paru - Paru");
        list.add("Stroke");
        list.add("Hipertensi");
        list.add("Diabetes");
        list.add("Serangan Jantung");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    //clicked list 1
                    startActivity(new Intent(JenisPenyakitActivity.this, KankerActivity.class));
                } else if (position == 1) {
                    //clicked list 2
                    startActivity(new Intent(JenisPenyakitActivity.this, StrokeActivity.class));
                } else if (position == 2) {
                    //clicked list 3
                    startActivity(new Intent(JenisPenyakitActivity.this, HipertensiActivity.class));
                } else if (position == 3) {
                    //clicked list 4
                    startActivity(new Intent(JenisPenyakitActivity.this, DiabetesActivity.class));
                } else if (position == 4) {
                    //clicked list 5
                    startActivity(new Intent(JenisPenyakitActivity.this, JantungActivity.class));
                }
            }
        });
    }
}