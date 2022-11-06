import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGTest {

    int a=0;int b=0;

//    @DataProvider(name="getDataString")
//    public Object[][] dataString(){
//        return new Object[][]{{"one","one"},{5,5}};
//    }
//    @DataProvider(name="getData")
//    public Object[][] data(){
//         return new Object[][]{{6,6},{5,5}};
//        }


    @Test()
    @Parameters({"firstNo","secondNo","thirdNo"})
    public void additionTest(String a, String b){
        Assert.assertEquals(a,b);
        System.out.println("completed comparison test Test Method");
    }


   }
