/*
File: RadiationSensorAdaptor.java
Author Name: Timothy Biggar
Last Updated: 28 May 2019
Class: CS 410
Assignment Number: 2
 */

package sensor;

public class RadiationSensorAdaptor implements Sensor{
	private RadiationSensor sensor;
	
	public RadiationSensorAdaptor(RadiationSensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public double getSensorReading() {
		return sensor.getRadiationValue();
	}

	@Override
	public String getSensorStatus() {
		return sensor.getStatusInfo();
	}

	@Override
	public String getSensorType() {
		return sensor.getName();
	}
}
