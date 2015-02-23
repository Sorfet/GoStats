package com.sasumikonranta.gostats;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TextView;


public class Tulos extends ActionBarActivity {


    TextView t1, t2, t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulos);



        //TÄSSÄ LUODAAN TABIT
        //
        // todo: Swipe tabeihin
        //
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);


        tabHost.setup();

        //tab1
        TabHost.TabSpec tabSpec = tabHost.newTabSpec("Overall");
        tabSpec.setContent(R.id.Overall);
        tabSpec.setIndicator("Overall");
        tabHost.addTab(tabSpec);

        //tab2
        tabSpec = tabHost.newTabSpec("Competive");
        tabSpec.setContent(R.id.Competive);
        tabSpec.setIndicator("Competive");
        tabHost.addTab(tabSpec);

        //tab3
        tabSpec = tabHost.newTabSpec("Casual");
        tabSpec.setContent(R.id.Casual);
        tabSpec.setIndicator("Casual");
        tabHost.addTab(tabSpec);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tulos, menu);
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
