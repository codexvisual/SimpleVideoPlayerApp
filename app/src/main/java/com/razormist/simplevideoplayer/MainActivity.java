package com.razormist.simplevideoplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vv_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vv_display = (VideoView)findViewById(R.id.vv_display);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(path);
        vv_display.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        vv_display.setMediaController(mediaController);
        mediaController.setAnchorView(vv_display);

    }
}
