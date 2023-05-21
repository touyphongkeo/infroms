package com.app.exersices;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.app.exersices.utils.BaseActivity;
import com.app.onlinesmartpos.R;

import java.text.DecimalFormat;

import cn.pedant.SweetAlert.SweetAlertDialog;
import pl.droidsonroids.gif.GifImageView;

public class Exersice_7Activity extends BaseActivity {
    //Initialize variable
    TextView textView,start;
    DecimalFormat f;
    DecimalFormat formatter = new DecimalFormat("#,###");
    ImageView image;
    MediaPlayer player;
    private Context context;
    GifImageView exersice_3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exersice_7);
        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Exersice 07");
        //Assign variable
        textView = findViewById(R.id.text_view);
        start = findViewById(R.id.start);
        image = findViewById(R.id.image);
        exersice_3 = findViewById(R.id.exersice_3);
        //Initalize time duration
        f = new DecimalFormat("#,###");

        player = MediaPlayer.create(this, R.raw.onsize);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
                textView.setVisibility(View.VISIBLE);
                image.setVisibility(View.GONE);
                exersice_3.setVisibility(View.VISIBLE);
                new CountDownTimer(60000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        double aa = millisUntilFinished / 1000;
                        String bb = String.valueOf(formatter.format(aa));

                        if (bb.equals("20")){
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.RED);
                        }else if(bb.equals("19")){
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.BLUE);
                        } else if (bb.equals("18")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.RED);
                        }else if (bb.equals("17")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.BLUE);
                        }else if (bb.equals("16")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.RED);
                        }else if (bb.equals("15")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.BLUE);
                        }else if (bb.equals("14")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.RED);
                        }else if (bb.equals("13")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.BLUE);
                        }else if (bb.equals("12")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.RED);
                        }else if (bb.equals("11")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.BLUE);
                        }else if (bb.equals("10")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.RED);
                        }else if (bb.equals("9")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.BLUE);
                        }else if (bb.equals("8")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.RED);
                        }else if (bb.equals("7")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.BLUE);
                        }else if (bb.equals("6")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.RED);
                        }else if (bb.equals("5")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.BLUE);
                        }else if (bb.equals("4")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.RED);
                        }else if (bb.equals("3")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.BLUE);
                        }else if (bb.equals("2")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.RED);
                        }else if (bb.equals("1")) {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.BLUE);
                        }else if (bb.equals("0")) {
                            textView.setText("("+"Seconds Remaining: 00: " +"00"+")");
                            textView.setTextColor(Color.RED);
                        }else {
                            textView.setText("("+"Seconds Remaining: 00: " +bb+")");
                            textView.setTextColor(Color.GREEN);
                        }
                        start.setVisibility(View.GONE);
                        //here you can have your logic to set text to edittext
                    }
                    public void onFinish() {
                       // textView.setText("done!");
                        start.setVisibility(View.VISIBLE);
                        image.setVisibility(View.VISIBLE);
                        exersice_3.setVisibility(View.GONE);
                        textView.setVisibility(View.GONE);
                        successMessage();
                    }
                }.start();
            }
        });


    }

    //for back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void successMessage() {
        new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE).setTitleText("Done!!").setContentText("exercise 07!").show();

    }
}
