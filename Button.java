package com.example.acer.buttons;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Buttoner extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttoner);
        // Access the default SharedPreferences
        SharedPreferences preferences = getSharedPreferences("number", MODE_PRIVATE);
        PreferenceManager.getDefaultSharedPreferences(this);
        // The SharedPreferences editor - must use commit() to submit changes
        SharedPreferences.Editor editor = preferences.edit();

        //Edit the saved preferences
        editor.putInt("number", 3);
        editor.commit();
    }

    public void createCountButton() {
        Button countButton = (Button)findViewById(R.id.buttons);
        Button saveButton = (Button)findViewById(R.id.buttoner);

        countButton.setOnClickListener(new View.OnClickListener() {
            int x = 0;

            @Override
            public void onClick(View v) {
                //int x = 0;
                System.out.println("Your count is: " + x);
                Toast.makeText(Buttoner.this, x, Toast.LENGTH_LONG).show();
                x = x + 1;
            }

            public void onClicker(View v) {
                int y;
                y = x;

                //getInt(String key, int defValue);
                System.out.println("Your saved count is: " + x);
                Toast.makeText(Buttoner.this, x, Toast.LENGTH_LONG).show();
                x = x + 1;
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buttoner, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
