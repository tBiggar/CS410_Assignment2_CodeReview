/*
File: SensorPanel.java
Author Name: Timothy Biggar
Last Updated: 28 May 2019
Class: CS 410
Assignment Number: 2
 */

package sensor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;

@SuppressWarnings("serial")
public class SensorPanel extends JPanel{
	private Sensor sensor;
	private double reading;
	private String status;
	private Color color;
	
	private class SensorCanvas extends Canvas {
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillRect(0, 0, (int)(reading) + 1, 180); // + 1 for visibility
		}
	}
	
	public SensorPanel(Sensor sensor) {
		this.sensor = sensor;
		setUp();
	}
	
	private void setUp() {
		setBorder(new TitledBorder(sensor.getSensorType()));

		this.reading = sensor.getSensorReading();
		this.status = sensor.getSensorStatus();

		setColor();
		Canvas canvas = new SensorCanvas();
		canvas.setSize(550, 100);
		add(canvas);
		
		JLabel sensorInfo = new JLabel(status + " --> " + reading);
		
		add(sensorInfo);	
	}

	private void setColor() {
		if (status.equals("OK")) {
			color = Color.green;
		} else if (status.equals("CRITICAL")) {
			color = Color.yellow;
		} else if (status.equals("DANGER")) {
			color = Color.red;
		} else { // unknown status
			color = Color.black;
		}
	}
}




