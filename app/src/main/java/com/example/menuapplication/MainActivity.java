package com.example.menuapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView selectText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectText = findViewById(R.id.selectText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection.
        if (item.getItemId() == R.id.search) {
            selectText.setText("Search");
        }
        else if (item.getItemId() == R.id.settings) {
            selectText.setText("Settings");
        }
        else if (item.getItemId() == R.id.upload) {
            selectText.setText("Upload");
        }
        else if (item.getItemId() == R.id.upgrade) {
            selectText.setText("Upgrade");
        }
        return false;
    }

}