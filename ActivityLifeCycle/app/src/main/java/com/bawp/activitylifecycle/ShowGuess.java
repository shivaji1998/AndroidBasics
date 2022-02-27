package com.bawp.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {
    private TextView showGuessTextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        Bundle extra = getIntent().getExtras();

        showGuessTextview  = findViewById(R.id.received_textview);

        if (extra != null) {
            showGuessTextview.setText(extra.getString("guess"));
            Log.d("Name extra", "onCreate: " + extra.getString("name"));
            Log.d("Name extra 2", "onCreate: " + extra.getInt("age"));
        }

        showGuessTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                intent.putExtra("message_back", "From Second Activity");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

//        if (getIntent().getStringExtra("guess") != null) {
//            Log.d("Stuff", " " + getIntent().getStringExtra("name"));
//            showGuessTextview.setText(getIntent().getStringExtra("guess"));
//        }








    }
}
