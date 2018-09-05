package com.openbrowser.supermiware.roughStuffInputDialog;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the alertDialog builder

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // set your dialogs' title
        builder.setTitle("Set your title on line 27 in MainActivity");

// Set up the inputs you'd like to use

        final EditText input = new EditText(this);
        final EditText input2 = new EditText(this);
        final Button button = new Button(this);

// Specify the type of input expected; this, for example, sets the input as a TEXT.

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_TEXT);
        layout.addView(input);

        input2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_CLASS_TEXT);
        layout.addView(input2);

        // Create the color you'd like your buttons background
        int Blue = Color.parseColor("#00bfff");
        button.setBackgroundColor(Blue);

        // Set your buttons text
        button.setText("test");

        // Add your button to your layout (LinearLayout)
        layout.addView(button);

        // Set your builder to the layoutView you created above
        builder.setView(layout);

// Set up your " OK " and your " Cancel " button
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String text = "";

                // Set up what you would like to do if the user clicks okay
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

                // set up what you'd like to do if the user clicks cancel
            }
        });

        builder.show();
    }
}
