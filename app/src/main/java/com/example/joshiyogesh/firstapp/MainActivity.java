package com.example.joshiyogesh.firstapp;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    public Button btn;
    boolean flag = false ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button)findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Oouch...",Toast.LENGTH_LONG).show();
                RelativeLayout rl = (RelativeLayout)findViewById(R.id.activity_main);
                if(flag==false){
                rl.setBackgroundResource(R.drawable.images);
                flag=true;
                }
                else
                {
                    rl.setBackgroundResource(R.drawable.minions);
                    flag=false;
                }

            }
        });
    }
}
