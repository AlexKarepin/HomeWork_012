package com.karepin.homework_012;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public TextView editText;
    ArrayList<TextView> textOnScreen = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        editText = findViewById(R.id.screenTextView);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.but0:
                editText.setText(getText(R.string._0));
                break;
            case R.id.but1:
                editText.setText(getText(R.string._1));
                break;
            case R.id.but2:
                editText.setText(getText(R.string._2));
                break;
            case R.id.but3:
                editText.setText(getText(R.string._3));
                break;
            case R.id.but4:
                editText.setText(getText(R.string._4));
                break;
            case R.id.but5:
                editText.setText(getText(R.string._5));
                break;
            case R.id.but6:
                editText.setText(getText(R.string._6));
                break;
            case R.id.but7:
                editText.setText(getText(R.string._7));
                break;
            case R.id.but8:
                editText.setText(getText(R.string._8));
                break;
            case R.id.but9:
                editText.setText(getText(R.string._9));
                break;
        }
//        public void onSingClick(View view){
//            switch (view.getId()) {
//                case R.id.sign:
//                    editText.setText(getText(R.string._0));
//                    break;
//                case R.id.but1:
//                    editText.setText("1");
//                    break;
//                case R.id.but2:
//                    editText.setText("2");
//                    break;
//                case R.id.but3:
//                    editText.setText("3");
//                    break;
//                case R.id.but4:
//                    editText.setText("4");
//                    break;
//                case R.id.but5:
//                    editText.setText("5");
//                    break;
//                case R.id.but6:
//                    editText.setText("6");
//                    break;
//                case R.id.but7:
//                    editText.setText("7");
//                    break;
//            }
//        }
    }
}
