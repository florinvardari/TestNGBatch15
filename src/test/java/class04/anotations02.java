package class04;

import org.testng.annotations.*;

public class anotations02 {
    @BeforeTest
    public void beforetest(){
        System.out.println("i am before test");
    }
    @BeforeClass
    public void  beforeclass(){
        System.out.println("i am before class");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("i am after class");
    }
    @BeforeMethod
    public void before(){
        System.out.println("i am before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("i am after method");
    }
    @Test
    public void TestA(){
        System.out.println("i am test A");
    }
    @Test
    public void TestB(){
        System.out.println("i am test B");
    }

}
