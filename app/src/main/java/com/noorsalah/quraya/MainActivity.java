package com.noorsalah.quraya;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setGravity(Gravity.CENTER);
        page.setPadding(20, 20, 20, 20);
        page.setBackgroundColor(Color.rgb(12, 75, 57));

        String[] lines = {
            "☪",
            "نور الصلاة",
            "القراية - وادي الحياة - ليبيا",
            "مواقيت الصلاة",
            "الفجر",
            "الشروق",
            "الظهر",
            "العصر",
            "المغرب",
            "العشاء",
            "اللهم اجعلنا من المحافظين على الصلاة"
        };

        for (String line : lines) {
            TextView text = new TextView(this);
            text.setText(line);
            text.setTextSize(line.equals("نور الصلاة") ? 28 : 20);
            text.setTextColor(Color.WHITE);
            text.setGravity(Gravity.CENTER);
            text.setPadding(8, 8, 8, 8);
            page.addView(text);
        }
        setContentView(page);
    }
}
