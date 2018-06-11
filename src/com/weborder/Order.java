package com.weborder;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Order {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/aa/Documents/seleniumDependancy/drivers/chromedriver");

	  WebDriver driver=new ChromeDriver();
	  driver.get(" http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
	
	  driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
	  driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
	  driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	  driver.findElement(By.xpath("//a[.='Order']")).click();
	  Random ran = new Random();
	  int r = ran.nextInt(100);
	  driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys("5");
	  
		
		int d = 65 + (int)(Math.random() * ((89 - 65) + 1));
		char c=(char) d;
	 driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John "+c+" Smith"); ;
	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("123 River st"); ;
	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("BestCity");
	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Virginia");
	  driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("60625");
	  
	  int kk = ran.nextInt(3);
	  int v=0;
	  driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_"+kk)).click();
	  if(kk==0) {
		  v=4;
	  }else if(kk==1) {
		  v=5;
	  }else { v =3;}
	  
	  String vs = v+"";
//	  driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(vs);
	  
	  long d2 = 10000000000000L + (long)(Math.random() * ((99999999999999L - 10000000000000L) + 1));
	    
	    long d3 = 100000000000000L + (long)(Math.random() * ((999999999999999L - 100000000000000L) + 1));
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_"+kk)).click();
	    if(kk==2)driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(vs+d2);
	    else {
	    	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(vs+d3);
	    }
	  
	  driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys(11+"/"+23);
	  
	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
	 
}
}
