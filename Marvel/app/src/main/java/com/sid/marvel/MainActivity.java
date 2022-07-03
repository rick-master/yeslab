package com.sid.marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list);
        tv=findViewById(R.id.detailsview);
        String[] movienames={"Endgame","Civil war","Winter soldier","Infinity war","Dr strange"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,movienames);
        listView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        if(writetodatabase()){
            Toast.makeText(this, "Database Loaded", Toast.LENGTH_SHORT).show();
        }


    }
    private boolean writetodatabase(){
        Dbhelper dbhelper=new Dbhelper(MainActivity.this);

        dbhelper.insert("Endgame","Details of Endgame");
        dbhelper.insert("Civil  War","Details of Civil war");
        dbhelper.insert("Winter Soldier","Details of Winter soldier");
        dbhelper.insert("Infinity  War","Details of Infinity war");
        dbhelper.insert("Doctor Strange","Details of Doctor strange");
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.marvel_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.endgame:
               fetchfromdb("Endgame");
                return true;
            case R.id.Civilwar:
                fetchfromdb("Civil  War");
                return true;
            case R.id.wintersoldier:
                fetchfromdb("Winter Soldier");
                return true;
            case R.id.infinity:
                fetchfromdb("Infinity  War");
                return true;
            case R.id.drstrange:
                fetchfromdb("Doctor Strange");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void fetchfromdb(String movie){
       // Toast.makeText(this, ""+movie, Toast.LENGTH_SHORT).show();
        Dbhelper dbhelper=new Dbhelper(MainActivity.this);
        tv.setText(dbhelper.query(movie));




    }

}










