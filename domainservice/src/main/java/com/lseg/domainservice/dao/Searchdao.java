package com.lseg.domainservice.dao;

import java.util.List;

import com.lseg.domainservice.model.GiophyResultInfo;
import com.lseg.domainservice.model.IssuerInfo;

public interface Searchdao {

	public List<IssuerInfo> getIssuerInfo(String issuerName) throws Exception;

	public List<GiophyResultInfo> getGiophyResultInfo(String year) throws Exception;

}