package net.savantly.learning.graphite.domain;


import org.joda.time.DateTime;

public class GraphiteRow {
	
	private String target;
	private float value;
	private DateTime epoch;
	
	public GraphiteRow(String target, float value, DateTime epoch) {
		this.target = target;
		this.value = value;
		this.epoch = epoch;
	}
	
	public GraphiteRow(String target, String value, String epoch) {
		this.target = target;
		this.value = Float.parseFloat(value);
		this.epoch = DateTime.parse(epoch.replace(" ", "T"));
	}

	public String getTarget() {
		return target;
	}
	public float getValue() {
		return value;
	}
	public DateTime getEpoch() {
		return epoch;
	}

}
