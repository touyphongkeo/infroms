package com.app.exersices;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.app.onlinesmartpos.R;
import com.app.exersices.utils.BaseActivity;
import com.app.exersices.utils.LocaleManager;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.List;

import cn.pedant.SweetAlert.SweetAlertDialog;
import es.dmoral.toasty.Toasty;

public class HomeActivity extends BaseActivity {
    private int[] mImages = new int[] {
            R.drawable.efex1, R.drawable.erreee1,R.drawable.gbvf,R.drawable.ytre

    };


    CardView  exersice_7,exersice_11,exersice_1,card_pos,exersice_6,exersice_3,exersice_4,exersice_5,exersice_8,exersice_9,exersice_10,exersice_12,exersice_13,exersice_14,exersice_15;
    //for double back press to exit
    private static final int TIME_DELAY = 2000;
    private static long backPressed;
    private Context context;

    SharedPreferences sp;
    SharedPreferences.Editor editor;
    String userType;
    TextView txtShopName,txtSubText,views,view2s,view3;

    ProgressDialog loading;
    ImageView image_view;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle(R.string.app_name);
     //   getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.actionbar_gradient));
        getSupportActionBar().hide();
        successMessage();
        exersice_1 = findViewById(R.id.exersice_1);
        card_pos = findViewById(R.id.card_pos);
        exersice_3 = findViewById(R.id.exersice_3);
        exersice_4 = findViewById(R.id.exersice_4);
        exersice_5 = findViewById(R.id.exersice_5);
        exersice_6 = findViewById(R.id.exersice_6);
        exersice_7 = findViewById(R.id.exersice_7);
        exersice_8 = findViewById(R.id.exersice_8);
        exersice_9 = findViewById(R.id.exersice_9);
        exersice_10 = findViewById(R.id.exersice_10);
        exersice_11 = findViewById(R.id.exersice_11);
        exersice_12 = findViewById(R.id.exersice_12);
        exersice_13 = findViewById(R.id.exersice_13);
        exersice_14 = findViewById(R.id.exersice_14);
        exersice_15 = findViewById(R.id.exersice_15);


        CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });

        exersice_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_15Activity.class);
                startActivity(i);
            }
        });

        exersice_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_14Activity.class);
                startActivity(i);
            }
        });

        exersice_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_13Activity.class);
                startActivity(i);
            }
        });



        exersice_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_12Activity.class);
                startActivity(i);
            }
        });

        exersice_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_11Activity.class);
                startActivity(i);
            }
        });



        exersice_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_10Activity.class);
                startActivity(i);
            }
        });

        exersice_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_9Activity.class);
                startActivity(i);
            }
        });

        exersice_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_8Activity.class);
                startActivity(i);
            }
        });


        exersice_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_7Activity.class);
                startActivity(i);
            }
        });

        exersice_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_6Activity.class);
                startActivity(i);
            }
        });


        exersice_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_5Activity.class);
                startActivity(i);
            }
        });

        exersice_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_1Activity.class);
                startActivity(i);
            }
        });



        exersice_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_4Activity.class);
                startActivity(i);
            }
        });

        card_pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, CountActivity.class);
                startActivity(i);
            }
        });


        exersice_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Exersice_3Activity.class);
                startActivity(i);
            }
        });



        if (Build.VERSION.SDK_INT >= 23) {
            requestPermission();
        }
    }

    public void successMessage() {
        new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE).setTitleText("Hi!").setContentText("Welcome to the exercise!").show();

    }








    private void setNewLocale(AppCompatActivity mContext, @LocaleManager.LocaleDef String language) {
        LocaleManager.setNewLocale(this, language);
        Intent intent = mContext.getIntent();
        startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
    }

    //double back press to exit
    @Override
    public void onBackPressed() {
        if (backPressed + TIME_DELAY > System.currentTimeMillis()) {
            finishAffinity();
        } else {
            Toasty.info(this, R.string.press_once_again_to_exit,
                    Toast.LENGTH_SHORT).show();
        }
        backPressed = System.currentTimeMillis();
    }


    private void requestPermission() {
        Dexter.withActivity(this)
                .withPermissions(
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.CAMERA,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport report) {
                        // check if all permissions are granted
                        if (report.areAllPermissionsGranted()) {
                            //write your action if needed
                        }
                        // check for permanent denial of any permission
                        if (report.isAnyPermissionPermanentlyDenied()) {
                            // show alert dialog navigating to Settings
                        }
                    }
                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                        token.continuePermissionRequest();
                    }
                }).
                withErrorListener(error -> Toast.makeText(getApplicationContext(), R.string.error, Toast.LENGTH_SHORT).show())
                .onSameThread()
                .check();
    }
}
