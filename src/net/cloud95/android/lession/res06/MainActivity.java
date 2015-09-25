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
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText etName;
	private SeekBar sbSize;
	private Button btEnter;
	private Context context;
	private int size;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btEnter = (Button) findViewById(R.id.btEnter);
		etName = (EditText) findViewById(R.id.etName);
		sbSize = (SeekBar) findViewById(R.id.sbSize);
		context = this;

		// 設置監聽器
		sbSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				size = seekBar.getProgress();
				String progress = Integer.toString(size);
				Toast.makeText(context, progress, Toast.LENGTH_SHORT).show();

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
			}
		});

	}

	public void InputOnClick(View view) {
		Intent intent = new Intent();
		String msg = etName.getText().toString();
		intent.setClass(context, Res06Activity.class);
		Bundle bundle = new Bundle();
		bundle.putString("message", msg);
		bundle.putInt("size", size);
		intent.putExtras(bundle);
		startActivity(intent);
	}

}
