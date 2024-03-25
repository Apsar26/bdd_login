package features;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src/test/java/features/Login.feature",
   glue = "stepDefination"
   )
public class TestRunner {
}