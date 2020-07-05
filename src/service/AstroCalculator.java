package service;

import model.User;

public class AstroCalculator{
	public String findSign(User astro) {
		String DOB = astro.getDob();
		String parts[] = DOB.split("-");
		String day = parts[0];
		String month = parts[1];
		String year = parts[2];
		String zodiacSign = "";
		int int_day = Integer.parseInt(day);
		 	if (month == "12"){              
	            if (int_day < 22) 
	            zodiacSign = "Sagittarius"; 
	            else
	            zodiacSign ="Capricorn"; 
	        } 
	              
	        else if (month == "01"){ 
	            if (int_day < 20) 
	            zodiacSign = "Capricorn"; 
	            else
	            zodiacSign = "Aquarius"; 
	        } 
	              
	        else if (month == "02"){ 
	            if (int_day < 19) 
	            zodiacSign = "Aquarius"; 
	            else
	            zodiacSign = "Pisces"; 
	        } 
	              
	        else if(month == "03"){ 
	            if (int_day < 21)  
	            zodiacSign = "Pisces"; 
	            else
	            zodiacSign = "Aries"; 
	        } 
	        else if (month == "04"){ 
	            if (int_day < 20) 
	            zodiacSign = "Aries"; 
	            else
	            zodiacSign = "Taurus"; 
	        } 
	              
	        else if (month == "05"){ 
	            if (int_day < 21) 
	            zodiacSign = "Taurus"; 
	            else
	            zodiacSign = "Gemini"; 
	        } 
	              
	        else if( month == "06"){ 
	            if (int_day < 21) 
	            zodiacSign = "Gemini"; 
	            else
	            zodiacSign = "Cancer"; 
	        } 
	              
	        else if (month == "07"){ 
	            if (int_day < 23) 
	            zodiacSign = "Cancer"; 
	            else
	            zodiacSign = "Leo"; 
	        } 
	              
	        else if( month == "08"){ 
	            if (int_day < 23)  
	            zodiacSign = "Leo"; 
	            else
	            zodiacSign = "Virgo"; 
	        } 
	              
	        else if (month == "09"){ 
	            if (int_day < 23) 
	            zodiacSign = "Virgo"; 
	            else
	            zodiacSign = "Libra"; 
	        } 
	              
	        else if (month == "10"){ 
	            if (int_day < 23) 
	            zodiacSign = "Libra"; 
	            else
	            zodiacSign = "Scorpio"; 
	        } 
	              
	        else if (month == "11"){ 
	            if (int_day < 22) 
	            zodiacSign = "Scorpio"; 
	            else
	            zodiacSign = "Sagittarius"; 
	        } 
			
		return zodiacSign;
	}
}
// Type your code