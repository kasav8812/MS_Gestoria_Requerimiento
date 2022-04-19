package com.totalplay.requerimiento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.totalplay.requerimiento.dao.SelectDao;
import com.totalplay.requerimiento.model.StatsuVo;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@Transactional
public class StatusService {

	@Autowired
	SelectDao selectDao;
	
	public StatsuVo getStatus() {
		log.info("getSattus");
		return selectDao.getStatus();
	}

}
