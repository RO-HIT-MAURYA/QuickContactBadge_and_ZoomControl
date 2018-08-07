package com.citizencenter.quickcontactbadge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.QuickContactBadge;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.imageView);

        ((QuickContactBadge)findViewById(R.id.quickContactBadge)).assignContactFromPhone("8898355265",false);

        ((ZoomControls)findViewById(R.id.zoomControl)).setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                findViewById(R.id.imageView).setScaleX((int)(x+1));
                findViewById(R.id.imageView).setScaleY((int)(y+1));
            }
        });
        ((ZoomControls)findViewById(R.id.zoomControl)).setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                findViewById(R.id.imageView).setScaleX((int)(x-1));
                findViewById(R.id.imageView).setScaleY((int)(y-1));
            }
        });
    }
}
