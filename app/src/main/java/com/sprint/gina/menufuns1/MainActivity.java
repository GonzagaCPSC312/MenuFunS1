package com.sprint.gina.menufuns1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we can set up option items (AKA actions)
        // that display on our top app bar
        // steps
        // 1. declare our menu in res/menu
        // 2. override a special method to inflate the menu
        // 3. override a special method for the callback
        // when the user selects an action
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // we need to get a MenuInflater to inflate our main_menu.xml
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // figure out which menuitem this is
        int itemId = item.getItemId();
        switch(itemId) {
            case R.id.addMenuItem:
                // task: start a second activity
                Toast.makeText(this, "TODO: start second activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, AddItemActivity.class);
                startActivity(intent);
                return true; // this event has been consumed/handled
            // task: add remaining cases
            case R.id.preferencesMenuItem:
                Toast.makeText(this, "TODO: show preferences", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.aboutMenuItem:
                Toast.makeText(this, "TODO: show about app", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}