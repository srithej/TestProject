package Testng1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestngDemo {
  @Test
  public void f() {
	  System.out.println("f method");
  }
  @Test
  public void a() {
	  System.out.println("a method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforemethod annotation-it will run before evry test case");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Aftermethod annotation-it will run after every testcase");
  }

}
