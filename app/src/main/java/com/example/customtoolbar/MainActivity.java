package com.example.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.snackbar.Snackbar;
public class MainActivity extends AppCompatActivity {
RelativeLayout relativeLayout;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout=findViewById(R.id.rel);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(relativeLayout,"This is 1st snackbar",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(relativeLayout,"Message is deleted...",Snackbar.LENGTH_LONG).setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar snackbar1=Snackbar.make(relativeLayout,"Message is Restored !!!",Snackbar.LENGTH_LONG);
                        snackbar1.show();
                    }
                });
                snackbar.show();

            }
        });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar snackbar=Snackbar.make(relativeLayout,"Not Conneted...",Snackbar.LENGTH_LONG).setAction("RETRY", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                        snackbar.setActionTextColor(Color.CYAN);
                        snackbar.show();
                    }
                });

        Toolbar toolbar=findViewById(R.id.tool);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id =item.getItemId();
        if(id==R.id.share){
            Toast.makeText(getApplicationContext(),"You Clicked Share",Toast.LENGTH_SHORT).show();
        }else  if(id==R.id.about) {
            Toast.makeText(getApplicationContext(), "You Clicked About", Toast.LENGTH_SHORT).show();
        }else  if(id==R.id.profile) {
            Toast.makeText(getApplicationContext(), "You Clicked Profile", Toast.LENGTH_SHORT).show();
        }else  if(id==R.id.help) {
            Toast.makeText(getApplicationContext(), "You Clicked Help", Toast.LENGTH_SHORT).show();
        }else  if(id==R.id.exit) {
            Toast.makeText(getApplicationContext(), "You Clicked Exit", Toast.LENGTH_SHORT).show();
        }else  if(id==R.id.search) {
            Toast.makeText(getApplicationContext(), "You Clicked Search", Toast.LENGTH_SHORT).show();
        }else  if(id==R.id.settings) {
            Toast.makeText(getApplicationContext(), "You Clicked Settings", Toast.LENGTH_SHORT).show();
        }
        return  true;
    }
}