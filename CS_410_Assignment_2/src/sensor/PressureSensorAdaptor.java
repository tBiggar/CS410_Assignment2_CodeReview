/*
File: PressureSensorAdaptor.java
Author Name: Timothy Biggar
Last Updated: 28 May 2019
Class: CS 410
Assignment Number: 2
 */

package sensor;

public class PressureSensorAdaptor implements Sensor {
	private PressureSensor sensor;
	
	public PressureSensorAdaptor(PressureSensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public double getSensorReading() {
		return sensor.readValue();
	}

	@Override
	public String getSensorStatus() {
		return sensor.getReport();
	}

	@Override
	public String getSensorType() {
		return sensor.getSensorName();
	}

}
