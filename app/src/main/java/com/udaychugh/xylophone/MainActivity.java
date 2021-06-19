package com.udaychugh.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    private final int NR_OF_SIMULATANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    SoundPool mSoundPool;
    int mCSoundId;
    int mDSoundId;
    int mESoundId;
    int mFSoundId;
    int mGSoundId;
    int mASoundId;
    int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NR_OF_SIMULATANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        mCSoundId=mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mBSoundId=mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);
        mASoundId=mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mDSoundId=mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId=mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId=mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId=mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
    }

    public void PlayA(View view){
        mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void PlayB(View view){
        mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void PlayC(View view){
        mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void PlayD(View view){
        mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void PlayE(View view){
        mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void PlayF(View view){
        mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }

    public void PlayG(View view){
        mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, 0, NORMAL_PLAY_RATE);
    }


}