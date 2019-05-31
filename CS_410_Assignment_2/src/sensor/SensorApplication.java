/*
File: SensorApplication.java
Author Name: Timothy Biggar
Last Updated: 28 May 2019
Class: CS 410
Assignment Number: 2

This assignment was fun. The things that gave me the most difficulty had nothing
to do with the Adaptor design pattern, but other aspects of the project: the
first difficulty was updating my JRE to the latest version and setting Eclipse
to use it so that I could us SensorsLibs.jar, then I fought with a mismatch bug
between sensor reading and sensor status (I needed to call the get methods the
other way around), and finally I had to figure out a way to make the colored
rectangles like in your sample runs.

The rest of this assignment was trivial in comparison to those three things.
 */

package sensor;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SensorApplication extends JFrame {
	
	public SensorApplication() {
		Sensor[] sensors = {
				new TemperatureSensorAdaptor(new TemperatureSensor()),
				new PressureSensorAdaptor(new PressureSensor()),
				new RadiationSensorAdaptor(new RadiationSensor())
				};
		
		setTitle("Sensor Tracker");
		setLayout(new GridLayout(sensors.length, 1));
		
		for (Sensor sensor : sensors) {
			JPanel sensorPnl = new SensorPanel(sensor);
			add(sensorPnl);
		}
		
		setPreferredSize(new Dimension(600, 200 * sensors.length));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	
	public static void main(String[] args) {
		SensorApplication app = new SensorApplication();
		
	}
}

