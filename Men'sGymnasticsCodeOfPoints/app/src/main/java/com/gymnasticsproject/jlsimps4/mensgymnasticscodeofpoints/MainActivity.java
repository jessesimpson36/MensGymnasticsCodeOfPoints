package com.gymnasticsproject.jlsimps4.mensgymnasticscodeofpoints;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
     * this is the spinner that displays the levels and points to a routine document
     */
    private Spinner routineSpinner;

    /**
     * this is the spinner that displays the skill groups and points to the skill document
     */
    private Spinner skillSpinner;

    /**
     * the adapter for skills
     */
    private ArrayAdapter<CharSequence> skillAdapter;

    /**
     * the adapter for the levels
     */
    private ArrayAdapter<CharSequence> levelAdapter;

    /**
     * the skill button that points to a file
     */
    private Button skillButton;

    /**
     * the level button that points to the file
     */
    private Button routineButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //finds the Ids for reference
        routineSpinner = (Spinner) findViewById(R.id.routineSpinner);
        skillSpinner = (Spinner) findViewById(R.id.skillSpinner);
        routineButton = (Button) findViewById(R.id.routineButton);
        skillButton = (Button) findViewById(R.id.skillButton);

        //creates the reference and sets a dropdown resourse
        skillAdapter = ArrayAdapter.createFromResource(this, R.array.skillGroups_array, android.R.layout.simple_spinner_item);
        skillAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //same thing for levels
        levelAdapter = ArrayAdapter.createFromResource(this, R.array.levels_array, android.R.layout.simple_spinner_item);
        levelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //sets the adapters
        skillSpinner.setAdapter(skillAdapter);
        routineSpinner.setAdapter(levelAdapter);

        //for possible use
//        skillSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });

//        routineSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });

        routineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        skillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}



