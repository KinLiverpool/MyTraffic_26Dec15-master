package appewtc.masterung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit หรือ การประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();


        //Button Controller
        buttonController();

        // List view controller
        listViewController();

    }   // Main Method


    private void listViewController() {

        // Images
        // int[] intIcon = {1,2,3,4,5}; // #1 Assigning value to array
        int[] intIcon =  {R.drawable.traffic_01,R.drawable.traffic_02,R.drawable.traffic_03,R.drawable.traffic_04,R.drawable.traffic_05,
                            R.drawable.traffic_06,R.drawable.traffic_07,R.drawable.traffic_08,R.drawable.traffic_09,R.drawable.traffic_10,
                            R.drawable.traffic_11,R.drawable.traffic_12,R.drawable.traffic_13,R.drawable.traffic_14,R.drawable.traffic_15,
                            R.drawable.traffic_16,R.drawable.traffic_17,R.drawable.traffic_18,R.drawable.traffic_19,R.drawable.traffic_20};

        // reformat (alt + l)
        // #2 Title
        String[] strTitle = new String[20];
        strTitle[0] = "Topic1";
        strTitle[1] = "Topic2";
        strTitle[2] = "Topic3";
        strTitle[3] = "Topic4";
        strTitle[4] = "Topic5";
        strTitle[5] = "Topic6";
        strTitle[6] = "Topic7";
        strTitle[7] = "Topic8";
        strTitle[8] = "Topic9";
        strTitle[9] = "Topic10";
        strTitle[10] = "Topic11";
        strTitle[11] = "Topic12";
        strTitle[12] = "Topic13";
        strTitle[13] = "Topic14";
        strTitle[14] = "Topic15";
        strTitle[15] = "Topic16";
        strTitle[16] = "Topic17";
        strTitle[17] = "Topic18";
        strTitle[18] = "Topic19";
        strTitle[20] = "Topic20";

        // #3
        String[] strDetail = getResources().getStringArray(R.array.detail_short);
        // Call adapter
        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this,strTitle,strDetail,intIcon);
        trafficListView.setAdapter(objMyAdapter);
    }

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),
                        R.raw.cow);
                buttonMediaPlayer.start();

                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/uzSKvYbd1XQ"));
                startActivity(objIntent);

            }   // event
        });

    }   // buttonController



    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

}   // Main Class นี่คือ คลาสหลักเว้ยเห้ย
