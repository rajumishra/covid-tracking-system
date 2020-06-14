package com.covidtracker.coviddata.dao;

import org.springframework.data.repository.*;

import com.covidtracker.coviddata.entity.CountryEntity;

public interface CountryRepository extends CrudRepository<CountryEntity,Integer> {

}
