package id.ac.umn.nicotiana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.GridLayout;

public class MainmenuActivity extends AppCompatActivity {

    GridLayout mainGridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        mainGridLayout = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(mainGridLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about){
            startActivity(new Intent(this, AboutActivity.class));
        }
        return true;
    }

    private void setSingleEvent(GridLayout mainGridLayout)
    {
        for (int i=0 ; i<mainGridLayout.getChildCount() ; i++){
            CardView cardview = (CardView) mainGridLayout.getChildAt(i);
            final int finalI = i;
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(MainmenuActivity.this,DiagnosaActivity.class);
                        startActivity(intent);
                    }else if(finalI==1)
                    {
                        Intent intent = new Intent(MainmenuActivity.this,JenisPenyakitActivity.class);
                        startActivity(intent);
                    }else if(finalI==2)
                    {
                        Intent intent = new Intent(MainmenuActivity.this,BahayaMerokokActivity.class);
                        startActivity(intent);
                    }else if(finalI==3)
                    {
                        Intent intent = new Intent(MainmenuActivity.this,BantuanActivity.class);
                        startActivity(intent);
                    }else if(finalI==4)
                    {
                        Intent intent = new Intent(MainmenuActivity.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            });
        }
    }
}