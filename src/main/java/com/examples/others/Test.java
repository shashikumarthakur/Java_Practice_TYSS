

package com.examples.others;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Test {
	int x=10;
	static int y=20;

	public void m1() {
		System.out.println("------------------Non-Static Method------------------");
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(new Test().x);
		System.out.println("------------Static Variable Access---------------");
		System.out.println(Test.y);
		System.out.println(new Test().y);
		System.out.println(this.y);
		System.out.println(y);
	}
	public static void m2() {
		
		System.out.println("------------------Static Method------------------");
		System.out.println(new Test().x);
		System.out.println("------------------Static Varible Access-------------");
		System.out.println(Test.y);
		System.out.println(new Test().y);
		System.out.println(y);
		
	}
	
	
	
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		t.m2();
	}
}
