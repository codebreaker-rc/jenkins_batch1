import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
    @Test
    public void verifyTitle() {
        String title = driver.getTitle();
        System.out.println("🧭 Page title is: " + title);
        Assert.assertTrue(title.contains("Google"), "Title does not contain 'Google'");
    }
}
