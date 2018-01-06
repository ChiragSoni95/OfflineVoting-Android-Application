package com.example.voting;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Vote extends Activity {
	Button b4;
	TextView tv2,tv3,tv4,tv5;
	int countmns,countbjp,countshiv,countcong;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vote);
		b4=(Button)findViewById(R.id.bt4);
		tv2=(TextView)findViewById(R.id.tv2);
		tv3=(TextView)findViewById(R.id.tv3);
		tv4=(TextView)findViewById(R.id.tv4);
		tv5=(TextView)findViewById(R.id.tv5);
		b4.setOnClickListener(new View.OnClickListener() {
			 
			public void onClick(View v) {
				
				{
				
			
					Intent iii=new Intent(Vote.this,End.class);
					 startActivity(iii);
		    		 finish();
				
			}}
			});
	
	}
	
	public void next(View v1)
		{
			
				 if(String.valueOf(tv2.getId()).equals("tv2"))
					{
					 countmns++;
					 String s;
					 s=String.valueOf(countmns);
					 try
					 {
					 FileOutputStream out=openFileOutput("Vote.txt",MODE_PRIVATE);
			         OutputStreamWriter fout=new OutputStreamWriter(out);
			         fout.write(s);
			         fout.close();
					 }
					 catch(Exception e)
					 {
					 }
					 
					 
					 }
				 if(String.valueOf(tv2.getId()).equals("tv3"))
					{
					 countshiv++;
					 String s;
					 s=String.valueOf(countmns);
					 try
					 {
					 FileOutputStream out=openFileOutput("Vote.txt",MODE_PRIVATE);
			         OutputStreamWriter fout=new OutputStreamWriter(out);
			         fout.write(s);
			         fout.close();
					 }
					 catch(Exception e)
					 {
					 }
					 
					 
					 }
				 if(String.valueOf(tv2.getId()).equals("tv4"))
					{
					 countcong++;
					 String s;
					 s=String.valueOf(countmns);
					 try
					 {
					 FileOutputStream out=openFileOutput("Vote.txt",MODE_PRIVATE);
			         OutputStreamWriter fout=new OutputStreamWriter(out);
			         fout.write(s);
			         fout.close();
					 }
					 catch(Exception e)
					 {
					 }
					 
					 
					 }
				 if(String.valueOf(tv2.getId()).equals("tv5"))
					{
					 countbjp++;
					 String s;
					 s=String.valueOf(countmns);
					 try
					 {
					 FileOutputStream out=openFileOutput("Vote.txt",MODE_PRIVATE);
			         OutputStreamWriter fout=new OutputStreamWriter(out);
			         fout.write(s);
			         fout.close();
					 }
					 catch(Exception e)
					 {
					 }
					 
					 
					 }
				 
				 
				 
				 
			
	
		}
	
	
	
	

	

}
