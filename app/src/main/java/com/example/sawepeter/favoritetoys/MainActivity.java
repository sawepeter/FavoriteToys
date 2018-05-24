package com.example.sawepeter.favoritetoys;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
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

    private RadioGroup placeTypeGroup;
    private RadioButton[] placeTypeButtons;
    private int[] CirclePlaceTypes = new int[] {1,2,4,2,4,6,4,3,2};
    private int[] HamPlaceTypes = new int[] {1,1,1,1};

    private SeekBar animationDurationSeek;
    private TextView animationDurationText;

    private SeekBar animationStartDelaySeek;
    private TextView animationStartDelayText;

    private SeekBar animationRotationDegreeSeek;
    private TextView animationRotationDegreeText;

    private CheckBox autodismiss;

    private RadioGroup showOrderTypeGroup;
    private RadioGroup hideOrderTypeGroup;

    private RadioGroup clickEffect;

    private ProgressBar animationListener;

    private boolean isInit = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater mInflater = LayoutInflater.from(this);

        mCustomView = mInflater.inflate(R.layout.custom_actionbar, null);
        TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title);
        mTitleTextView.setText("BoomMenu");

        boomMenuButtonInActionBar = (BoomMenuButton) mCustomView.findViewById(R.id.boom);

        mActionBar.setCustomView(mCustomView);
        mActionBar.setDisplayShowCustomEnabled(true);

        ((Toolbar) mCustomView.getParent()).setContentInsetsAbsolute(0,0);

        boomMenuButton = (BoomMenuButton)findViewById(R.id.boom);

        boomInfo = (BoomMenuButton)mCustomView.findViewById(R.id.info);

        initViews();
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

