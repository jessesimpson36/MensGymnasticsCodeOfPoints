package com.gymnasticsproject.jlsimps4.mensgymnasticscodeofpoints;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    /**
     * this is the event that the user chooses and is regularly updated.
     */
    private static String event;

    /**
     * the adapter for skills
     */
    private ArrayAdapter<CharSequence> skillAdapter;

    /**
     * the adapter for the levels
     */
    private ArrayAdapter<CharSequence> levelAdapter;

    /**
     * gets the event that the user last chose.
     * @return the event that the user last chose
     */
    public static String getEvent(){
        return event;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //creates the reference and sets a dropdown resourse
        skillAdapter = ArrayAdapter.createFromResource(this, R.array.skillGroups_array, android.R.layout.simple_spinner_item);
        skillAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //same thing for levels
        levelAdapter = ArrayAdapter.createFromResource(this, R.array.levels_array, android.R.layout.simple_spinner_item);
        levelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer;
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
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

        FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.rings) {

            //updates the text on the adapters
            skillAdapter = ArrayAdapter.createFromResource(this, R.array.rings_skillGroups_array, android.R.layout.simple_spinner_item);
            skillAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            event = "rings";
        } else if (id == R.id.pommelhorse) {
            skillAdapter = ArrayAdapter.createFromResource(this, R.array.pommel_skillGroups_array, android.R.layout.simple_spinner_item);
            skillAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            event = "pommelhorse";
        } else if (id == R.id.floor) {

            skillAdapter = ArrayAdapter.createFromResource(this, R.array.floor_skillGroups_array, android.R.layout.simple_spinner_item);
            skillAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            event = "floor";
        } else if (id == R.id.vault) {

            skillAdapter = ArrayAdapter.createFromResource(this, R.array.vault_skillGroups_array, android.R.layout.simple_spinner_item);
            skillAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            event = "vault";
        } else if (id == R.id.parallelbars) {
            skillAdapter = ArrayAdapter.createFromResource(this, R.array.pbar_skillGroups_array, android.R.layout.simple_spinner_item);
            skillAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            event = "parallelbars";
        } else if (id == R.id.highbar) {
            skillAdapter = ArrayAdapter.createFromResource(this, R.array.hbar_skillGroups_array, android.R.layout.simple_spinner_item);
            skillAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            event = "highbar";
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
