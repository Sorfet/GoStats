
/* Comments::
    TODO:
    Andrea testas toimiiko

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
package com.sasumikonranta.gostats;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




//MAIN ACTIVITY ON ID LOGIN


public class Main extends ActionBarActivity {



    EditText idKentta;
    Button submitNappi, apuNappi;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Määritetään id input kenttä

        idKentta = (EditText) findViewById(R.id.idInput);



        //Määritetään submitnappi ja asetetaan sille kuuntelija
        submitNappi = (Button) findViewById(R.id.etuNappi);
        submitNappi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // tänne submit napin painalluksen toiminta



                try {
                    id = idKentta.getText().toString();

                    System.out.println("Testitulostus ----- syötetty id: " + id);

                }catch(Exception e){

                    System.out.println("Error");
                }
            }
            });



        //Määritetään HELP -nappi ja asetetaan sille kuuntelija
        apuNappi = (Button) findViewById(R.id.helpNappi);
        apuNappi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // tänne apunapin painalluksen toiminta
                //eli popup käynnistäjä ohjeelle


                naytaApu();


            }
        });






    }


    private void naytaApu() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Ohje Steam ID:n löytämiseen");
        helpBuilder.setMessage("Tämä ohje neuvoo kuinka löydät oman Steam ID:si ! (JOSKUS KUN JAKSAA TEHDÄ) TODO");
        helpBuilder.setPositiveButton("Poistu",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                    }
                });

        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();
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
