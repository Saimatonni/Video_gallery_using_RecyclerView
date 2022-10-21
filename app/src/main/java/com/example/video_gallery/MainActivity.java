package com.example.video_gallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    VideoView videoView;
    ArrayList<Dataset> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        arrayList = new ArrayList<Dataset>();
        Dataset dataset = new Dataset("https://www.youtube.com/watch?v=nqXacA1egpw");
        arrayList.add(dataset);
        dataset = new Dataset("https://www.youtube.com/watch?v=KyCPky1-91U");
        arrayList.add(dataset);
        dataset = new Dataset("https://www.youtube.com/watch?v=tm0uGcXNHLc");
        arrayList.add(dataset);
        dataset = new Dataset("https://www.youtube.com/watch?v=u5D8JiSLc-M");
        arrayList.add(dataset);
        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);

    }
}