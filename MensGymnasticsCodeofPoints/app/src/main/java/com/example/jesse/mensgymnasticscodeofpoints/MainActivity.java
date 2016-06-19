package com.example.jesse.mensgymnasticscodeofpoints;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner routineSpinner = (Spinner) findViewById(R.id.routineSpinner);
        Spinner skillSpinner = (Spinner) findViewById(R.id.skillSpinner);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        final Spinner skill = (Spinner) findViewById(R.id.skillSpinner);
        final Spinner routine = (Spinner) findViewById(R.id.routineSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.skillGroups_array, android.R.layout.simple_spinner_item);

        Button skillButton = (Button) findViewById(R.id.skillButton);

        Button routineButton = (Button) findViewById(R.id.routineButton);

        routineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(routine.getPrompt().toString()){
                    case "Level 4":
                        break;

                    case "Level 5":
                        break;

                    case "Level 6":
                        break;

                    case "Level 7":
                        break;

                    default:
                        break;
                }
            }
        });

        if (id == R.id.rings) {
            // Handle the camera action
            adapter = ArrayAdapter.createFromResource(this, R.array.rings_skillGroups_array, android.R.layout.simple_dropdown_item_1line);
            skillButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    switch (skill.getPrompt().toString()){
                        case "Kip and Swing Elements":
                            break;

                        case "Swings to Handstand":
                            break;

                        case "Swings to Strength Hold":
                            break;

                        case "Strength Elements Hold":
                            break;

                        case "Dismounts":
                            break;

                        default:
                            break;
                    }
                }


            });


        } else if (id == R.id.highbar) {
            adapter = ArrayAdapter.createFromResource(this, R.array.hbar_skillGroups_array, android.R.layout.simple_dropdown_item_1line);

            skillButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    switch (skill.getPrompt().toString()){
                        case "Long hang Without Turns":
                            break;

                        case "Flight":
                            break;

                        case "In-Bar":
                            break;

                        case "El-Grip":
                            break;

                        case "Dismounts":
                            break;

                        default:
                            break;
                    }
                }


            });

        } else if (id == R.id.floor) {
            adapter = ArrayAdapter.createFromResource(this, R.array.floor_skillGroups_array, android.R.layout.simple_dropdown_item_1line);

            skillButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    switch (skill.getPrompt().toString()){
                        case "Non-Acrobatic":
                            break;

                        case "Acrobatic Forward":
                            break;

                        case "Acrobatic Backward":
                            break;

                        case "Acrobatic Side-ways":
                            break;

                        default:
                            break;
                    }
                }


            });

        } else if (id == R.id.parallelbars) {
            adapter = ArrayAdapter.createFromResource(this, R.array.pbar_skillGroups_array, android.R.layout.simple_dropdown_item_1line);

            skillButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    switch (skill.getPrompt().toString()){
                        case "Support":
                            break;

                        case "Upper Arm":
                            break;

                        case "Long Swing":
                            break;

                        case "Under Swing":
                            break;

                        case "Dismounts":
                            break;

                        default:
                            break;
                    }
                }


            });

        } else if (id == R.id.pommelhorse) {
            adapter = ArrayAdapter.createFromResource(this, R.array.pommel_skillGroups_array, android.R.layout.simple_dropdown_item_1line);

            skillButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    switch (skill.getPrompt().toString()){
                        case "Scissors":
                            break;

                        case "Circles and Flairs":
                            break;

                        case "Travels":
                            break;

                        case "Kehrswings, flops and combined elements":
                            break;

                        case "Dismounts":
                            break;

                        default:
                            break;
                    }
                }


            });

        } else if (id == R.id.vault) {
            adapter = ArrayAdapter.createFromResource(this, R.array.vault_skillGroups_array, android.R.layout.simple_dropdown_item_1line);

            skillButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    switch (skill.getPrompt().toString()){
                        case "Forward Handspring and Yamashita":
                            break;

                        case "Handspring with turn":
                            break;

                        case "Round-off Entry with Backwards 2nd Flight Phase":
                            break;

                        case "Round-off Entry with turn and Forwards 2nd Flight Phase":
                            break;

                        case "Round-off Entry with turn and Backwards 2nd Flight Phase":
                            break;

                        default:
                            break;
                    }
                }


            });

        }
        skill.setAdapter(adapter);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
