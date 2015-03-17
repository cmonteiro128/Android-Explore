package com.madd.androidexplore;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridLayout;

import com.madd.androidexplore.app.AppInstance;

public class BaseActivity extends ActionBarActivity {

    /*
    *TODO: write comments
    *
     */
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_base, menu);
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

    private void onSetupRecyclerView() {
        //Create a GridLayoutManager for the recyclerView
        GridLayoutManager mGrid = new GridLayoutManager(this, 2);
        mGrid.setOrientation(GridLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(mGrid);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
