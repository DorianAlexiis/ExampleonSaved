package com.example.exampleonsaved;

import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private final static String TAG = MainActivity.class.getSimpleName();

    private TextView tvMsj;
    private Button btnGuardar;
    private EditText etEntrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG+"Debug","onCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        etEntrada = (EditText) findViewById(R.id.etEntrada);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        tvMsj = (TextView) findViewById(R.id.tvMsj);

        Log.d(TAG+"Debug","onStart()");

        btnGuardar.setOnClickListener(this);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG+"Debug","onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG+"Debug","onPause()");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG + "Debug", "onSaveInstanceState()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGuardar:
                tvMsj.setText(etEntrada.getText());
                break;
        }
    }
}
