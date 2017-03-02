package com.email.email_validator;
import java.util.regex.*;
/**
 * Simple class with a static method that determines whether an email address is valid
 *
 */
public class EmailValidator 
{
    public static boolean Validate(String email){
    	//additional check was added to first if statement to ensure there is a domain name of some sort after the @ sign
    		if(email.contains("@")&&email.contains(".")&&email.lastIndexOf('@')!=(email.length()-1)){
    			String[] splitString= email.split("@");
    			String domain = splitString[1];
    			//Next if statement checks to ensure the domain has no special characters and does not begin with a hyphen
    			if(domain.matches("^[^!@$#%^&*()]+$")&&domain.charAt(0)!='-'){
    				return true;
    			}
    		}
    		return false;
    		
    }
}
