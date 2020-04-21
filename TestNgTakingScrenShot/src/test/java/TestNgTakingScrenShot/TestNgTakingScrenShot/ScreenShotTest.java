package TestNgTakingScrenShot.TestNgTakingScrenShot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomLisener.class)
public class ScreenShotTest extends Base
{
@BeforeMethod
public void setup()
{
	initialization();
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}
@Test
public void loginTest()
{
	Assert.assertEquals(false, true);
}
@Test
public void createDealsTest()
{
	Assert.assertEquals(false, true);
}
@Test
public void HomePageTest()
{
	Assert.assertEquals(false, true);
}
}
