package com.lseg.domainservice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lseg.domainservice.model.GiophyResultInfo;
import com.lseg.domainservice.model.IssuerInfo;
import com.lseg.domainservice.util.JsonFileReaderAsString;

@Repository
public class SearchDaoImpl implements Searchdao {

	private final Logger logger = LogManager.getLogger(SearchDaoImpl.class);
	@Override
	public List<IssuerInfo> getIssuerInfo(String issuerName) throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		List<IssuerInfo> issuerInfoList = new ArrayList<>();
		List<IssuerInfo> issuerInfoListByissuerName = new ArrayList<>();
		logger.info("issuerName  is ::" + issuerName);
		String path = "src/main/resources/json/IssuerList.json";
		String issuerListJson = JsonFileReaderAsString.getJsonFromFile(path);
		TypeReference<List<IssuerInfo>> typeRef = new TypeReference<List<IssuerInfo>>() {
		};
		try {
			issuerInfoList = objectMapper.readValue(issuerListJson, typeRef);
			logger.info("issuerInfoList size is ::" + issuerInfoList.size());
		} catch (JsonProcessingException e) {
			logger.error("Error while parsing the json file..."+e.getMessage());
			throw new Exception();
		}
		issuerInfoListByissuerName = issuerInfoList.stream().filter(i -> i.getIssuerName().equals(issuerName))
				.collect(Collectors.toList());
		logger.info("issuerInfoListByissuerName size is ::" + issuerInfoListByissuerName.size());
		return issuerInfoListByissuerName;
	}

	@Override
	public List<GiophyResultInfo> getGiophyResultInfo(String year) throws Exception {
		List<GiophyResultInfo> giophyResultInfoList = new ArrayList<>();
		List<GiophyResultInfo> giophyResultInfoListByYear = new ArrayList<>();
		ObjectMapper objectMapper = new ObjectMapper();
		logger.info("year  is ::" + year);
		String path = "src/main/resources/json/GiophyList.json";
		String giophyListJson = JsonFileReaderAsString.getJsonFromFile(path);
		TypeReference<List<GiophyResultInfo>> typeRef = new TypeReference<List<GiophyResultInfo>>() {
		};
		try {
			giophyResultInfoList = objectMapper.readValue(giophyListJson, typeRef);
			logger.info("giophyResultInfoList size is ::" + giophyResultInfoList.size());
		} catch (JsonProcessingException e) {
			logger.error("Error while parsing the json file..."+e.getMessage());
			throw new Exception();
		}
		giophyResultInfoListByYear = giophyResultInfoList.stream().filter(i -> i.getFileProcessYear().equals(year))
				.collect(Collectors.toList());
		logger.info("giophyResultInfoListByYear size is ::" + giophyResultInfoListByYear.size());
		return giophyResultInfoListByYear;
	}
	
	private Connection getConnection() throws SQLException {
		try {
			Context ctx = new InitialContext();
			Context xmlContext = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) xmlContext.lookup("jdbc/MK1_1.idpUI.Service.Database");
			Connection conn = ds.getConnection();
			logger.info("Connected to database");
			return conn;

		} catch (NamingException ignorred) {
			return null;

		}
	}
	
	private String getRowCount(Connection conn) throws SQLException {
		String count = "";
		PreparedStatement prepareStatement = conn
				.prepareStatement("SELECT COUNT(*) FROM \"MK1_1\".\"idpUI.Service.Database::CompProfile\";");
		ResultSet resultSet = prepareStatement.executeQuery();
		while (resultSet.next()) {
			count = resultSet.getString(1);

		}
		return count;
	}
	
	public void test() throws Exception {
		Connection conn = null;
		try {
			conn = getConnection();
			logger.info("Row count is ::"+getRowCount(conn));

		} catch (SQLException e) {
			throw new Exception(e.getMessage(), e);

		}
	}

}