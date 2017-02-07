package com.fihatech.android_learning_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //addControll bat buoc phai nam tren addEvent
        addControl();
        addEvent();
    }

    private void addEvent() {
    }

    private void addControl() {
        etName = (EditText) findViewById(R.id.etName);
    }

    public void HelloUser(View v) {
        String name = etName.getText().toString();
        Toast.makeText(MainActivity.this,"Hello " + etName, Toast.LENGTH_LONG).show();
    }
}
