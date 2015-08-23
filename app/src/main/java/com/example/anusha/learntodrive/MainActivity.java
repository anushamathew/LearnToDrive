
//Android Studio Program on leaners and license Test Practice.
//Author:Anusha Mathew,Angitha Das,Akshay Venugopal

package com.example.anusha.learntodrive;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

    private RadioGroup rg;
    private ImageButton go;
    private RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();


    }


    public void addListenerOnButton() {
        rg=(RadioGroup)findViewById(R.id.radiogroup);
        go=(ImageButton)findViewById(R.id.imageButton2);
        go.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(selectedId);
                switch(selectedId)
                {
                    case R.id.radioButton:
                        Intent i=new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(i);
                        break;
                    case  R.id.radioButton2:
                        Intent j=new Intent(MainActivity.this,Main22Activity.class);
                        startActivity(j);
                        break;
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
