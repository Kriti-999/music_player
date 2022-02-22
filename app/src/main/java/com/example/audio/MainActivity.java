package com.example.audio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int f=0;
    int state;
    boolean on=false;

    public  void play(View view){
        Button btn=(Button) view;
        state=Integer.parseInt(btn.getTag().toString());
        callSong(state);




    }
    public void pause(View view){
        if(f==0){
            mediaPlayer.pause();
            f=1;
        }
        else{
            mediaPlayer.start();
            f=0;
        }
    }
    public void callSong(int state){
        if(on){
            mediaPlayer.stop();
            on=false;
        }
        if(state==1){
            //mediaPlayer.
            mediaPlayer=MediaPlayer.create(this,R.raw.music_1);
            on=true;


        }
        else if(state==2){
            mediaPlayer=MediaPlayer.create(this,R.raw.music_2);
            mediaPlayer.start();
            on=true;
        }
        else if(state==3){

            mediaPlayer=MediaPlayer.create(this,R.raw.music_3);
            mediaPlayer.start();
            on=true;
        }


        else if(state==4){

            mediaPlayer=MediaPlayer.create(this,R.raw.music_4);
            mediaPlayer.start();
            on=true;
        }
        else if(state==5){

            mediaPlayer=MediaPlayer.create(this,R.raw.music_5);
            mediaPlayer.start();
            on=true;
        }
        else if(state==6){

            mediaPlayer=MediaPlayer.create(this,R.raw.music6);
            mediaPlayer.start();
            on=true;
        }
        else if(state==7){

            mediaPlayer=MediaPlayer.create(this,R.raw.music7);
            mediaPlayer.start();
            on=true;
        }
        else if(state==8){

            mediaPlayer=MediaPlayer.create(this,R.raw.music_8);
            mediaPlayer.start();
            on=true;
        }
        else{

            mediaPlayer=MediaPlayer.create(this,R.raw.music_9);
            mediaPlayer.start();
            on=true;
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}