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
import android.graphics.DashPathEffect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.blue.MediaScanner;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import butterknife.BindView;
import butterknife.internal.Utils;

public class Menu2Result extends AppCompatActivity {
    Button save;
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] permissionstorage = {Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE};

    @BindView(R.id.result_scrollview) protected ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_result);

        // action bar 설정 (제목, 뒤로가기버튼)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트 결과");

        TextView texts1[] = new TextView[11];
        TextView texts2[] = new TextView[12];
        TextView texts3[] = new TextView[12];
        TextView texts4[] = new TextView[8];
        TextView texts5[] = new TextView[8];
        TextView texts6[] = new TextView[11];

        texts1[0] = (TextView) findViewById(R.id.answer_101);
        texts1[1] = (TextView) findViewById(R.id.answer_102);
        texts1[2] = (TextView) findViewById(R.id.answer_103);
        texts1[3] = (TextView) findViewById(R.id.answer_104);
        texts1[4] = (TextView) findViewById(R.id.answer_105);
        texts1[5] = (TextView) findViewById(R.id.answer_106);
        texts1[6] = (TextView) findViewById(R.id.answer_107);
        texts1[7] = (TextView) findViewById(R.id.answer_108);
        texts1[8] = (TextView) findViewById(R.id.answer_109);
        texts1[9] = (TextView) findViewById(R.id.answer_110);
        texts1[10] = (TextView) findViewById(R.id.answer_111);

        texts2[0] = (TextView) findViewById(R.id.answer_201);
        texts2[1] = (TextView) findViewById(R.id.answer_202);
        texts2[2] = (TextView) findViewById(R.id.answer_203);
        texts2[3] = (TextView) findViewById(R.id.answer_204);
        texts2[4] = (TextView) findViewById(R.id.answer_205);
        texts2[5] = (TextView) findViewById(R.id.answer_206);
        texts2[6] = (TextView) findViewById(R.id.answer_207);
        texts2[7] = (TextView) findViewById(R.id.answer_208);
        texts2[8] = (TextView) findViewById(R.id.answer_209);
        texts2[9] = (TextView) findViewById(R.id.answer_210);
        texts2[10] = (TextView) findViewById(R.id.answer_211);
        texts2[11] = (TextView) findViewById(R.id.answer_212);

        texts3[0] = (TextView) findViewById(R.id.answer_301);
        texts3[1] = (TextView) findViewById(R.id.answer_302);
        texts3[2] = (TextView) findViewById(R.id.answer_303);
        texts3[3] = (TextView) findViewById(R.id.answer_304);
        texts3[4] = (TextView) findViewById(R.id.answer_305);
        texts3[5] = (TextView) findViewById(R.id.answer_306);
        texts3[6] = (TextView) findViewById(R.id.answer_307);
        texts3[7] = (TextView) findViewById(R.id.answer_308);
        texts3[8] = (TextView) findViewById(R.id.answer_309);
        texts3[9] = (TextView) findViewById(R.id.answer_310);
        texts3[10] = (TextView) findViewById(R.id.answer_311);
        texts3[11] = (TextView) findViewById(R.id.answer_312);

        texts4[0] = (TextView) findViewById(R.id.answer_401);
        texts4[1] = (TextView) findViewById(R.id.answer_402);
        texts4[2] = (TextView) findViewById(R.id.answer_403);
        texts4[3] = (TextView) findViewById(R.id.answer_404);
        texts4[4] = (TextView) findViewById(R.id.answer_405);
        texts4[5] = (TextView) findViewById(R.id.answer_406);
        texts4[6] = (TextView) findViewById(R.id.answer_407);
        texts4[7] = (TextView) findViewById(R.id.answer_408);

        texts5[0] = (TextView) findViewById(R.id.answer_501);
        texts5[1] = (TextView) findViewById(R.id.answer_502);
        texts5[2] = (TextView) findViewById(R.id.answer_503);
        texts5[3] = (TextView) findViewById(R.id.answer_504);
        texts5[4] = (TextView) findViewById(R.id.answer_505);
        texts5[5] = (TextView) findViewById(R.id.answer_506);
        texts5[6] = (TextView) findViewById(R.id.answer_507);
        texts5[7] = (TextView) findViewById(R.id.answer_508);

        texts6[0] = (TextView) findViewById(R.id.answer_601);
        texts6[1] = (TextView) findViewById(R.id.answer_602);
        texts6[2] = (TextView) findViewById(R.id.answer_603);
        texts6[3] = (TextView) findViewById(R.id.answer_604);
        texts6[4] = (TextView) findViewById(R.id.answer_605);
        texts6[5] = (TextView) findViewById(R.id.answer_606);
        texts6[6] = (TextView) findViewById(R.id.answer_607);
        texts6[7] = (TextView) findViewById(R.id.answer_608);
        texts6[8] = (TextView) findViewById(R.id.answer_609);
        texts6[9] = (TextView) findViewById(R.id.answer_610);
        texts6[10] = (TextView) findViewById(R.id.answer_611);

        TextView[][] texts = new TextView[6][];
        texts[0] = texts1;
        texts[1] = texts2;
        texts[2] = texts3;
        texts[3] = texts4;
        texts[4] = texts5;
        texts[5] = texts6;

        ArrayList<ArrayList<TextView>> texts_ = new ArrayList<ArrayList<TextView>>(6);
        ArrayList<TextView> temp = new ArrayList<TextView>();
