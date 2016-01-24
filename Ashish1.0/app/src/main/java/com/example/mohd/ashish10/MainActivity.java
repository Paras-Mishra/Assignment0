package com.example.mohd.ashish10;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.math.*;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public String s0 = "";
    public String s1 = "";
    public String s2 = "";
    public String s3 = "";
    public String s4 = "";
    public String s5 = "";
    public String s6 = "";
    public String[] starry = new String[7];


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void button(View view) {
        EditText v0 = (EditText) findViewById(R.id.e0);
        EditText v1 = (EditText) findViewById(R.id.e1);
        EditText v2 = (EditText) findViewById(R.id.e2);
        EditText v3 = (EditText) findViewById(R.id.e3);
        EditText v4 = (EditText) findViewById(R.id.e4);
        EditText v5 = (EditText) findViewById(R.id.e5);
        EditText v6 = (EditText) findViewById(R.id.e6);
        s0 = v0.getText().toString();

        //s0 is team name
        s1 = v1.getText().toString();
        //s1 is name of student 1
        s2 = v2.getText().toString();
        //s2 is entry no. of student 1
        s3 = v3.getText().toString();
        //s3 is name of student 2
        s4 = v4.getText().toString();
        //s4 is entry no. of student 2
        s5 = v5.getText().toString();
        //s5 is name of student 3
        s6 = v6.getText().toString();
        //s6 is entry no. of student 3
        starry[1] = s1;
        starry[2] = s2;
        starry[3] = s3;
        starry[4] = s4;
        starry[5] = s5;
        starry[6] = s6;
        char x;
        String p = "";
        int i = 6;
        int ascii = 0;
        int k = 0;







     




        StringRequest stringRequest = new StringRequest(Request.Method.POST,"http://agni.iitd.ernet.in/cop290/assign0/register/" ,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(getApplicationContext(), response, Toast.LENGTH_LONG).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),"Error!! xx(",Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put("teamname",s0);
                params.put("name1",s1);
                params.put("name2",s2);
                params.put("name3",s3);
                params.put("entry1",s4);
                params.put("entry2",s5);
                params.put("entry3",s6);
                //Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_LONG).show();

                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
