package com.example.android.logiregister_02;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Created by Raushan on 10/11/2016.
 */

public class display extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.display);

    String username = getIntent().getStringExtra("username");

    TextView tv = (TextView)findViewById(R.id.tvusername);
    tv.setText(username);
  }
}
