package com.example.android.listviewpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvAndoridVersion;
    ArrayList<AndroidVersion> mAndroidVersions;
    AndroidAdapter mAndroidAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvAndoridVersion = findViewById(R.id.lvAndoridVersion);
        mAndroidVersions = new ArrayList<>();
        populateArrayList(mAndroidVersions);
        mAndroidAdapter = new AndroidAdapter(mAndroidVersions);
        lvAndoridVersion.setAdapter(mAndroidAdapter);


    }

    private void populateArrayList(ArrayList<AndroidVersion> mAndroidVersions) {
        mAndroidVersions.add(new AndroidVersion(
                "Cupcake",
                "1.5",
                "3",
                R.drawable.android_cupcake
        ));
        mAndroidVersions.add(new AndroidVersion(
                "Donut",
                "1.6",
                "4",
                R.drawable.android_donut

        ));
        mAndroidVersions.add(new AndroidVersion(
                "Eclair",
                "2.0 - 2.1",
                "5 - 7",
                R.drawable.android_eclair

        ));
        mAndroidVersions.add(new AndroidVersion(
                "Froyo",
                "2.2 - 2.2.3",
                "8",
                R.drawable.android_froyo

        ));
        mAndroidVersions.add(new AndroidVersion(
                "GingerBread",
                "2.3 - 2.3.7",
                "9 - 10",
                R.drawable.android_gingerbread

        ));
        mAndroidVersions.add(new AndroidVersion(
                "Honeycomb",
                "3.0 - 3.2.6",
                "11 - 13",
                R.drawable.android_honeycomb

        ));
        mAndroidVersions.add(new AndroidVersion(
                "IceCream",
                "4.0 - 4.0.4",
                "14 - 15",
                R.drawable.android_icecream

        ));
        mAndroidVersions.add(new AndroidVersion(
                "JellyBean",
                "4.1 - 4.3.1",
                "16 - 18",
                R.drawable.android_jellybean

        ));
        mAndroidVersions.add(new AndroidVersion(
                "KitKat",
                "4.4 - 4.4.4",
                "19 - 20",
                R.drawable.android_kitkat

        ));
        mAndroidVersions.add(new AndroidVersion(
                "LolliPop",
                "5.0 - 5.1.1",
                "21 - 22",
                R.drawable.android_lollipop
        ));
        mAndroidVersions.add(new AndroidVersion(
                "Marshmallow",
                "6.0 - 6.0.1",
                "23",
                R.drawable.android_marshmallow

        ));
        mAndroidVersions.add(new AndroidVersion(
                "Nougat",
                "7.0 – 7.1.2",
                "24 - 25",
                R.drawable.android_nougat

        ));
        mAndroidVersions.add(new AndroidVersion(
                "Oreo",
                "8.0 – 8.1",
                "26 – 27",
                R.drawable.android_oreo

        ));
    }
}
