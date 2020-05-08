package com.example.vistaperfil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton actionButtom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav1:
                        Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav2:
                        Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav3:
                        Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

    }


}
