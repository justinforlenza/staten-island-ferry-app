package com.example.statenislandferry;

import java.util.Calendar;

import sep.justin.statenislandferry.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;



public class MainActivity extends Activity {
    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exe();
    }
    protected void onResume(){
    	super.onResume();
    	exe();
    	
    }
    
	static int[] satTimes = new int[] {0,30,100,200,300,400,500,600,630,700,730,800,830,900,930,1000,1030,1100,1130,1200,1230,1300,1330,1400,1430,1500,1530,1600,1630,1700,1730,1800,1830,1900,2000,2100,2200,2300,2400};
	static int[] sunTimes = new int[] {0,100,200,300,400,500,600,700,800,900,930,1000,1030,1100,1130,1200,1230,1300,1330,1400,1430,1500,1530,1600,1630,1700,1730,1800,1830,1900,2000,2100,2200,2300,2400};
	static int[] weekTimes = new int[] {0,30,100,200,300,400,500,530,600,620,640,700,715,730,745,800,815,830,845,900,930,1000,1030,1100,1130,1200,1230,1300,1330,1400,1430,1500,1530,1550,1610,1630,1650,1710,1730,1745,1800,1815,1830,1845,1900,1930,2000,2030,2100,2130,2200,2230,2300,2330,2400};
	static int[] monTimes = new int[] {0,100,200,300,400,500,530,600,620,640,700,715,730,745,800,815,830,845,900,930,1000,1030,1100,1130,1200,1230,1300,1330,1400,1430,1500,1530,1550,1610,1630,1650,1710,1730,1745,1800,1815,1830,1845,1900,1930,2000,2030,2100,2130,2200,2230,2300,2330,2400};
	
	static int[] wsatTimes = new int[] {0,30,100,130,230,330,130,530,630,700,730,800,830,900,930,1000,1030,1100,1130,1200,1230,1300,1330,1400,1430,1500,1530,1600,1630,1700,1730,1800,1830,1900,1930,2030,2130,2230,2330,2400};
	static int[] wsunTimes = new int[] {30,130,230,330,430,530,630,730,830,930,1000,1030,1100,1130,1200,1230,1300,1330,1400,1430,1500,1530,1600,1630,1700,1730,1800,1830,1900,1930,2030,2130,2230,2330};
	static int[] wweekTimes = new int[] {0,30,100,130,230,330,430,530,600,630,650,710,730,745,800,815,830,845,900,915,930,1000,1030,1100,1130,1200,1230,1300,1330,1400,1430,1500,1530,1600,1620,1640,1700,1715,1730,1745,1800,1815,1830,1845,1900,1920,1940,2000,2030,2100,2130,2200,2230,2300,2330,2400};
	static int[] wmonTimes = new int[] {30,130,230,330,430,530,600,630,650,710,730,745,800,815,830,845,900,915,930,1000,1030,1100,1130,1200,1230,1300,1330,1400,1430,1500,1530,1600,1620,1640,1700,1715,1730,1745,1800,1815,1830,1845,1900,1920,1940,2000,2030,2100,2130,2200,2230,2300,2330};
	
	public static int time(){
	    Calendar rightNow = Calendar.getInstance();
		int hour = rightNow.get(Calendar.HOUR_OF_DAY) * 100;
		int min = rightNow.get(Calendar.MINUTE);
	    int time = hour + min;
	    return time;
	}
    
    public static int checkTime(){					    //Checks Current Time, and compares it to the schedule
    	String today;
    	Calendar rightNow = Calendar.getInstance();
    	int time = time();
    	if(rightNow.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
    		today = "saturday";
    	}else if (rightNow.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
    		today = "sunday";
    	} else if (rightNow.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
    		today = "monday";
    	} else {
    		today = "weekday";
    	}
    	
    	if (today == "saturday"){
    		for(int i = 0; i <= satTimes.length; i ++ ){
    			if(satTimes[i] > time){
    				return satTimes[i];
    			}
    		}
    	} else if (today == "sunday"){
    		for(int i = 0; i <= sunTimes.length; i ++ ){
    			if(sunTimes[i] > time){
    				return sunTimes[i];
    			}
    		}    		
    	} else if (today == "monday") {
    		for(int i = 0; i <= monTimes.length; i ++ ){
    			if(monTimes[i] > time){
    				return monTimes[i];
    			}
    			
    		}   		
    	} else {
    		for(int i = 0; i <= weekTimes.length; i ++ ){
    			if(weekTimes[i] > time){
    				return weekTimes[i];
    			}
    			
    		} 
    	}
		return 0;
    }

    public static int checkTimeW(){					    //Checks Current Time, and compares it to the schedule
    	String today;
    	Calendar rightNow = Calendar.getInstance();
    	int time = time();
    	if(rightNow.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
    		today = "saturday";
    	}else if (rightNow.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
    		today = "sunday";
    	} else if (rightNow.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
    		today = "monday";
    	} else {
    		today = "weekday";
    	}
    	
    	if (today == "saturday"){
    		for(int i = 0; i <= wsatTimes.length; i ++ ){
    			if(wsatTimes[i] > time){
    				return wsatTimes[i];
    			}
    		}
    	} else if (today == "sunday"){
    		for(int i = 0; i <= wsunTimes.length; i ++ ){
    			if(wsunTimes[i] > time){
    				return wsunTimes[i];
    			}
    		}    		
    	} else if (today == "monday") {
    		for(int i = 0; i <= wmonTimes.length; i ++ ){
    			if(wmonTimes[i] > time){
    				return wmonTimes[i];
    			}
    			
    		}   		
    	} else {
    		for(int i = 0; i <= wweekTimes.length; i ++ ){
    			if(wweekTimes[i] > time){
    				return wweekTimes[i];
    			}
    			
    		} 
    	}
		return 0;
    }
    
    public static int timeLeft(){					    //Calculates time to the next ferry
    	Calendar rightNow = Calendar.getInstance();
    	int min_1 = rightNow.get(Calendar.MINUTE);
    	int min_2 = checkTime()%100;
    	if (min_2 == 0){
    		min_2 = 60;
    	}
    	return Math.abs(min_2 - min_1);
    }

    public static int timeLeftW(){					    //Calculates time to the next ferry
    	Calendar rightNow = Calendar.getInstance();
    	int min_1 = rightNow.get(Calendar.MINUTE);
    	int min_2 = checkTimeW()%100;
    	if (min_2 == 0){
    		min_2 = 60;
    	}
    	return Math.abs(min_2 - min_1);
    }
    
	public static String convert(int tme){				//Converts 24hr number to a 12hr HH:MM Format
    	String ti;
    	int hour = tme/100;
    	int min = tme%100;
    	if (hour > 12){
    		hour = hour - 12;
    		ti = "pm";
    	} else {
    		ti = "am";
    	}
		if(min < 12){
    		return hour + ":0"+ min + " " + ti;
		}else {
			return hour +  ":"+ min + " " + ti;
		}
		
     }
    
    public void execute(View view){						//Executes the app's function for view based items.
        Spinner ClassSpinner = (Spinner)findViewById(R.id.spinner1);
        String term = ClassSpinner.getSelectedItem().toString();
    	TextView ferryTime = (TextView)findViewById(R.id.ferrytime);		
        TextView timeleft = (TextView)findViewById(R.id.timeto);
    	String timLef = null;
    	String ferTime = null;
        
        if (term.equals("Whitehall Terminal")){
        	ferTime = convert(checkTimeW());			
    		timLef = timeLeftW() + " minutes";
        } else if (term.equals("St. George Terminal")){
        	ferTime = convert(checkTime());			
    		timLef = timeLeft() + " minutes";
        }
    	ferryTime.setText(ferTime);
    	timeleft.setText(timLef);
    }

    public void exe(){									//Executes the app's 
        TextView ferryTime = (TextView)findViewById(R.id.ferrytime);		
        TextView timeleft = (TextView)findViewById(R.id.timeto);
    	
        String ferTime = convert(checkTime());
        String timLef = timeLeft()+" minutes";
		
    	ferryTime.setText(ferTime);			//Sets textview to next ferry departure
		timeleft.setText(timLef);	//Sets textview to time left to next ferry departure
    }

}