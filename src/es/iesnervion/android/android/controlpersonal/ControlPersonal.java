package es.iesnervion.android.android.controlpersonal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ControlPersonal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_control_personal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.control_personal, menu);
		return true;
	}

}
