package id.ac.umn.nicotiana;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    EditText editemail;
    EditText editpassword;
    SqliteHelper SqliteHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        SqliteHelper = new SqliteHelper(this);
        Button btncreate =findViewById(R.id.btnsignin);

        editemail = (EditText) findViewById(R.id.email);
        editpassword = (EditText) findViewById(R.id.password);


        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    String Email = editemail.getText().toString();
                    String Password = editpassword.getText().toString();

                    if (!SqliteHelper.isEmailExists(Email)) {

                        SqliteHelper.addUser(new User(null, Email, Password));
                        Toast.makeText(getApplicationContext(), "Berhasil mendaftarkan email", Toast.LENGTH_SHORT).show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                finish();
                            }
                        }, Toast.LENGTH_LONG);
                        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                    }else {

                        Toast.makeText(getApplicationContext(), "Mohon gunakan email yang berbeda", Toast.LENGTH_SHORT).show();
                    }


                }
            }
        });
    }

    public boolean validate() {
        boolean valid = false;

        String Email = editemail.getText().toString();
        String Password = editpassword.getText().toString();

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
            valid = false;
            editemail.setError("Mohon masukkan email yang benar");
        } else {
            valid = true;
            editemail.setError(null);
        }

        if (Password.isEmpty()) {
            valid = false;
            editpassword.setError("Mohon masukkan password yang benar");
        } else {
            if (Password.length() > 5) {
                valid = true;
                editpassword.setError(null);
            } else {
                valid = false;
                editpassword.setError("Password harus terdiri lebih dari 5 karakter");
            }
        }
        return valid;
    }


}
