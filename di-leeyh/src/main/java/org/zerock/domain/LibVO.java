package org.zerock.domain;

public class LibVO {
	
	private Integer id;
	private String name;
	private Integer floor;
	private String location;
	private String starttime;
	private String endtime;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	@Override
	public String toString() {
		return "LibVO [id=" + id + ", name=" + name + ", floor="
				+ floor + ", location=" + location + ", starttime=" + starttime + 
				", endtime=" + endtime +"]";
	}

}