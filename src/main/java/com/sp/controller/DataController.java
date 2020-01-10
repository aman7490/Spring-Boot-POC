package com.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.entity.Temperature;
import com.sp.entity.ostate;
import com.sp.repository.DataRepository;
import com.sp.repository.OstateRepository;

@RestController
public class DataController  {

@Autowired DataRepository datarepository;
@Autowired OstateRepository ostaterepository;

@RequestMapping(value = "/gettemperaturedata", method = RequestMethod.GET)
public List<Temperature> getalltemp(){	
	List<Temperature> alldata = datarepository.findAll();
	return alldata;
	
}

@RequestMapping(value = "/getostatedata", method = RequestMethod.GET)
public List<ostate> getallostate(){	
	List<ostate> allstatedata = ostaterepository.findAll();
	return allstatedata;
	
}

	
}
