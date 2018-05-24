package com.example.sawepeter.favoritetoys;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
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
import com.nightonke.boommenu.Types.BoomType;
import com.nightonke.boommenu.Types.ButtonType;
import com.nightonke.boommenu.Types.PlaceType;
import com.nightonke.boommenu.Util;

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

        public void onWindowFocusChanged(boolean hasFocus) {
            super.onWindowFocusChanged(hasFocus);

            if (!isInit) {
                initBoom();
                initInfoBoom();
            }
            isInit = true;
        }

        private void initInfoBoom() {

            Drawable [] drawables = new Drawable[3];
            int[] drawablesResource = new int[]{
                    R.drawable.boom,
                    R.drawable.github,
                    R.drawable.java
            };
            for (int i=0; i < 3; i++)
                drawables[i] = ContextCompat.getDrawable(mContext,drawablesResource[i]);

            int[][] colors = new int[3][2];
            for (int i =0; i<3; i++) {
                colors[i][1] = ContextCompat.getColor(mContext, R.color.material_white);
                colors[i][0] = Util.getInstance().getPressedColor(colors[i][1]);
            }
            //now with Builder, you can init BMB more convenient

            new BoomMenuButton.Builder()
                    .subButtons(drawables,colors, new String[]{"BoomMenuButton", "View source code"})
                    .button(ButtonType.HAM)
                    .boom(BoomType.PARABOLA_2)
                    .place(PlaceType.HAM_3_1)
                    .subButtonsShadow(Util.getInstance().dp2px(2),Util.getInstance().dp2px(2))
                    .subButtonTextColor(ContextCompat.getColor(mContext,R.color.black))
                    })

        }

}

