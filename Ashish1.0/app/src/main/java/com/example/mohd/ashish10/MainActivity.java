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
        requestQueue.add(stringRequest);
    }
}
