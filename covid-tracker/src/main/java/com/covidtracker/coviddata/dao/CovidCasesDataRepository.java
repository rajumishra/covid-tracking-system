package com.covidtracker.coviddata.dao;


import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.covidtracker.coviddata.entity.CovidCasesEntity;

public interface CovidCasesDataRepository  extends CrudRepository<CovidCasesEntity, Integer>{

	List<CovidCasesEntity> findByCountryIDAndStateIDAndCitiIDAndDateUpdatedAndCaseType(Integer countryID,Integer stateID,Integer citiID,Date dateUpdated,Integer caseType);
	
	@Query("select cs.caseType as ct,sum(cs.caseCount) as total from covid_cases cs group by caseType")
	List<Map<String,Integer>> findCurrentCount();
	
	@Query("select cs.caseType as ct,sum(cs.caseCount) as total from covid_cases cs where cs.countryID = :countryID  group by caseType")
	List<Map<String,Integer>> findCurrentCountByCountryID(@Param("countryID")Integer countryID);

}
