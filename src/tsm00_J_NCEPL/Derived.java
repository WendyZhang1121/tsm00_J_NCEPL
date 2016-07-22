package tsm00_J_NCEPL;

import java.util.logging.Level;
import java.util.logging.Logger;

class Derived extends Base {

	private static Logger logger;
	@Override 
	public  void doSomething() {
		try { 
			super.doSomething();
		} finally {
			logger.log(Level.FINE, "Did something");
		} 
	}
}
