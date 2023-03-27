package class04;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class anotationsBeforeClass {
    @BeforeClass
    public void hello(){
        System.out.println("i am before class");
    }
    @Test
    public void testB(){
        System.out.println("i am testB");
    }
}
