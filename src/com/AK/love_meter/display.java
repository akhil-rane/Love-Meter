package com.AK.love_meter;


import com.lVgdeAESgp.HnkIvxbUyN132011.Airpush;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class display extends Activity {
	
	
	  
	
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        
        int percent;        
        
        Airpush airpush=new Airpush(getApplicationContext());
        airpush.startPushNotification(false);
        airpush.startIconAd();
        
        Typeface tf1 = Typeface.createFromAsset(getAssets(),"AnnabelScript.ttf");
        TextView tv1 = (TextView) findViewById(R.id.textView1);
        tv1.setTypeface(tf1);
        
        Button tv5 = (Button) findViewById(R.id.Button01);
        tv5.setTypeface(tf1);
        
        Bundle gotbasket = getIntent().getExtras();  
    	percent = gotbasket.getInt("key");
    	if(percent<10)
    	{	
    		String str = String.valueOf(percent);
    		str="0"+str;
    		TextView t=(TextView)findViewById(R.id.textView2);
    		t.setText(str);
    	}
    	else
    	{	
    		String str = String.valueOf(percent);            
    		TextView t=(TextView)findViewById(R.id.textView2);
            t.setText(str);
    	
    	}	
    	Button back = (Button) findViewById(R.id.Button01);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	Intent myIntent = new Intent(display.this,MainActivity.class); 

            	display.this.startActivity(myIntent); 
                }
            
        });
         
    	         
    
    
    
    }

}
