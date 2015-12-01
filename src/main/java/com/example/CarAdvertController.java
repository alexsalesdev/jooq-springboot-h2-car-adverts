package com.example;

import com.example.dao.entity.tables.daos.CarAdvertsDao;
import com.example.dao.entity.tables.pojos.CarAdverts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

/**
 * Created by asales on 30/11/2015.
 */
@RestController("/car-advert")
public class CarAdvertController {
    private static final Logger logger = LoggerFactory.getLogger(CarAdvertController.class);
    @Autowired
    private CarAdvertsDao carAdvertsDao;

    @RequestMapping
    public List<CarAdverts> list() {
        return carAdvertsDao.findAll();
    }

    @RequestMapping(value = "/id/{id}")
    public CarAdverts getCarById(@PathVariable String id) {
        return carAdvertsDao.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody CarAdverts carAdverts) {
        carAdverts.setGuid(UUID.randomUUID().toString());
        carAdverts.setFirstRegistration(new Timestamp(System.currentTimeMillis()));
        carAdvertsDao.insert(carAdverts);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody CarAdverts carAdverts) {
        carAdvertsDao.update(carAdverts);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable String id) {
        carAdvertsDao.deleteById(id);
    }
}
