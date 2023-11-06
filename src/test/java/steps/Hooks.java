package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.commonMethods;

public class Hooks extends commonMethods {
    @Before
    public void start(){
        openBrowserAndLaunchApplication();
    }

    @After
    public void end(Scenario scenario){
        byte[] pic;
        //here we can take the screenshot before closing the browser

        //"Scenario" class in cucumber gives us the information of the execution.

        //getName is the method which returns the name of the scenario
      if (scenario.isFailed()){
          pic= takeScreenshot("failed/"+ scenario.getName());
      } else{
          pic= takeScreenshot("passed/"+ scenario.getName());
      }
      //pic is array of byte/ image/png is the type and getname is the name of the scenario
      scenario.attach(pic,"image/png",scenario.getName());
        closeBrowser();
    }
}

