package com.example.sawepeter.favoritetoys;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.nightonke.boommenu.BoomMenuButton;

public class MainActivity extends AppCompatActivity implements BoomMenuButton.OnSubButtonClickListener,BoomMenuButton.AnimatorListener,View.OnClickListener{
    private BoomMenuButton boomMenuButton;
    private BoomMenuButton boomMenuButtonInActionBar;
    private BoomMenuButton boomInfo;

    private Context mContext;
    private View mCustomView;

    private RadioGroup buttonTypeGroup;

    private SeekBar buttonNumberSeek;
    private TextView buttonNumberText;

    private RadioGroup boomTypeGroup;
    private RadioButton[] boomTypeButtons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void toShow() {

    }

    @Override
    public void showing(float fraction) {

    }

    @Override
    public void showed() {

    }

    @Override
    public void toHide() {

    }

    @Override
    public void hiding(float fraction) {

    }

    @Override
    public void hided() {

    }

    @Override
    public void onClick(int buttonIndex) {

    }
}

