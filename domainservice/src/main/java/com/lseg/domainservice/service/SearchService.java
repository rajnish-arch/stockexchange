package com.lseg.domainservice.service;

import java.util.List;

import com.lseg.domainservice.model.GiophyResultInfo;
import com.lseg.domainservice.model.IssuerInfo;

public interface SearchService {

	public List<IssuerInfo> getIssuerInfoByIssuerName(String issuerName) throws Exception;

	public List<GiophyResultInfo> getGiophyResultInfoByYear(String year) throws Exception;
	
}