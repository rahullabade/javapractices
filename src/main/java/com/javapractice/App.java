package com.javapractice;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
	public static void main( String[] args )
    {
        String message = "Hello, world";
        LOG.debug(message + "will be printed on debug");
        LOG.info(message + "will be printed info");
        LOG.warn(message + "will be printed warn");
        LOG.error(message + "will be printed error");
        LOG.fatal(message + "will be printed fatel");
        LOG.info("Appending string: {}.", message);
        System.out.println(message);
    }
}
