package com.example.mrbennerham.calendar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Menu_Home extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_home);
        final Button btn1 = (Button) findViewById(R.id.calendarbutton);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent1);

//                Intent intent1 = new Intent(getApplicationContext(), AddEvent_MainActivity.class);
//                startActivity(intent1);


                // String packageName = "com.google.android.calendar";
                // startApp(packageName);
               /* Intent intent = new Intent(Intent.ACTION_INSERT);
                intent.setType("vnd.android.cursor.item/event");
                Calendar cal = Calendar.getInstance();
                long startTime = cal.getTimeInMillis();
                long endTime = cal.getTimeInMillis()  + 60 * 60 * 1000;
                intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, startTime);
                intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,endTime);
                intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                intent.putExtra(CalendarContract.Events.TITLE, "ประจำเดือน");

                startActivity(intent);*/


//                intent.setType("vnd.android.cursor.item/event");
//               / intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, endTime);
//                intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,endTime);

//                intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, endTime);
//                intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
//                intent.putExtra(CalendarContract.Events.TITLE, "ตกไข่");
//                startActivity(intent);
            }
        });

        final Button btn2 = (Button) findViewById(R.id.notificationbutton);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Main_Notifications.class);
                startActivity(intent2);

            }
        });
        final Button btn3 = (Button) findViewById(R.id.faqbutton);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent3);

            }
        });
        final Button btn4 = (Button) findViewById(R.id.doctorbutton);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), Calendar_Doctor.class);
                startActivity(intent4);

            }
        });
        /*final Button btn1 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_INSERT);
                intent.setType("vnd.android.cursor.item/event");
                startActivity(intent);

            }


        });*/
    }
    public void startApp(String packageName) {
        try {
            Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
            intent.addCategory(Intent.CATEGORY_LAUNCHER);
            startActivity(intent);
        } catch (NullPointerException e) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=" + packageName));
            startActivity(intent);
        }
    }

    public void onBackPressed() {

        Intent intent1 = new Intent(getApplicationContext(), Main_MainActivity.class);
        startActivity(intent1);
        finish();


    }
}
