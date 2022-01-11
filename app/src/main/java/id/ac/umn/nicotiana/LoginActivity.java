package id.ac.umn.nicotiana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editemail;
    EditText editpassword;
    SqliteHelper SqliteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SqliteHelper = new SqliteHelper(this);
        Button signupbtn = findViewById(R.id.btnsignup);
        Button loginbtn = findViewById(R.id.btnlogin);
        editemail = (EditText) findViewById(R.id.email);
        editpassword = (EditText) findViewById(R.id.password);

        signupbtn.setOnClickListener(view -> {
            Intent signin_up= new Intent(LoginActivity.this,SignupActivity.class);
            startActivity(signin_up); });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validate()) {

                    String Email = editemail.getText().toString();
                    String Password = editpassword.getText().toString();

                    User currentUser = SqliteHelper.Authenticate(new User(null, Email, Password));

                    if (currentUser != null) {
                        Toast.makeText(getApplicationContext(), "Berhasil Login, Selamat Datang!!", Toast.LENGTH_SHORT).show();

                        Intent intent=new Intent(LoginActivity.this,MainmenuActivity.class);
                        startActivity(intent);
                        finish();

                    } else {

                        Toast.makeText(getApplicationContext(), "Pastikan email dan password sesuai dengan yang terdaftar", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
    }

    @SuppressWarnings("deprecation")
    public static Spanned fromHtml(String html) {
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
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