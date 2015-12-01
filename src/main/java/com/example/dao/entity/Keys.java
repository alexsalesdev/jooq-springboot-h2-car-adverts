/**
 * This class is generated by jOOQ
 */
package com.example.dao.entity;


import com.example.dao.entity.tables.CarAdverts;
import com.example.dao.entity.tables.records.CarAdvertsRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>PUBLIC</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<CarAdvertsRecord> CAR_ADVERTS_PK = UniqueKeys0.CAR_ADVERTS_PK;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<CarAdvertsRecord> CAR_ADVERTS_PK = createUniqueKey(CarAdverts.CAR_ADVERTS, CarAdverts.CAR_ADVERTS.GUID);
	}
}
