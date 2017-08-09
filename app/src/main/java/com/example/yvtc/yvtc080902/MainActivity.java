package com.example.yvtc.yvtc080902;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

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
    public void click3(View v)
    {
        MyData data = new MyData();
        data.temp = 35.5;
        data.humi = 75;

        Gson gson = new Gson();
        Log.d("GSON", gson.toJson(data));
    }
    public void click4(View v)
    {
        ArrayList<MyData> mylist = new ArrayList<>();
        MyData data = new MyData();
        data.temp = 35.5;
        data.humi = 75;
        mylist.add(data);
        MyData data2 = new MyData();
        data2.temp = 35.5;
        data2.humi = 75;
        mylist.add(data2);
        Gson gson = new Gson();
        Log.d("GSON", gson.toJson(mylist));
    }
}
