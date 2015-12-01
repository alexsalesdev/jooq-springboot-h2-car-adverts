
INSERT INTO PUBLIC."CAR-ADVERTS"
(GUID, TITLE, FUEL, PRICE, IS_NEW, MILEAGE, FIRST_REGISTRATION)
VALUES('any_guid', 'honda', 'gasoline', 100, false, 0, NOW());

SELECT GUID, TITLE, FUEL, PRICE, IS_NEW, MILEAGE, FIRST_REGISTRATION
FROM PUBLIC."CAR-ADVERTS";

CREATE TABLE PUBLIC."CAR-ADVERTS" (
	GUID VARCHAR(100) NOT NULL,
	TITLE VARCHAR(100) NOT NULL,
	FUEL VARCHAR(100) NOT NULL,
	PRICE INTEGER NOT NULL,
	IS_NEW BOOLEAN NOT NULL,
	MILEAGE INTEGER DEFAULT 0,
	FIRST_REGISTRATION TIMESTAMP,
	CONSTRAINT CAR_ADVERTS_PK PRIMARY KEY (GUID)
);
