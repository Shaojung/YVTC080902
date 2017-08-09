package com.example.yvtc.yvtc080902;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v) throws JSONException {
        JSONObject obj = new JSONObject();
        obj.put("temperature", "30.5");
        obj.put("humi", "80");
        Log.d("JSON", obj.toString());
    }
    public void click2(View v) throws JSONException {
        JSONArray array = new JSONArray();
        JSONObject obj = new JSONObject();
        obj.put("temperature", "30.5");
        obj.put("humi", "80");
        array.put(obj);
        JSONObject obj2 = new JSONObject();
        obj2.put("temperature", "31");
        obj2.put("humi", "83");
        array.put(obj2);
        Log.d("JSON", array.toString());
    }
}
