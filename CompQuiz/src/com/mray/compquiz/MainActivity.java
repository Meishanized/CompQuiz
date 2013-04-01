package com.mray.compquiz;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	public void onClickQuiz (View view) {
		Toast.makeText(this, "Good Luck!", Toast.LENGTH_SHORT).show();
		
	}
	
	public void onClickWebsite (View view) {
		Toast.makeText(this, "Come Back Soon.", Toast.LENGTH_SHORT).show();
	}
	
	// INTENT GO TO THE COMPTIA A+ WEBSITE
	public void openWebURL(String compSite) {
		Uri myURL = Uri.parse("http://certification.comptia.org/getCertified/certifications/a.aspx");
		Intent site_intent = new Intent(Intent.ACTION_VIEW, myURL);
		
		startActivity(site_intent);
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
