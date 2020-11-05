package com.corona.coronazp20t;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
//void negrazinanti funkcija//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ////kodas reikalingas atidaryti tuscia langa///
        setContentView(R.layout.activity_login);
        //i tuscia langa uzkrauna vaizdą
        //visas kodas rašomas po šito komentaro
        Button loginbatonas=findViewById(R.id.loginbatonas);
        //tokiu budu galime isitraukti elementus is vaizdo

        final EditText usernametext =findViewById(R.id. naudotojovardas);

        final EditText passwordtext =findViewById(R.id. naudotojoslaptazodis);

        loginbatonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cia bus vykdomas kodas po mygtuko paspaudimo
                Toast.makeText(LoginActivity.this,
                        "Prisijungimo Vardas: "+usernametext.getText().toString()+"\n"+
                        "Slaptazodis: "+passwordtext.getText().toString(),
                        Toast.LENGTH_SHORT).show();
                //ketinimas pereiti i paieskos langa
                Intent goToSearchActivity=new Intent(LoginActivity.this, //is cia
                        SearchActivity.class); //i cia
                startActivity(goToSearchActivity); //perein i paieskos langa

                Toast.makeText(LoginActivity.this, getResources().getString(R.string.login_success),
                        Toast.LENGTH_SHORT).show();

            }
        });
        Button registerButton = (Button) findViewById(R.id.registerButton2);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterActivity();
            }
        });

    }

    public void RegisterActivity() {
        Intent goRegisterActivity = new Intent(LoginActivity.this,
                RegisterActivity.class);
        startActivity(goRegisterActivity);
    }
}
