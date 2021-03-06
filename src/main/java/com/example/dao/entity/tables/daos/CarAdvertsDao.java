/**
 * This class is generated by jOOQ
 */
package com.example.dao.entity.tables.daos;


import com.example.dao.entity.tables.CarAdverts;
import com.example.dao.entity.tables.records.CarAdvertsRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DAOImpl;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


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
@Component
public class CarAdvertsDao extends DAOImpl<CarAdvertsRecord, com.example.dao.entity.tables.pojos.CarAdverts, String> {

	@Resource
	private DSLContext dsl;

	@PostConstruct
	private void init() {
		System.out.println(this.getClass().getName() + " init jooq config");
		this.setConfiguration(this.dsl.configuration());
	}

	/**
	 * Create a new CarAdvertsDao without any configuration
	 */
	public CarAdvertsDao() {
		super(CarAdverts.CAR_ADVERTS, com.example.dao.entity.tables.pojos.CarAdverts.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getId(com.example.dao.entity.tables.pojos.CarAdverts object) {
		return object.getGuid();
	}

	/**
	 * Fetch records that have <code>GUID IN (values)</code>
	 */
	public List<com.example.dao.entity.tables.pojos.CarAdverts> fetchByGuid(String... values) {
		return fetch(CarAdverts.CAR_ADVERTS.GUID, values);
	}

	/**
	 * Fetch a unique record that has <code>GUID = value</code>
	 */
	public com.example.dao.entity.tables.pojos.CarAdverts fetchOneByGuid(String value) {
		return fetchOne(CarAdverts.CAR_ADVERTS.GUID, value);
	}

	/**
	 * Fetch records that have <code>TITLE IN (values)</code>
	 */
	public List<com.example.dao.entity.tables.pojos.CarAdverts> fetchByTitle(String... values) {
		return fetch(CarAdverts.CAR_ADVERTS.TITLE, values);
	}

	/**
	 * Fetch records that have <code>FUEL IN (values)</code>
	 */
	public List<com.example.dao.entity.tables.pojos.CarAdverts> fetchByFuel(String... values) {
		return fetch(CarAdverts.CAR_ADVERTS.FUEL, values);
	}

	/**
	 * Fetch records that have <code>PRICE IN (values)</code>
	 */
	public List<com.example.dao.entity.tables.pojos.CarAdverts> fetchByPrice(Integer... values) {
		return fetch(CarAdverts.CAR_ADVERTS.PRICE, values);
	}

	/**
	 * Fetch records that have <code>IS_NEW IN (values)</code>
	 */
	public List<com.example.dao.entity.tables.pojos.CarAdverts> fetchByIsNew(Boolean... values) {
		return fetch(CarAdverts.CAR_ADVERTS.IS_NEW, values);
	}

	/**
	 * Fetch records that have <code>MILEAGE IN (values)</code>
	 */
	public List<com.example.dao.entity.tables.pojos.CarAdverts> fetchByMileage(Integer... values) {
		return fetch(CarAdverts.CAR_ADVERTS.MILEAGE, values);
	}

	/**
	 * Fetch records that have <code>FIRST_REGISTRATION IN (values)</code>
	 */
	public List<com.example.dao.entity.tables.pojos.CarAdverts> fetchByFirstRegistration(Timestamp... values) {
		return fetch(CarAdverts.CAR_ADVERTS.FIRST_REGISTRATION, values);
	}
}
