/**
 * This class is generated by jOOQ
 */
package com.example.dao.entity.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "CAR-ADVERTS", schema = "PUBLIC")
public class CarAdverts implements Serializable {

	private static final long serialVersionUID = 884304408;

	private String    guid;
	private String    title;
	private String    fuel;
	private Integer   price;
	private Boolean   isNew;
	private Integer   mileage;
	private Timestamp firstRegistration;

	public CarAdverts() {}

	public CarAdverts(CarAdverts value) {
		this.guid = value.guid;
		this.title = value.title;
		this.fuel = value.fuel;
		this.price = value.price;
		this.isNew = value.isNew;
		this.mileage = value.mileage;
		this.firstRegistration = value.firstRegistration;
	}

	public CarAdverts(
		String    guid,
		String    title,
		String    fuel,
		Integer   price,
		Boolean   isNew,
		Integer   mileage,
		Timestamp firstRegistration
	) {
		this.guid = guid;
		this.title = title;
		this.fuel = fuel;
		this.price = price;
		this.isNew = isNew;
		this.mileage = mileage;
		this.firstRegistration = firstRegistration;
	}

	@Id
	@Column(name = "GUID", unique = true, nullable = false, length = 100)
	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	@Column(name = "TITLE", nullable = false, length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "FUEL", nullable = false, length = 100)
	public String getFuel() {
		return this.fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Column(name = "PRICE", nullable = false, precision = 10)
	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Column(name = "IS_NEW", nullable = false, precision = 1)
	public Boolean getIsNew() {
		return this.isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	@Column(name = "MILEAGE", precision = 10)
	public Integer getMileage() {
		return this.mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	@Column(name = "FIRST_REGISTRATION", precision = 23, scale = 10)
	public Timestamp getFirstRegistration() {
		return this.firstRegistration;
	}

	public void setFirstRegistration(Timestamp firstRegistration) {
		this.firstRegistration = firstRegistration;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("CarAdverts (");

		sb.append(guid);
		sb.append(", ").append(title);
		sb.append(", ").append(fuel);
		sb.append(", ").append(price);
		sb.append(", ").append(isNew);
		sb.append(", ").append(mileage);
		sb.append(", ").append(firstRegistration);

		sb.append(")");
		return sb.toString();
	}
}