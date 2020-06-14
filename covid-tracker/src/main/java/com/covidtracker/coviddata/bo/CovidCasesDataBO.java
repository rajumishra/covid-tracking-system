package com.covidtracker.coviddata.bo;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.covidtracker.coviddata.dao.CovidCasesDataRepository;
import com.covidtracker.coviddata.entity.CovidCasesEntity;

@Component
public class CovidCasesDataBO {
	
	@Autowired
	private CovidCasesDataRepository covidCaseRepo;
	
	
	public List<Map<String,Integer>> getCovidCases()
	{
		return covidCaseRepo.findCurrentCount();
	}
	
	public List<Map<String,Integer>> getCovidCasesByCountryID(Integer countryID)
	{
		return covidCaseRepo.findCurrentCountByCountryID(countryID);
	}

}
