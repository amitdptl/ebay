package ebay;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 24/04/2017.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features = ".",format="html:target/CucumberReports", tags= "@raja")
public class RunTest
{


}