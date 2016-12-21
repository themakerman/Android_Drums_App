package com.kinnectsmart.soundpool;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private SoundPool drumSounds;
    private int bassDrumId;
    private int snare;
    private int crash;
    private int highhat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drumSounds = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        bassDrumId = drumSounds.load(this,R.raw.bassdrum,1);
        snare = drumSounds.load(this,R.raw.snare,1);
        crash = drumSounds.load(this,R.raw.crash,1);
        highhat = drumSounds.load(this,R.raw.hihat,1);

    }

    public void playKick(View view){
        drumSounds.play(bassDrumId,1,1,1,0,1);
    }

    public void playSnare(View view){
        drumSounds.play(snare,1,1,1,0,1);
    }

    public void playHiHat(View view){
        drumSounds.play(highhat,1,1,1,0,1);
    }

    public void playCrash(View view){

    }

    public void playRide(View view){

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
