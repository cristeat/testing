import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty"},
        features = {"C:\\Users\\tcristea\\IdeaProjects\\AutomationPractice\\src\\test\\Resource"}
/*      glue ={"C:\\Users\\tcristea\\IdeaProjects\\AutomationPractice\\src\\test\\java\\TestSteps"}*/)
public class Runner {
}
