package id.ac.telkomuniversity.student.irhari.LoginPOP;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button bMasuk,bSignup,bLogin;
private EditText mPass,mNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        mPass = (EditText) findViewById(R.id.editText_password);
        mNama = (EditText) findViewById(R.id.editText_username);
        bMasuk =(Button) findViewById(R.id.button_masuk);
        bSignup =(Button) findViewById(R.id.button_signup);
        bLogin =(Button) findViewById(R.id.button_login);
    }

    public void masuk(View view) {
        String password, rpassword,susername,semail,salamat;
        password = mPass.getText().toString();
        susername = mNama.getText().toString();

        if(!(susername.equals("admin") && password.equals("admin"))){
            Toast.makeText(this,"Username / Password Salah",Toast.LENGTH_SHORT).show();
            return;
        }else{
            Toast.makeText(this,"Berhasil Sign-In",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,mainMenu.class));
        }
    }


    public void signup(View view) {
        setContentView(R.layout.signup);
    }

    public void login(View view) {
        setContentView(R.layout.activity_main);
}


    public void didaftarin(View view) {
        startActivity(new Intent(this,mainMenu.class));
    }
}

