package tt.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

	@Before
	public void beforeActions(Scenario scan){
		System.out.println(">>Initializing Chrome Driver");
		SetupDrivers.setupDriver();
		System.out.println(scan.getName());
	}
	
}
