package com.sprint.gina.menufuns1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class AddItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        // lets enable the "up" button (AKA home AKA back)
        // an arrow that lets you get back to the
        // "previous activity"
        // 2 options for what the previous activity is
        // 1. the parent activity (as specified in AndroidManifest.xml)
        // android:parentActivityName=".MainActivity"
        // 2. the previous activity in the activity call stack
        // e.g. the one that started this activity
        // let's do a demo of #2
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Add Item");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}