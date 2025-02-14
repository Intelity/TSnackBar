package com.androidadvance.tsnackbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.androidadvance.topsnackbar.TSnackbar;


public class MainActivity extends AppCompatActivity {

    private RelativeLayout relative_layout_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_example_1 = (Button) findViewById(R.id.button_example_1);
        Button button_example_2 = (Button) findViewById(R.id.button_example_2);
        Button button_example_3 = (Button) findViewById(R.id.button_example_3);
        Button button_example_4 = (Button) findViewById(R.id.button_example_4);
        Button button_example_5 = (Button) findViewById(R.id.button_example_5);
        Button button_example_6 = (Button) findViewById(R.id.button_example_6);
        Button button_toolbar = (Button) findViewById(R.id.button_example_toolbar);

        relative_layout_main = (RelativeLayout) findViewById(R.id.relative_layout_main);

        button_example_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TSnackbar.make(relative_layout_main, "Hello from VSnackBar 1", TSnackbar.LENGTH_LONG)
                        .show();
            }
        });


        button_example_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TSnackbar snackbar = TSnackbar
                        .make(relative_layout_main, "Had a long snack at Snackbar", TSnackbar.LENGTH_VERY_LONG)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.d("Action Button", "onClick triggered");
                            }
                        });
                snackbar.setActionTextColor(Color.LTGRAY);
                snackbar.addIcon(R.mipmap.ic_core, 200);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#555555"));
                TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
                textView.setTextColor(Color.WHITE);
                snackbar.show();

            }
        });


        button_example_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TSnackbar snackbar = TSnackbar
                        .make(relative_layout_main, "Had a snack at Snackbar", TSnackbar.LENGTH_LONG)
                        .setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.d("CLICKED Action", "CLIDKED Action");
                            }
                        });
                snackbar.setActionTextColor(Color.WHITE);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#0000CC"));
                TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
                textView.setTextColor(Color.WHITE);
                snackbar.show();

            }
        });


        button_example_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TSnackbar snackbar = TSnackbar
                        .make(relative_layout_main, "Had a snack at Snackbar  Had a snack at Snackbar  Had a snack at Snackbar Had a snack at Snackbar Had a snack at Snackbar Had a snack at Snackbar", TSnackbar.LENGTH_LONG);
                snackbar.setActionTextColor(Color.WHITE);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));
                TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);
                snackbar.show();

            }
        });

        button_example_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TSnackbar snackbar = TSnackbar
                        .make(relative_layout_main, "Snacking with VectorDrawable", TSnackbar.LENGTH_LONG);
                snackbar.setActionTextColor(Color.WHITE);
                snackbar.setIconLeft(R.drawable.ic_android_green_24dp, 24);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));
                TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);
                snackbar.show();

            }
        });

        button_example_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TSnackbar snackbar = TSnackbar
                        .make(relative_layout_main, "Snacking Left & Right", TSnackbar.LENGTH_LONG);
                snackbar.setActionTextColor(Color.WHITE);
                snackbar.setIconLeft(R.mipmap.ic_core, 24); //Size in dp - 24 is great!
                snackbar.setIconRight(R.drawable.ic_android_green_24dp, 48); //Resize to bigger dp
                snackbar.setIconPadding(8);
                snackbar.setMaxWidth(3000);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));
                TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);
                snackbar.show();

            }
        });

        button_toolbar.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ToolbarActivityExample.class));
            }
        });
    }
}
