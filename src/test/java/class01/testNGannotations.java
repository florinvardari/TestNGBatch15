package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {
    @BeforeMethod
    public void  beforeMethods(){
        System.out.println("i am before Method");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("i am the after method");
    }
    @Test
    public void AFirstTestCase(){
        System.out.println("i am the first test case");
    }

    @Test
    public void bSecondTestCase(){
        System.out.println("i am the second test case");
    }

    @Test
    public void  cThirdTestcase(){
        System.out.println("i am the third test case");
    }


}
