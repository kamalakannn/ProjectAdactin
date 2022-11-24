package com.Testng2;

//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NewTest {
  @Test(groups = "fruit")
  public void f() {
	  System.out.println("banana");
  }
  
  
  @Test(groups = "carrot")
  public void v() {
	  System.out.println("carrot");
	  
  }
  @Test(groups = "carrot")
  public void v2() {
	  System.out.println("2carrot");
	  
  }
  @Test(groups = "vegetables")
  public void v3() {
	  System.out.println("beet root");
	  
  }
  
  @Test(groups = "vegetables")
  public void v4() {
	  System.out.println("brinjal");
	  
  }
  
  
  
  
  
  
  
  
  
}
