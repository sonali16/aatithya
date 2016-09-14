package com.aatithya.messaging;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Random rand=new Random();
        SendMessage message=new SendMessage();
        String text="Your OTP is "+rand.getOtp().toString();
        message.messaging("+919593957914","+919445283125",text);
    }
}
