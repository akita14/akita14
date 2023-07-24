package com.example.healcheckplace;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class AboutUs extends AppCompatActivity {

    private Toolbar toolbar;
    Button map_button;
    private Button phone_button;
    private Button info_button;
    TextView linkTextView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_home:
                Toast.makeText(this,"Home Menu",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(this,Home.class);
                startActivity(intent);
                return true;

            case R.id.menu_aboutus:
                Toast.makeText(this,"About Us Menu",Toast.LENGTH_SHORT).show();
                Intent intent2 =new Intent(this,AboutUs.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        linkTextView = findViewById(R.id.linkgit);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
