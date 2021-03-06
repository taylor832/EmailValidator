package com.email.email_validator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EmailValidatorTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EmailValidatorTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EmailValidatorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
   
    public void testValidate(){
    	assertTrue(EmailValidator.Validate("taylor.lundy@live.ca"));
    	assertTrue(EmailValidator.Validate("taylor.lundy.27@live.ca"));
    	assertTrue(EmailValidator.Validate("tayllundy27@live.ca"));
    	assertFalse(EmailValidator.Validate("taylorlundy@liveca"));
    	assertFalse(EmailValidator.Validate("taylor.lundy.27live.ca"));
    	assertFalse(EmailValidator.Validate("tayllundy27liveca"));
    }
    //Tests for additional rules domain cannot start with a hyphen and domain cannot contain characters [!@#$%^&*()]
    public void testValidateTask2(){
    	assertFalse(EmailValidator.Validate("taylorlundy@-live.ca"));
    	assertFalse(EmailValidator.Validate("taylor.lundy@$$$.ca"));
    	assertFalse(EmailValidator.Validate("tayllundy27@l***ve.ca"));	
    }
    
}
