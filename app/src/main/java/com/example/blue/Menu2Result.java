package com.example.blue;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import butterknife.BindView;

public class Menu2Result extends AppCompatActivity {
    Button save;
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] permissionstorage = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};

    @BindView(R.id.scrollView) protected ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_result);

        TextView a601 = (TextView) findViewById(R.id.answer_601);
        TextView a602 = (TextView) findViewById(R.id.answer_602);
        TextView a603 = (TextView) findViewById(R.id.answer_603);
        TextView a604 = (TextView) findViewById(R.id.answer_604);
        TextView a605 = (TextView) findViewById(R.id.answer_605);
        TextView a606 = (TextView) findViewById(R.id.answer_606);
        TextView a607 = (TextView) findViewById(R.id.answer_607);
        TextView a608 = (TextView) findViewById(R.id.answer_608);
        TextView a609 = (TextView) findViewById(R.id.answer_609);
        TextView a610 = (TextView) findViewById(R.id.answer_610);
        TextView a611 = (TextView) findViewById(R.id.answer_611);

        TextView a6 = (TextView) findViewById(R.id.answer_6);

        // action bar 설정 (제목, 뒤로가기버튼)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트 결과");


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        boolean[] bool6 = bundle.getBooleanArray("answer6");


        // true가 한개라도 있으면 소제목 visible, 아니면 gone
        int numTrue6 = 0;


        if (bool6[0] == true) {
            a601.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a601.setVisibility(View.GONE);
        }
        if (bool6[1] == true) {
            a602.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a602.setVisibility(View.GONE);
        }
        if (bool6[2] == true) {
            a603.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a603.setVisibility(View.GONE);
        }
        if (bool6[3] == true) {
            a604.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a604.setVisibility(View.GONE);
        }if (bool6[4] == true) {
            a605.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a605.setVisibility(View.GONE);
        }
        if (bool6[5] == true) {
            a606.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a606.setVisibility(View.GONE);
        }
        if (bool6[6] == true) {
            a607.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a607.setVisibility(View.GONE);
        }
        if (bool6[7] == true) {
            a608.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a608.setVisibility(View.GONE);
        }
        if (bool6[8] == true) {
            a609.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a609.setVisibility(View.GONE);
        }if (bool6[9] == true) {
            a610.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a610.setVisibility(View.GONE);
        }
        if (bool6[10] == true) {
            a611.setVisibility(View.VISIBLE);
            ++numTrue6;
        } else {
            a611.setVisibility(View.GONE);
        }

        if (numTrue6 != 0) { a6.setVisibility(View.VISIBLE);
        } else { a6.setVisibility(View.GONE); }

        // 사진 저장 권한 확인
        verifystoragepermissions(this);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("사진 앨범에 저장하시겠습니까?");
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                screenshot(getWindow().getDecorView().getRootView(), "result");
                //print();
                //print(getWindow().getDecorView().getRootView());
                //print((View)findViewById(R.id.scrollView));

                Toast.makeText(getApplicationContext(), "사진 앨범에 저장되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });

        save = (Button) findViewById(R.id.save_guide);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.show();
            }
        });

    }


    private void print(View view){
        Bitmap bitmap = getBitmapFromView(view, view.getHeight(), view.getWidth());
        try {
            File defaultFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath());
            if (!defaultFile.exists())
                defaultFile.mkdirs();

            String filename = "UX guide";
            File file = new File(defaultFile,filename);
            if (file.exists()) {
                file.delete();
                file = new File(defaultFile,filename);
            }
            FileOutputStream output = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, output);
            output.flush();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //create bitmap from the view
    private Bitmap getBitmapFromView(View view,int height,int width) {
        Bitmap bitmap = Bitmap.createBitmap(width, height,Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Drawable bgDrawable = view.getBackground();
        if (bgDrawable!=null)
            bgDrawable.draw(canvas);
        else
            canvas.drawColor(Color.WHITE);
        view.draw(canvas);
        return bitmap;
    }

    protected static File screenshot(View view, String filename) {
        Date date = new Date();

        // Here we are initialising the format of our image name
        CharSequence format = android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", date);
        try {
            // Initialising the directory of storage
            String dirpath = Environment.getExternalStorageDirectory() + "";
            File file = new File(dirpath);
            if (!file.exists()) {
                boolean mkdir = file.mkdir();
            }

            // File name
            String path = dirpath + "/" + filename + "-" + format + ".jpeg";
            view.setDrawingCacheEnabled(true);
            Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
            view.setDrawingCacheEnabled(false);
            File imageurl = new File(path);
            FileOutputStream outputStream = new FileOutputStream(imageurl);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 50, outputStream);
            outputStream.flush();
            outputStream.close();
            return imageurl;

        } catch (FileNotFoundException io) {
            io.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // verifying if storage permission is given or not
    public static void verifystoragepermissions(Activity activity) {

        int permissions = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        // If storage permission is not given then request for External Storage Permission
        if (permissions != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity, permissionstorage, REQUEST_EXTERNAL_STORAGE);
        }
    }


    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

