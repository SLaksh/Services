package com.ex8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class First extends Activity implements OnClickListener {
	Button start, stop;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        start = (Button)findViewById(R.id.Button01);
        stop = (Button)findViewById(R.id.Button02);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		Intent i = new Intent(this, MyService.class);
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.Button01:
			startService(i);
			break;
		case R.id.Button02:
			stopService(i);
		}
		
	}
}