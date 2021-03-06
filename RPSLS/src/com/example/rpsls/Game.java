package com.example.rpsls;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

public class Game extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		WebView w=(WebView) findViewById(R.id.webView1); 
		w.loadUrl("file:///android_assets/game.html");
		
		protected void displayScores(){
			for(int i=0; i<scores.length; i++){
				// decouples WebView and runOnUIThread
				game.runCommand("setScoreByPlayerID(�+i+","+scores[i]+")");
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game, menu);
		return true;
	}

}
