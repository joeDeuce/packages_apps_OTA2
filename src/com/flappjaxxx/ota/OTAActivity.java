package com.flappjaxxx.ota;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class OTAActivity extends DroidGap {
	
 	/** Called when the activity is first created. */
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.htm");
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.layout.menu, menu);
	    return true;
	}
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.exit_app:
	    	finish();
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
    }
    
}