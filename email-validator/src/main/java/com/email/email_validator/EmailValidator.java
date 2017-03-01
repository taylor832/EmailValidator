package com.email.email_validator;
import java.util.regex.*;
/**
 * Simple class with a static method that determines whether an email address is valid
 *
 */
public class EmailValidator 
{
    public static boolean Validate(String email){
    		if(email.contains("@")&&email.contains(".")){
    			return true;
    		}
    		else{
    			return false;
    		}
    }
}
