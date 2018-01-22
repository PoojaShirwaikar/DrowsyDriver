package org.tensorflow.DrowsyDriver;

/**
 * Created by poornima_kole on 20-01-2018.
 */

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;

import org.tensorflow.DrowsyDriver.env.Logger;


public class MediaActivity  extends Activity {

    public static MediaPlayer mediaPlayer=null;

    public static boolean isplayingAudio=false;

    public static void playAudio(Context c,int id){

     //   mediaPlayer.setLooping(true);
       /* if(!mediaPlayer.isPlaying())
        {
            mediaPlayer = MediaPlayer.create(c,id);
            new Logger().w("%s","In if of start");
            isplayingAudio=true;
            mediaPlayer.start();
            mediaPlayer.setVolume(100,100);

        }*/
        if(mediaPlayer==null) {
            //if(!mediaPlayer.isPlaying())
            //{
            mediaPlayer = MediaPlayer.create(c, id);
            new Logger().w("%s","In if of start");
            isplayingAudio=true;
            mediaPlayer.start();
            mediaPlayer.setVolume(100,100);
        }
        else{

            if(!mediaPlayer.isPlaying()) {
                new Logger().w("%s", "In if of start");
                isplayingAudio = true;
                mediaPlayer.start();
                mediaPlayer.setVolume(100, 100);
            }

           // }
        }

    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();

        if(mediaPlayer != null)
        {
            mediaPlayer.pause();

        }

    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();

        if(mediaPlayer != null)
        {
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }

    }
    public static void stopAudio(){

//        if(mediaPlayer!=null)
            if(isplayingAudio==true) {
                new Logger().w("%s", "In if of stop");
                isplayingAudio = false;
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
//
            }
//            }else
//            {
//                new Logger().w("%s","In else of stop");
//                if(mediaPlayer==null){
//                    mediaPlayer=new MediaPlayer();
//                }
////            mediaPlayer=new MediaPlayer();
//               mediaPlayer.stop();
//                isplayingAudio = false;
////
//            }

    }
}