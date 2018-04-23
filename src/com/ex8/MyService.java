package com.ex8;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service 

{
	private static final String TAG = "MyService";	
	MediaPlayer player;
	@Override	
	public void onCreate() 
	{
		Toast.makeText(this, "My Service Created", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onCreate");	
		player = MediaPlayer.create(this, R.raw.song);
		}	
	
	@Override
	public int onStartCommand(Intent i, int flags, int startId) 
	{
		Toast.makeText(this, "My Service Started", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onStartCommand");
		player.start();	
		player.setLooping(true);
		
		return START_STICKY;
		//return super.onStartCommand(i, flags, startId);
		}


	@Override	
	public void onDestroy() {	
		Toast.makeText(this, "My Service Stopped", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onDestroy");
		player.stop();
		}
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
