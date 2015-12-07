package com.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @InjectView(R.id.textView)
    TextView textView;
    @InjectView(R.id.bt1)
    Button bt1;
    @InjectView(R.id.bt2)
    Button bt2;
    @InjectView(R.id.tv1)
    TextView tv1;
    @InjectView(R.id.tv2)
    TextView tv2;
    @InjectView(R.id.tv3)
    TextView tv3;
    @InjectView(R.id.tv4)
    TextView tv4;

    @OnClick(R.id.bt1)
    public void finishA() {
        Toast.makeText(this, "heheh", 0).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ButterKnife.inject(this);

    }

}



