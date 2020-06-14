package com.covidtracker.coviddata.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covidtracker.coviddata.bo.CountryBO;
import com.covidtracker.coviddata.bo.CovidCasesDataBO;
import com.covidtracker.coviddata.entity.CountryEntity;
import com.covidtracker.coviddata.entity.CovidCasesEntity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@RestController
public class DataController {

	@Autowired
	public CovidCasesDataBO covidCasesBO;
	

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/covidCount/world")
	public List<Map<String,Integer>> getWorldCount()
	{
		
		return covidCasesBO.getCovidCases();
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/covidCount/country/{countryID}")
	public List<Map<String,Integer>> getCovidCountByCountryID(@PathVariable Integer countryID)
	{
		
		return covidCasesBO.getCovidCasesByCountryID(countryID);
	}
}
