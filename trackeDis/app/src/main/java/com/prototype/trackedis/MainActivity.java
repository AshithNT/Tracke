package com.prototype.trackedis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
EditText firepath;
Button sub,clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firepath=(EditText)findViewById(R.id.et_fpath);
        sub=(Button)findViewById(R.id.button_submit);
        clr=(Button)findViewById(R.id.button_clear);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /* String path=firepath.getText().toString();
                Intent i=new Intent(getBaseContext(),DisplayActivity.class);
                i.putExtra("data",path);
                startActivity(i);*/

              startActivity(new Intent(MainActivity.this,DisplayActivity.class));
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firepath.setText("");
            }
        });

    }
}