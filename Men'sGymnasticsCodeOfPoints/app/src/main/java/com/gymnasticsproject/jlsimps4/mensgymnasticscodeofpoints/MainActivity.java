package com.gymnasticsproject.jlsimps4.mensgymnasticscodeofpoints;

import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * this is the main activity
 */
public class MainActivity extends AppCompatActivity {


    /**
     * does everything once the program starts.
     * @param savedInstanceState auto-generated variable
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        /*
      this is the spinner that displays the levels and points to a routine document
     */
        Spinner routineSpinner = (Spinner) findViewById(R.id.routineSpinner);

        /*
      this is the spinner that displays the skill groups and points to the skill document
     */
        Spinner skillSpinner = (Spinner) findViewById(R.id.skillSpinner);


        /*
      the level button that points to the file
     */
        Button routineButton = (Button) findViewById(R.id.routineButton);


        /*
      the skill button that points to a file
     */
        Button skillButton = (Button) findViewById(R.id.skillButton);

        //creates the reference and sets a dropdown resourse


        /*
      the adapter for skills
     */
        ArrayAdapter<CharSequence> skillAdapter = ArrayAdapter.createFromResource(this, R.array.skillGroups_array, android.R.layout.simple_spinner_item);
        skillAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //same thing for levels
        /*
      the adapter for the levels
     */
        ArrayAdapter<CharSequence> levelAdapter = ArrayAdapter.createFromResource(this, R.array.levels_array, android.R.layout.simple_spinner_item);
        levelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //sets the adapters
//        skillSpinner.setAdapter(skillAdapter);
//        routineSpinner.setAdapter(levelAdapter);

//        routineButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//
//        skillButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });





    }


}



