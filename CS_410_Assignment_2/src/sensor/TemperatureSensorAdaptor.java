/*
File: TemperatureSensorAdaptor.java
Author Name: Timothy Biggar
Last Updated: 28 May 2019
Class: CS 410
Assignment Number: 2
 */

package sensor;

public class TemperatureSensorAdaptor implements Sensor {
	private TemperatureSensor sensor;
	
	public TemperatureSensorAdaptor(TemperatureSensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public double getSensorReading() {
		return sensor.senseTemperature();
	}

	@Override
	public String getSensorStatus() {
		return sensor.getTempReport();
	}

	@Override
	public String getSensorType() {
		return sensor.getSensorType();
	}
	
}
