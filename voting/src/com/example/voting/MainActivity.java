package com.example.voting;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    protected static final int READ_BLOCK_SIZE =20;
	Button b1,b2;
	EditText e1,e2;
	String[] entryArray;
	
	String s;
	TextView tv1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.bt1);
        b2=(Button)findViewById(R.id.bt2);
        e1=(EditText)findViewById(R.id.ed1);
        e2=(EditText)findViewById(R.id.ed2);
        tv1=(TextView)findViewById(R.id.tv1);
          try
    		{
        	  Toast.makeText(getBaseContext(),"try",Toast.LENGTH_SHORT).show();
    		FileInputStream fIn =openFileInput("jiggy.txt");
    		InputStreamReader isr = new InputStreamReader(fIn);
    		char[] inputBuffer = new char[READ_BLOCK_SIZE];
    		int charRead;
    		while ((charRead = isr.read(inputBuffer))>0)
    		{
    		//---convert the chars to a String---
    		String readString =String.copyValueOf(inputBuffer, 0,charRead);
    		s=s+readString;
    		inputBuffer = new char[READ_BLOCK_SIZE];
    		Toast.makeText(getBaseContext(),s,Toast.LENGTH_SHORT).show();
    		}
    		if(s!=null)
    		{
    	Toast.makeText(getBaseContext(),"in enterarray",Toast.LENGTH_SHORT).show();
    	entryArray =  s.split(",");
    	 String s1[]=entryArray;
    	 String s2=s1[0];
    	 String s3=s1[1];
    	 Toast.makeText(getBaseContext(),s2,Toast.LENGTH_SHORT).show();
    	 Toast.makeText(getBaseContext(),s3,Toast.LENGTH_SHORT).show();
    	 }
    	else
    		{
    		Toast.makeText(getBaseContext(),"File not loaded",Toast.LENGTH_LONG).show();
    		}
    		}
     catch (IOException ioe)
    		{
    		ioe.printStackTrace();
    		}
    	
    		b2.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View v) 
    			{
    		// TODO Auto-generated method stub
    		
    			Intent i=new Intent(MainActivity.this,Admin.class);
   
    			startActivity(i);
    			finish();
    			}
    			});
    		
    		b1.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View v) {
    				
				// TODO Auto-generated method stub
    			String login = e1.getText().toString();
    			String adhar = e2.getText().toString();
    			if(login.equals("") || adhar.equals(""))
    			{
    			Toast.makeText(getBaseContext(), "Enter Login-ID and Adhar No.",
    			Toast.LENGTH_SHORT).show();
    			}
    			else
    			{
    				Toast.makeText(getBaseContext(), "in else waiting for for",
    		    			Toast.LENGTH_SHORT).show();
    			for(int i=0;i<entryArray.length;i=i+3)
    	
    			{
    				Toast.makeText(getBaseContext(), " for mein gaya",
    		    			Toast.LENGTH_SHORT).show();
    				
    			if(adhar.equals(entryArray[i+1]) && login.equals( entryArray[i]))
    			{
    				Toast.makeText(getBaseContext(), " if mein equals",
    		    			Toast.LENGTH_SHORT).show();
    			if(entryArray[i+2].equals("0"))
    			{
    				Toast.makeText(getBaseContext(), "status check",
    		    			Toast.LENGTH_SHORT).show();
    			    			Toast.makeText(getBaseContext(), "intent mein jaa raha hu",
		    			Toast.LENGTH_SHORT).show();
    			Intent in=new Intent(MainActivity.this,Vote.class);
  
    			Toast.makeText(getBaseContext(), " next activity mein jaa raha hu",
		    			Toast.LENGTH_SHORT).show();
    			startActivity(in);
    			finish();
    			break;
    			}else
    			{
    			Toast.makeText(getBaseContext(), "You have already VOTED",
    			Toast.LENGTH_LONG).show();
    			e1.setText("");
    			e2.setText("");
    			break;
    			}
    			}
    			else
    			{
    			if((i==entryArray.length-3))
    			{
    			Toast.makeText(getBaseContext(), "You are not a valid User",
    			Toast.LENGTH_LONG).show();
    			}
    			}
    			}
    			}
    			}});
    		
}
}
