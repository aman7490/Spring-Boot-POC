package com.sp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "current_sensor_ostate")
public class ostate {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // for auto increment 
	private int id;
	private String sensor_guid;
	private String state;
	private double event_timestamp;
	private String current_flag;
	public ostate() {
	
	}

	public ostate(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSensor_guid() {
		return sensor_guid;
	}


	public void setSensor_guid(String sensor_guid) {
		this.sensor_guid = sensor_guid;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public double getEvent_timestamp() {
		return event_timestamp;
	}


	public void setEvent_timestamp(double event_timestamp) {
		this.event_timestamp = event_timestamp;
	}


	public String getCurrent_flag() {
		return current_flag;
	}


	public void setCurrent_flag(String current_flag) {
		this.current_flag = current_flag;
	}


	@Override
	public String toString() {
		return "ostate [id=" + id + ", sensor_guid=" + sensor_guid + ", state=" + state + ", event_timestamp="
				+ event_timestamp + ", current_flag=" + current_flag + "]";
	}
	
	
}
