package tests;

import mockit.Mocked;
import mockit.NonStrict;
import mockit.NonStrictExpectations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import work.IThing;

/**
 * Created by IntelliJ IDEA.
 * User: kimptonc
 * Date: 06/04/11
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
public class RealTest2 {

    @Mocked IThing mockThing;

    @Test
    public void aNoddyTest()
    {
        new ThingExpectation();
//        IThing mockThing = new IThing();
        String jiggery = mockThing.jiggery();
        assert jiggery.equals("stuff") : "found stuff?";
    }

    final class ThingExpectation extends NonStrictExpectations {

        ThingExpectation() {
            {
                mockThing.jiggery();
                returns("stuff");
            }
        }
    }

}
