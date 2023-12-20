package org.Dominos_runner_pkg;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import Dominos_base_pkg.Dominose_baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Dominos_Realtime_features/dominos.feature", dryRun = false, glue = "org.Dominos_stepdef_pkg")

public class Dominos_runnerclass extends Dominose_baseclass {

	@BeforeClass
	public static void start() {
		driver = new ChromeDriver();
	}

}
