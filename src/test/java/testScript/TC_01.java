package testScript;

import org.testng.annotations.Test;
import pages.Start;
import pages.Textpage;

public class TC_01 extends BaseTest {

    @Test
    public void test( ) throws InterruptedException {
        Start st = new Start(driver);
        st.tc();


        Textpage text= new Textpage(driver);
        text.tx();







    }
}
