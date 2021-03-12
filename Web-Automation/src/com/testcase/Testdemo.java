package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdemo {
public static WebDriver obrowser=null;
	public static void main(String[] args) {
		lanchdemo();

	}
public static void lanchdemo()
{
	try
	{
	String path=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",path+"\\Library\\Driver\\chromedriver.exe");
	obrowser=new ChromeDriver();
	}catch (Exception e)
	{
		e.printStackTrace();
		
	}
	obrowser.get("http://localhost:81/login.do");
	}
}
