package com.sasumikonranta.gostats;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



/* Comments::
    TODO:

- Parseeja
  - Data saadaan tästä: http://api.steampowered.com/ISteamUserStats/GetUserStatsForGame/v0002/?appid=730&key=<<KEY>>&steamid=<<PROFILEID>>

  <<key>> = 7B99A8C2129627CC394A4B3FD17F0A12

  ja <<profile id>> vaik sorfet:  76561197990716071


  eli tässä:   http://api.steampowered.com/ISteamUserStats/GetUserStatsForGame/v0002/?appid=730&key=7B99A8C2129627CC394A4B3FD17F0A12&steamid=76561197990716071

Arvoja kaikilla muuttujilla on:
  name
  value

  "playerstats": {
		"steamID": "76561197990716071",
		"gameName": "ValveTestApp260",
		"stats": [
			{
				"name": "total_kills",
				"value": 9836
			},
			{
				"name": "total_deaths",
				"value": 11507
			}]

			//Tästä leikattu ja suljettu.. näkee vain rakenteen

			}
}


- layout




*/

public class Main extends ActionBarActivity {

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
}
