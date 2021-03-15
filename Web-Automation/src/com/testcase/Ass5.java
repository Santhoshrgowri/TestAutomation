package com.testcase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ass5 {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
	 lunchBrowser();
	 navigate();
	 login();
	 minimizeFlyOutWindow();
	 Createcustomer();
	 Createproject();
	 modifyproject();
	 deletecustomer();
	 deleteproject();
	 logout();
	 closeapp();
	 
	 
	 }
		 public static  void lunchBrowser()
		    {
			try {
				String path = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path + "\\Library\\Driver\\chromedriver.exe");
				oBrowser = new ChromeDriver();
			} catch (Exception e)
			{
			e.printStackTrace();			
			}
	}
		 public static void navigate()
		 {
			 try
			 {
				 oBrowser.get("http://localhost:81/login.do");
			 } catch (Exception e)
			 { 
				 e.printStackTrace();
			 }
		 }
     static void login()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.id("username")).sendKeys("admin");
    		 oBrowser.findElement(By.name("pwd")).sendKeys("manager");
    		 oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
    		 Thread.sleep(2000);
    	 } catch (Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void minimizeFlyOutWindow()
 	{
 		try
 		{
 			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsMenuCloseId\']")).click();
 			Thread.sleep(4000);
 		}catch(Exception e)
 		{
 			e.printStackTrace();
 		}
 	}
     static void Createcustomer()
     {
    	 try 
    	 {
    		 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[1]")).click();
 			Thread.sleep(4000);
 			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
 			Thread.sleep(2000);
 			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
 			Thread.sleep(2000); 
    		 oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("Santhosh");
    		 oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_descriptionField\']")).sendKeys("java is a programing tool");
    		 oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div")).click();
    		 
    		 
    		 Thread.sleep(4000);
    	 } catch (Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
        static void Createproject()
        {
        	try
        	{   
        		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
        
        		Thread.sleep(4000);
        		oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
        		Thread.sleep(4000);
        		oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectNameField\']")).sendKeys("project1");
        		Thread.sleep(4000);
        		
        		oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectDescriptionField\']")).sendKeys("python is another one program tool");
        		Thread.sleep(4000);
        		oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
        		Thread.sleep(4000);
        		
        		
        	} catch (Exception e)
        	{                       
        		e.printStackTrace();
        	} 
        }
        static void modifyproject()
    	{
    		try
    		{
    		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
    		Thread.sleep(4000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).click();
    		Thread.sleep(4000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys(" ,python programing tool");
    		Thread.sleep(4000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")).click();
    		Thread.sleep(4000);
    		}catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
        static void deletecustomer()
    	{
    		try
    		{
    			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    			Thread.sleep(4000);
    			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
    			Thread.sleep(4000);
    			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
    			Thread.sleep(4000);
    			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
    			Thread.sleep(4000);
    		}catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    	static void deleteproject()
    	{
    		try
    		{
    	
    		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
    		Thread.sleep(2000);
    		}catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    	static void logout()
    	{
    		try
    		{
    			oBrowser.findElement(By.id("logoutLink")).click();
    			Thread.sleep(4000);
    		}catch (Exception e)
    		{
    		e.printStackTrace();	
    		}
    	}
    	static void closeapp()
    	{
    		try
    		{
    		oBrowser.close();
    	}catch(Exception e)
    		{
    		e.printStackTrace();
    		}

    }

    }


