package com.lseg.domainservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lseg.domainservice.dao.Searchdao;
import com.lseg.domainservice.model.GiophyResultInfo;
import com.lseg.domainservice.model.IssuerInfo;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	Searchdao dao;
	
	@Override
	public List<IssuerInfo> getIssuerInfoByIssuerName(String issuerName) throws Exception {
		return dao.getIssuerInfo(issuerName);
	}
	
	@Override
	public List<GiophyResultInfo> getGiophyResultInfoByYear(String year) throws Exception {
		return dao.getGiophyResultInfo(year);
	}

	
}