package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    //To display a toast message
    void displayText(String s) {

        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(getApplicationContext(), s, duration);
        toast.show();
    }

    //method for clicking the spotify button
    public void spotifyButton(View view) {
        displayText(getString(R.string.spotify_message));
    }

    //method for clicking the score button
    public void scoresButton(View view) {

        displayText(getString(R.string.scores_message));
    }

    //method for clicking the library button
    public void libraryButton(View view) {

        displayText(getString(R.string.library_message));
    }

    //method for clicking the build bigger button
    public void buildBiggerButton(View view) {

        displayText(getString(R.string.build_bigger_message));
    }

    //method for clicking the reader button
    public void readerButton(View view) {

        displayText(getString(R.string.reader_message));
    }

    //method for clicking the capstone button
    public void capstoneButton(View view) {

        displayText(getString(R.string.capstone_message));
    }
}
