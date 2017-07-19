package com.AK.love_meter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Typeface;;

public class MainActivity extends Activity {
	String name1;
	String name2;
	int x=0,y=0;
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Typeface tf1 = Typeface.createFromAsset(getAssets(),"AnnabelScript.ttf");
        TextView tv1 = (TextView) findViewById(R.id.textView1);
        tv1.setTypeface(tf1);
                
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setTypeface(tf1);
    	
        EditText tv3 = (EditText) findViewById(R.id.name1);
        tv3.setTypeface(tf1);
        
        EditText tv4 = (EditText) findViewById(R.id.name2);
        tv4.setTypeface(tf1);      
        
        Button tv5 = (Button) findViewById(R.id.button1);
        tv5.setTypeface(tf1);
        
        Button next = (Button) findViewById(R.id.button1);
        
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	
            	EditText et1=(EditText)findViewById(R.id.name1);
                name1=et1.getText().toString();                
                x=0;
                int t1=0;
                char[] c1= name1.toCharArray(); 
                int len1 = c1.length;
                for(int i=0;i<len1;i++)
                {
                	t1=(int)c1[i];                	
                	if(t1<97)
                	{	
                	   t1=t1+32;
                	}	
                		x=x+t1;
                }
                
                
                EditText et2=(EditText)findViewById(R.id.name2);
                name2=et2.getText().toString();                
                int t2=0;
                y=0;
                char[] c2= name2.toCharArray(); 
                int len2 = c2.length;
                for(int i=0;i<len2;i++)
                {
                	t2=(int)c2[i];
                	if(t2<97)
                	{	
                	   t2=t2+32;
                	}
                	y=y+t2;
                }
                int a,b,percent;
                a=((x+y)%10)*10;
                b=(len1+len2)%10;
                percent=a+b;
                
                Bundle basket = new Bundle();
                basket.putInt("key", percent);
            	              
                
                Intent myIntent = new Intent(MainActivity.this,display.class);
                myIntent.putExtras(basket); 
                
                MainActivity.this.startActivity(myIntent); 
                }
            
        });
    
    
    
    }

}
