package net.cloud95.android.lession.res06;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends Activity {

	private EditText etName;
	private SeekBar sbSize;
	private Button btEnter;
	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btEnter = (Button) findViewById(R.id.btEnter);
		etName = (EditText) findViewById(R.id.etName);
		sbSize = (SeekBar) findViewById(R.id.sbSize);
		context = this;
	}

	public void InputOnClick(View view) {
		Intent intent = new Intent();
		 String msg = etName.getText().toString();
		intent.setClass(context, Res06Activity.class);
		Bundle bundle = new Bundle();
		bundle.putString("message", msg);
		intent.putExtras(bundle);
		startActivity(intent);
	}

}
