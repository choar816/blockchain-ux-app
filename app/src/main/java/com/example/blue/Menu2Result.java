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
import butterknife.internal.Utils;

public class Menu2Result extends AppCompatActivity {
    Button save;
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] permissionstorage = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};

    @BindView(R.id.scrollView) protected ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_result);

        // action bar 설정 (제목, 뒤로가기버튼)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트 결과");

        TextView a101 = (TextView) findViewById(R.id.answer_101);
        TextView a102 = (TextView) findViewById(R.id.answer_102);
        TextView a103 = (TextView) findViewById(R.id.answer_103);
        TextView a104 = (TextView) findViewById(R.id.answer_104);
        TextView a105 = (TextView) findViewById(R.id.answer_105);
        TextView a106 = (TextView) findViewById(R.id.answer_106);
        TextView a107 = (TextView) findViewById(R.id.answer_107);
        TextView a108 = (TextView) findViewById(R.id.answer_108);
        TextView a109 = (TextView) findViewById(R.id.answer_109);
        TextView a110 = (TextView) findViewById(R.id.answer_110);
        TextView a111 = (TextView) findViewById(R.id.answer_111);

        TextView a201 = (TextView) findViewById(R.id.answer_201);
        TextView a202 = (TextView) findViewById(R.id.answer_202);
        TextView a203 = (TextView) findViewById(R.id.answer_203);
        TextView a204 = (TextView) findViewById(R.id.answer_204);
        TextView a205 = (TextView) findViewById(R.id.answer_205);
        TextView a206 = (TextView) findViewById(R.id.answer_206);
        TextView a207 = (TextView) findViewById(R.id.answer_207);
        TextView a208 = (TextView) findViewById(R.id.answer_208);
        TextView a209 = (TextView) findViewById(R.id.answer_209);
        TextView a210 = (TextView) findViewById(R.id.answer_210);
        TextView a211 = (TextView) findViewById(R.id.answer_211);
        TextView a212 = (TextView) findViewById(R.id.answer_212);

        TextView a301 = (TextView) findViewById(R.id.answer_301);
        TextView a302 = (TextView) findViewById(R.id.answer_302);
        TextView a303 = (TextView) findViewById(R.id.answer_303);
        TextView a304 = (TextView) findViewById(R.id.answer_304);
        TextView a305 = (TextView) findViewById(R.id.answer_305);
        TextView a306 = (TextView) findViewById(R.id.answer_306);
        TextView a307 = (TextView) findViewById(R.id.answer_307);
        TextView a308 = (TextView) findViewById(R.id.answer_308);
        TextView a309 = (TextView) findViewById(R.id.answer_309);
        TextView a310 = (TextView) findViewById(R.id.answer_310);
        TextView a311 = (TextView) findViewById(R.id.answer_311);
        TextView a312 = (TextView) findViewById(R.id.answer_312);

        TextView a401 = (TextView) findViewById(R.id.answer_401);
        TextView a402 = (TextView) findViewById(R.id.answer_402);
        TextView a403 = (TextView) findViewById(R.id.answer_403);
        TextView a404 = (TextView) findViewById(R.id.answer_404);
        TextView a405 = (TextView) findViewById(R.id.answer_405);
        TextView a406 = (TextView) findViewById(R.id.answer_406);
        TextView a407 = (TextView) findViewById(R.id.answer_407);
        TextView a408 = (TextView) findViewById(R.id.answer_408);

        TextView a501 = (TextView) findViewById(R.id.answer_501);
        TextView a502 = (TextView) findViewById(R.id.answer_502);
        TextView a503 = (TextView) findViewById(R.id.answer_503);
        TextView a504 = (TextView) findViewById(R.id.answer_504);
        TextView a505 = (TextView) findViewById(R.id.answer_505);
        TextView a506 = (TextView) findViewById(R.id.answer_506);
        TextView a507 = (TextView) findViewById(R.id.answer_507);
        TextView a508 = (TextView) findViewById(R.id.answer_508);

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

        TextView a1 = (TextView) findViewById(R.id.answer_1);
        TextView a2 = (TextView) findViewById(R.id.answer_2);
        TextView a3 = (TextView) findViewById(R.id.answer_3);
        TextView a4 = (TextView) findViewById(R.id.answer_4);
        TextView a5 = (TextView) findViewById(R.id.answer_5);
        TextView a6 = (TextView) findViewById(R.id.answer_6);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        boolean[] bool1 = bundle.getBooleanArray("answer1");
        boolean[] bool2 = bundle.getBooleanArray("answer2");
        boolean[] bool3 = bundle.getBooleanArray("answer3");
        boolean[] bool4 = bundle.getBooleanArray("answer4");
        boolean[] bool5 = bundle.getBooleanArray("answer5");
        boolean[] bool6 = bundle.getBooleanArray("answer6");

        // true가 한개라도 있으면 소제목 visible, 아니면 gone
        int numTrue1 = 0;
        int numTrue2 = 0;
        int numTrue3 = 0;
        int numTrue4 = 0;
        int numTrue5 = 0;
        int numTrue6 = 0;

        int numGuide = 0;

        // Chap 1 가이드

        if (bool1[0] == true) {
            a101.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a101.setVisibility(View.GONE);
        }
        if (bool1[1] == true) {
            a102.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a102.setVisibility(View.GONE);
        }
        if (bool1[2] == true) {
            a103.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a103.setVisibility(View.GONE);
        }
        if (bool1[3] == true) {
            a104.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a104.setVisibility(View.GONE);
        }
        if (bool1[4] == true) {
            a105.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a105.setVisibility(View.GONE);
        }
        if (bool1[5] == true) {
            a106.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a106.setVisibility(View.GONE);
        }
        if (bool1[6] == true) {
            a107.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a107.setVisibility(View.GONE);
        }
        if (bool1[7] == true) {
            a108.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a108.setVisibility(View.GONE);
        }
        if (bool1[8] == true) {
            a109.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a109.setVisibility(View.GONE);
        }
        if (bool1[9] == true) {
            a110.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a110.setVisibility(View.GONE);
        }
        if (bool1[10] == true) {
            a111.setVisibility(View.VISIBLE);
            ++numTrue1;
        } else {
            a111.setVisibility(View.GONE);
        }

        // Chap 2 가이드

        if (bool2[0] == true) {
            a201.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a201.setVisibility(View.GONE);
        }
        if (bool2[1] == true) {
            a202.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a202.setVisibility(View.GONE);
        }
        if (bool2[2] == true) {
            a203.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a203.setVisibility(View.GONE);
        }
        if (bool2[3] == true) {
            a204.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a204.setVisibility(View.GONE);
        }
        if (bool2[4] == true) {
            a205.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a205.setVisibility(View.GONE);
        }
        if (bool2[5] == true) {
            a206.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a206.setVisibility(View.GONE);
        }
        if (bool2[6] == true) {
            a207.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a207.setVisibility(View.GONE);
        }
        if (bool2[7] == true) {
            a208.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a208.setVisibility(View.GONE);
        }
        if (bool2[8] == true) {
            a209.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a209.setVisibility(View.GONE);
        }

        if (bool2[9] == true) {
            a210.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a210.setVisibility(View.GONE);
        }
        if (bool2[10] == true) {
            a211.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a211.setVisibility(View.GONE);
        }
        if (bool2[11] == true) {
            a212.setVisibility(View.VISIBLE);
            ++numTrue2;
        } else {
            a212.setVisibility(View.GONE);
        }

        // Chap 3 가이드

        if (bool3[0] == true) {
            a301.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a301.setVisibility(View.GONE);
        }
        if (bool3[1] == true) {
            a302.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a302.setVisibility(View.GONE);
        }
        if (bool3[2] == true) {
            a303.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a303.setVisibility(View.GONE);
        }
        if (bool3[3] == true) {
            a304.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a304.setVisibility(View.GONE);
        }
        if (bool3[4] == true) {
            a305.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a305.setVisibility(View.GONE);
        }
        if (bool3[5] == true) {
            a306.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a306.setVisibility(View.GONE);
        }
        if (bool3[6] == true) {
            a307.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a307.setVisibility(View.GONE);
        }
        if (bool3[7] == true) {
            a308.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a308.setVisibility(View.GONE);
        }
        if (bool3[8] == true) {
            a309.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a309.setVisibility(View.GONE);
        }
        if (bool3[9] == true) {
            a310.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a310.setVisibility(View.GONE);
        }
        if (bool3[10] == true) {
            a311.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a311.setVisibility(View.GONE);
        }
        if (bool3[11] == true) {
            a312.setVisibility(View.VISIBLE);
            ++numTrue3;
        } else {
            a312.setVisibility(View.GONE);
        }

        // Chap 4 가이드

        if (bool4[0] == true) {
            a401.setVisibility(View.VISIBLE);
            ++numTrue4;
        } else {
            a401.setVisibility(View.GONE);
        }
        if (bool4[1] == true) {
            a402.setVisibility(View.VISIBLE);
            ++numTrue4;
        } else {
            a402.setVisibility(View.GONE);
        }
        if (bool4[2] == true) {
            a403.setVisibility(View.VISIBLE);
            ++numTrue4;
        } else {
            a403.setVisibility(View.GONE);
        }
        if (bool4[3] == true) {
            a404.setVisibility(View.VISIBLE);
            ++numTrue4;
        } else {
            a404.setVisibility(View.GONE);
        }
        if (bool4[4] == true) {
            a405.setVisibility(View.VISIBLE);
            ++numTrue4;
        } else {
            a405.setVisibility(View.GONE);
        }
        if (bool4[5] == true) {
            a406.setVisibility(View.VISIBLE);
            ++numTrue4;
        } else {
            a406.setVisibility(View.GONE);
        }
        if (bool4[6] == true) {
            a407.setVisibility(View.VISIBLE);
            ++numTrue4;
        } else {
            a407.setVisibility(View.GONE);
        }
        if (bool4[7] == true) {
            a408.setVisibility(View.VISIBLE);
            ++numTrue4;
        } else {
            a408.setVisibility(View.GONE);
        }


        // Chap 5 가이드

        if (bool5[0] == true) {
            a501.setVisibility(View.VISIBLE);
            ++numTrue5;
        } else {
            a501.setVisibility(View.GONE);
        }
        if (bool5[1] == true) {
            a502.setVisibility(View.VISIBLE);
            ++numTrue5;
        } else {
            a502.setVisibility(View.GONE);
        }
        if (bool5[2] == true) {
            a503.setVisibility(View.VISIBLE);
            ++numTrue5;
        } else {
            a503.setVisibility(View.GONE);
        }
        if (bool5[3] == true) {
            a504.setVisibility(View.VISIBLE);
            ++numTrue5;
        } else {
            a504.setVisibility(View.GONE);
        }
        if (bool5[4] == true) {
            a505.setVisibility(View.VISIBLE);
            ++numTrue5;
        } else {
            a505.setVisibility(View.GONE);
        }
        if (bool5[5] == true) {
            a506.setVisibility(View.VISIBLE);
            ++numTrue5;
        } else {
            a506.setVisibility(View.GONE);
        }
        if (bool5[6] == true) {
            a507.setVisibility(View.VISIBLE);
            ++numTrue5;
        } else {
            a507.setVisibility(View.GONE);
        }
        if (bool5[7] == true) {
            a508.setVisibility(View.VISIBLE);
            ++numTrue5;
        } else {
            a508.setVisibility(View.GONE);
        }


        // Chap 6 가이드

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
        }
        if (bool6[4] == true) {
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
        }

        if (bool6[9] == true) {
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

        if (numTrue1 != 0) { a1.setVisibility(View.VISIBLE);
        } else { a1.setVisibility(View.GONE); }
        if (numTrue2 != 0) { a2.setVisibility(View.VISIBLE);
        } else { a2.setVisibility(View.GONE); }
        if (numTrue3 != 0) { a3.setVisibility(View.VISIBLE);
        } else { a3.setVisibility(View.GONE); }
        if (numTrue4 != 0) { a4.setVisibility(View.VISIBLE);
        } else { a4.setVisibility(View.GONE); }
        if (numTrue5 != 0) { a5.setVisibility(View.VISIBLE);
        } else { a5.setVisibility(View.GONE); }
        if (numTrue6 != 0) { a6.setVisibility(View.VISIBLE);
        } else { a6.setVisibility(View.GONE); }

        numGuide = numTrue1 + numTrue2 + numTrue3 + numTrue4 + numTrue5 + numTrue6;


        // 사진 저장 권한 확인
        verifystoragepermissions(this);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("사진 앨범에 저장하시겠습니까?");
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                screenshot(getWindow().getDecorView().getRootView(), "result");

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



    protected static File screenshot(View view, String filename) {
        Date date = new Date();

        // Here we are initialising the format of our image name
        CharSequence format = android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", date);
        try {
            // Initialising the directory of storage
            String dirpath = Environment.getExternalStorageDirectory().toString();
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

