package com.covidtracker.coviddata.bo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.covidtracker.coviddata.dao.CountryRepository;
import com.covidtracker.coviddata.entity.CountryEntity;

@Component
public class CountryBO {
	
	@Autowired
	private CountryRepository countryRepo;

	public Optional<CountryEntity> getCountryById(int id)
	{
		return countryRepo.findById(id);
	}
}
