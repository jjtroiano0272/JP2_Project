public class VehicleFrame implements Chassis {
	
	// Static being a class variable; nonstatic being for only the object.
	private String vehicleFrameType;
	
	/**
	 * Default constructor with instance variable.
	 */
	public VehicleFrame(){this.vehicleFrameType = "Unibody";}
	
	/**
	 * @param vehicleFrameType
	 *
	 * This is the overloaded constructor???
	 * This is where the user passes vehicleFrameType and the private class variable gets set to
	 * this arg.
	 */
	public VehicleFrame(String vehicleFrameType){
		this.vehicleFrameType = vehicleFrameType;
	}
	
	/**
	 * Returns instance of the INTERFACE Chassis, even though this is called within a class.
	 *
	 * A public method named getChassisType that didn't have a formal parameter and that returns an
	 * instance of the interface Chassis (hint that would be a copy of this class).
 	 */
	public Chassis getChassisType() {
		return this;
	}
	
	/**
	 * A public method setChassisType that takes a String parameter vehicleFrameType
	 * and that returns a void. It should set the instance variable vehicleFrameType.
	 *
	 * Don't know if Override is necessary here...or the structure of why....
	 */
	@Override
	public void setChassisType(String vehicleFrameType){
		this.vehicleFrameType = vehicleFrameType;
	}
	
	@Override
	public String toString() {
		return "Chassis\t\t: "+chassis+
				"Vehicle Frame\t\t: "+vehicleFrameType+"\n\n";
	}
	
	/**
	 * Write a static main method that tests two scenarios:
	 * 1. One that prints all fuel grade values, like:
	 * 2. One that
	 *  prints a value set by a single string value.
	 */
	
	/**
	 * Testing default constructor.
	 * Moved this method from, previously, inside of VehicleFrame but NOT inside a main method therein.
	 * @param args
	 */
	public static void main(String[] args) {
		VehicleFrame vehicleFrameObj = new VehicleFrame();
		System.out.println(vehicleFrameObj);
	}
	
	}
	
	
}

// Froms tep 4 create a vehicle frame with def constructor and.....
// Just use generate to do these. Along with toString
// You don't need a method that just prints the vehicle frame. Call that same toString on separate objects.A