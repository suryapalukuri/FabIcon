package com.example.admin.fabicon;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
public FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar sb= Snackbar.make(view,"hello",Snackbar.LENGTH_LONG).setAction("send", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar sb1=Snackbar.make(view,"Message was sent",Snackbar.LENGTH_SHORT);
                        sb1.show();

                    }
                });
                sb.show();
            }
        });
    }
}