//        texts_.add()


        TextView titles[] = new TextView[6];
        titles[0] = (TextView) findViewById(R.id.answer_1);
        titles[1] = (TextView) findViewById(R.id.answer_2);
        titles[2] = (TextView) findViewById(R.id.answer_3);
        titles[3] = (TextView) findViewById(R.id.answer_4);
        titles[4] = (TextView) findViewById(R.id.answer_5);
        titles[5] = (TextView) findViewById(R.id.answer_6);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int[] answer1s = bundle.getIntArray("answer1");
        int[] answer2s = bundle.getIntArray("answer2");
        int[] answer3s = bundle.getIntArray("answer3");
        int[] answer4s = bundle.getIntArray("answer4");
        int[] answer5s = bundle.getIntArray("answer5");
        int[] answer6s = bundle.getIntArray("answer6");

        int[][] answers = new int[6][];
        answers[0] = answer1s;
        answers[1] = answer2s;
        answers[2] = answer3s;
        answers[3] = answer4s;
        answers[4] = answer5s;
        answers[5] = answer6s;


        // '전혀아니다, 아니다'가 한개라도 있으면 -> 소제목 visible, 아니면 gone
        int numTrue[] = new int[6];
        for (int i = 0; i < numTrue.length; ++i) {
            numTrue[i] = 0; // 0으로 초기화
        }

        // '전혀아니다, 아니다' 선택 문장 -> 가이드에 띄움
        for (int i = 0; i < answers.length; ++i) {
            for (int j = 0; j < answers[i].length; ++j) {
                if (answers[i][j] == 0 || answers[i][j] == 1) {
                    texts[i][j].setVisibility(View.VISIBLE);
                    ++numTrue[i];
                } else {
                    texts[i][j].setVisibility(View.GONE);
                }
            }
        }

        // '전혀아니다, 아니다'가 한개라도 있으면 -> 소제목 visible, 아니면 gone
        for (int i = 0; i < numTrue.length; ++i) {
            if (numTrue[i] != 0) {
                titles[i].setVisibility(View.VISIBLE);
            } else {
                titles[i].setVisibility(View.GONE);
            }
        }

        // 방사형 차트 점수 계산
        float[] scores = new float[6];
        for (int i = 0; i < answers.length; ++i) {
            float a = 0;
            int b = answers[i].length;

            for (int j = 0; j < answers[i].length; ++j) {
                switch (answers[i][j]) {
                    case 0:
                        break;
                    case 1:
                        a += 0.25;
                        break;
                    case 2:
                        a += 0.5;
                        break;
                    case 3:
                        a += 0.75;
                        break;
                    case 4:
                        a += 1;
                        break;
                    default:
                        b -= 1;
                }
            }
            scores[i] = (a == 0 && b == 0) ? 0 : ((float) a / b * 100);
        }

        /////////////////// RadarChart 설정 /////////////////////
        RadarChart radarChart;
        radarChart = findViewById(R.id.chart);

        ArrayList<RadarEntry> dataVals = new ArrayList<>();
        dataVals.add(new RadarEntry(scores[0]));
        dataVals.add(new RadarEntry(scores[1]));
        dataVals.add(new RadarEntry(scores[2]));
        dataVals.add(new RadarEntry(scores[3]));
        dataVals.add(new RadarEntry(scores[4]));
        dataVals.add(new RadarEntry(scores[5]));

        RadarDataSet dataSet = new RadarDataSet(dataVals, "DATA");
        //dataSet.enableDashedHighlightLine(10f, 5f, 0f);
        dataSet.setColor(getResources().getColor(R.color.blue_1));
        dataSet.setFillColor(getResources().getColor(R.color.blue_2));
        dataSet.setDrawFilled(true);
        dataSet.setValueTextSize(12);
        dataSet.setValueTextColor(Color.parseColor("#FF7F7F7F"));
        //dataSet.setFormLineDashEffect(new DashPathEffect(new float[]{10f, 5f}, 0f));


        RadarData data = new RadarData();
        data.addDataSet(dataSet);
        String[] labels = {"암호화폐 지갑", "거래", "보상", "큐레이팅", "보안", "증명"};

        XAxis xAxis = radarChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labels));
        xAxis.setTextSize(18);
        xAxis.setTextColor(R.color.navy_1);

        YAxis yAxis = radarChart.getYAxis();
        yAxis.setAxisMaximum(80);
        yAxis.setAxisMinimum(0);
        yAxis.setDrawLabels(false);

        radarChart.setData(data);
        radarChart.getDescription().setEnabled(false);
        radarChart.getLegend().setEnabled(false);


    }


    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            case R.id.menu_home:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_result, menu);
        return true;
    }

}