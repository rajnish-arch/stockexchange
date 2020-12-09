package com.lseg.frontend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lseg.frontend.service.RequestEventPublisher;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/v1")
public class SearchController {

	
	
	private final RequestEventPublisher reqEventPub;

	@ApiOperation(value = "View a list of issuer info", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the list"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(path = "/searchresult")
	public ResponseEntity<?> getIssuerInfo(@RequestParam String issuerName) {

		this.reqEventPub.sendMessage(issuerName);
        return new ResponseEntity<Void>( HttpStatus.OK );
		
		
		} 
	
	public SearchController(RequestEventPublisher reqEventPub) {
		this.reqEventPub = reqEventPub;
	}
		/*
		 * // Provide list of issuerName Info if(StringUtils.isEmpty(issuerName)) {
		 * return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); } else {
		 * List<IssuerInfo> issuerList = new ArrayList<>(); try { issuerList =
		 * service.getIssuerInfoByIssuerName(issuerName); if(issuerList.isEmpty()) {
		 * ErrorResponse error = new ErrorResponse(); error.setCode("LSEG-00329-1001");
		 * error.setDescription("The given issuerName is invalid");
		 * error.setResolution("Please contact client services");
		 * 
		 * return ResponseEntity.ok(error).status(HttpStatus.NO_CONTENT).build(); } }
		 * catch (Exception e) { ErrorResponse error = new ErrorResponse();
		 * error.setCode("LSEG-00329-1001");
		 * error.setDescription("The given issuerName is invalid");
		 * error.setResolution("Please contact client services"); return
		 * ResponseEntity.ok(error).status(HttpStatus.INTERNAL_SERVER_ERROR).build(); }
		 * 
		 * return ResponseEntity.ok(issuerList); }
		 * 
		 */
/*	
	@ApiOperation(value = "View a list of Giophy result", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the list"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(path = "/geophyresult")
	public ResponseEntity<?> getGiophyResult(@RequestParam String year) {*/
		/*
		 * // Provide list of issuerName Info if(StringUtils.isEmpty(year)) { return
		 * ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); } else {
		 * List<GiophyResultInfo> geophyList = new ArrayList<>(); try { geophyList =
		 * service.getGiophyResultInfoByYear(year);
		 * 
		 * if(geophyList.isEmpty()) { ErrorResponse error = new ErrorResponse();
		 * error.setCode("LSEG-00329-1001");
		 * error.setDescription("The given issuerName is invalid");
		 * error.setResolution("Please contact client services"); return
		 * ResponseEntity.ok(error).status(HttpStatus.NO_CONTENT).build(); } } catch
		 * (Exception e) { ErrorResponse error = new ErrorResponse();
		 * error.setCode("LSEG-00329-1001");
		 * error.setDescription("The given issuerName is invalid");
		 * error.setResolution("Please contact client services"); return
		 * ResponseEntity.ok(error).status(HttpStatus.INTERNAL_SERVER_ERROR).build(); }
		 * if(geophyList.isEmpty()) { return
		 * ResponseEntity.status(HttpStatus.NOT_FOUND).build(); } return
		 * ResponseEntity.ok(geophyList).status(HttpStatus.OK).build(); }
		 */}

	/*
	 * @ApiOperation(value = "View a list of Giophy result", response = List.class)
	 * 
	 * @ApiResponses(value = { @ApiResponse(code = 200, message =
	 * "Successfully retrieved list"),
	 * 
	 * @ApiResponse(code = 401, message =
	 * "You are not authorized to view the list"),
	 * 
	 * @ApiResponse(code = 403, message =
	 * "Accessing the resource you were trying to reach is forbidden"),
	 * 
	 * @ApiResponse(code = 404, message =
	 * "The resource you were trying to reach is not found") })
	 * 
	 * @GetMapping(path = "/geophyresult") public List<GiophyResultInfo>
	 * getGiophyResult(@RequestParam String year) { return
	 * service.getGiophyResultInfoByYear(year); }
	 */
	
	/*
	 * @ApiOperation(value = "View a list of issuer info", response = List.class)
	 * 
	 * @ApiResponses(value = { @ApiResponse(code = 200, message =
	 * "Successfully retrieved list"),
	 * 
	 * @ApiResponse(code = 401, message =
	 * "You are not authorized to view the list"),
	 * 
	 * @ApiResponse(code = 403, message =
	 * "Accessing the resource you were trying to reach is forbidden"),
	 * 
	 * @ApiResponse(code = 404, message =
	 * "The resource you were trying to reach is not found") })
	 * 
	 * @GetMapping(path = "/searchresult") public List<IssuerInfo>
	 * getIssuerInfo(@RequestParam String issuerName) { // Provide list of
	 * issuerName Info return service.getIssuerInfoByIssuerName(issuerName); }
	 */
