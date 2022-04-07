package steps;

import engine.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    private Driver driver;

    public Hooks(Driver driver) {
        this.driver = driver;
    }

    @Before()
    public void before() {
        System.out.println("-----------------Start of Scenario-----------------");
        driver.start();
    }

    @After()
    public void after() {
        System.out.println("-----------------End of Scenario-----------------");
        driver.close();
    }
}