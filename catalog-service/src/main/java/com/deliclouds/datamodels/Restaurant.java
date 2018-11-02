package com.deliclouds.datamodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "restaurant_id", unique = true, nullable = false)
	private Integer id;
	@Column(name = "opentime")
	private Integer opentime;
	@Column(name = "closetime")
	private Integer closetime;
	@Column(name = "postcode")
	private Integer postcode;
	@Column(name = "timezone")
	private String timezone;

	public Restaurant() {

	}

	public Restaurant(Integer opentime, Integer closetime, Integer postcode, String timezone) {
		this.setOpentime(opentime);
		this.setClosetime(closetime);
		this.setPostcode(postcode);
		this.setTimezone(timezone);
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOpentime() {
		return opentime;
	}

	public void setOpentime(Integer opentime) {
		this.opentime = opentime;
	}

	public Integer getClosetime() {
		return closetime;
	}

	public void setClosetime(Integer closetime) {
		this.closetime = closetime;
	}

	public Integer getPostcode() {
		return postcode;
	}

	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getTimezone() {
		return this.timezone;
	}
}
