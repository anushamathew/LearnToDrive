package com.example.anusha.learntodrive;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main25Activity extends AppCompatActivity {
    private ImageButton b1;
    final Context context = this;
    private RadioGroup rg;
    private RadioButton rb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
        addListenerOnButton();
    }
    public void addListenerOnButton() {


        rg = (RadioGroup) findViewById(R.id.radiogroup);
        b1 = (ImageButton) findViewById(R.id.imageButton5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(selectedId);
                switch (selectedId) {
                    case R.id.radioButton9:
                        AlertDialog.Builder alertDialogBuilder1 = new AlertDialog.Builder(
                                context);
                        alertDialogBuilder1.setTitle("Answer");
                        alertDialogBuilder1
                                .setMessage("Right Answer!!!")
                                .setCancelable(false)
                                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent j = new Intent(Main25Activity.this, Main26Activity.class);
                                        startActivity(j);
                                    }
                                });
                        AlertDialog alertDialog1 = alertDialogBuilder1.create();

                        alertDialog1.show();
                        break;

                    default:

                        AlertDialog.Builder alertDialogBuilder2 = new AlertDialog.Builder(
                                context);
                        alertDialogBuilder2.setTitle("Answer");
                        alertDialogBuilder2
                                .setMessage("Sorry! Wrong Answer!!!")
                                .setCancelable(false)
                                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent j = new Intent(Main25Activity.this, Main26Activity.class);
                                        startActivity(j);
                                    }


                                });
                        AlertDialog alertDialog2 = alertDialogBuilder2.create();

                        alertDialog2.show();
                        break;

                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main25, menu);
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
