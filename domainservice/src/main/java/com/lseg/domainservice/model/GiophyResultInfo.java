package com.lseg.domainservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GiophyResultInfo {

	private String siGpConsCode;
	private String siGpIsin;
	private String siGpSedol;
	private String siGpCusip;
	private String siGpConstituentName;
	private String siGpCountryCode;
	private String siGpCurrencyCode;
	private String siGpMtcExchangeCode;
	private String siGpPrice;
	private String siGpSharesInIssue;
	private String siGpWeighting;
	private String siGpIndustryCode;
	private String siGpSuperSectorCode;
	private String siGpSectorCode;
	private String siGpSubSectorCode;
	private String siGpGrossDividendYield;
	private String siGpMktCapBeforeInvest;
	private String siGpMktCapAfterInvest;
	private String siGpPctWtEpraIndex;
	private String siGpPctWtEpraExAsiaIndex;
	private String siGpPctWtEpraExEuIndex;
	private String siGpPctWtEpraExNaIndex;
	private String siGpPctWtEpraEuIndex;
	private String siGpPctWtEpraEuZoneIndex;
	private String siGpPctWtEpraEuUkResIndex;
	private String siGpPctWtEpraEuExUkIndex;
	private String siGpPctWtEpraEuL40ExUkIndex;
	private String siGpPctWtEpraEuL40Index;
	private String siGpPctWtEpraAsiaIndex;
	private String siGpPctWtEpraPureAsiaIndex;
	private String siGpPctWtEpraNaIndex;
	private String siGpPctWtCountryIndex;
	private String siGpIndexMarker;
	private String siGpCompanyId;
	private String siGpCompanyName;
	private String siGpYear;
	private String siGpQuarter;
	private String siGpRevenueTotalUsd;
	private String siGpRevenueTotalLocal;
	private String siGpTotalAsserts;
	private String siGpTotalAssertsGreen;
	private String siGpTotalPercentGreen;
	private String siGpSqmAsserts;
	private String siGpSqmAssertsGreen;
	private String siGpSqmPercentGreen;
	private String siGpCarbanTotal;
	private String siGpCarbanSqm;
	private String siGpEnergyTotal;
	private String siGpEnergySqm;
	private String sigpConstituentNew;
	private String startDate;
	private String endDate;
	private String secondDateCsSecondDate;
	private String activeFlag;
	private String sourceFileName;
	private String fileLoadDateTime;
	private String fileProcessYear;
	private String fileProcessMonth;
	/*
	 * public String getSiGpConsCode() { return siGpConsCode; } public void
	 * setSiGpConsCode(String siGpConsCode) { this.siGpConsCode = siGpConsCode; }
	 * public String getSiGpIsin() { return siGpIsin; } public void
	 * setSiGpIsin(String siGpIsin) { this.siGpIsin = siGpIsin; } public String
	 * getSiGpSedol() { return siGpSedol; } public void setSiGpSedol(String
	 * siGpSedol) { this.siGpSedol = siGpSedol; } public String getSiGpCusip() {
	 * return siGpCusip; } public void setSiGpCusip(String siGpCusip) {
	 * this.siGpCusip = siGpCusip; } public String getSiGpConstituentName() { return
	 * siGpConstituentName; } public void setSiGpConstituentName(String
	 * siGpConstituentName) { this.siGpConstituentName = siGpConstituentName; }
	 * public String getSiGpCountryCode() { return siGpCountryCode; } public void
	 * setSiGpCountryCode(String siGpCountryCode) { this.siGpCountryCode =
	 * siGpCountryCode; } public String getSiGpCurrencyCode() { return
	 * siGpCurrencyCode; } public void setSiGpCurrencyCode(String siGpCurrencyCode)
	 * { this.siGpCurrencyCode = siGpCurrencyCode; } public String
	 * getSiGpMtcExchangeCode() { return siGpMtcExchangeCode; } public void
	 * setSiGpMtcExchangeCode(String siGpMtcExchangeCode) { this.siGpMtcExchangeCode
	 * = siGpMtcExchangeCode; } public String getSiGpPrice() { return siGpPrice; }
	 * public void setSiGpPrice(String siGpPrice) { this.siGpPrice = siGpPrice; }
	 * public String getSiGpSharesInIssue() { return siGpSharesInIssue; } public
	 * void setSiGpSharesInIssue(String siGpSharesInIssue) { this.siGpSharesInIssue
	 * = siGpSharesInIssue; } public String getSiGpWeighting() { return
	 * siGpWeighting; } public void setSiGpWeighting(String siGpWeighting) {
	 * this.siGpWeighting = siGpWeighting; } public String getSiGpIndustryCode() {
	 * return siGpIndustryCode; } public void setSiGpIndustryCode(String
	 * siGpIndustryCode) { this.siGpIndustryCode = siGpIndustryCode; } public String
	 * getSiGpSuperSectorCode() { return siGpSuperSectorCode; } public void
	 * setSiGpSuperSectorCode(String siGpSuperSectorCode) { this.siGpSuperSectorCode
	 * = siGpSuperSectorCode; } public String getSiGpSectorCode() { return
	 * siGpSectorCode; } public void setSiGpSectorCode(String siGpSectorCode) {
	 * this.siGpSectorCode = siGpSectorCode; } public String getSiGpSubSectorCode()
	 * { return siGpSubSectorCode; } public void setSiGpSubSectorCode(String
	 * siGpSubSectorCode) { this.siGpSubSectorCode = siGpSubSectorCode; } public
	 * String getSiGpGrossDividendYield() { return siGpGrossDividendYield; } public
	 * void setSiGpGrossDividendYield(String siGpGrossDividendYield) {
	 * this.siGpGrossDividendYield = siGpGrossDividendYield; } public String
	 * getSiGpMktCapBeforeInvest() { return siGpMktCapBeforeInvest; } public void
	 * setSiGpMktCapBeforeInvest(String siGpMktCapBeforeInvest) {
	 * this.siGpMktCapBeforeInvest = siGpMktCapBeforeInvest; } public String
	 * getSiGpMktCapAfterInvest() { return siGpMktCapAfterInvest; } public void
	 * setSiGpMktCapAfterInvest(String siGpMktCapAfterInvest) {
	 * this.siGpMktCapAfterInvest = siGpMktCapAfterInvest; } public String
	 * getSiGpPctWtEpraIndex() { return siGpPctWtEpraIndex; } public void
	 * setSiGpPctWtEpraIndex(String siGpPctWtEpraIndex) { this.siGpPctWtEpraIndex =
	 * siGpPctWtEpraIndex; } public String getSiGpPctWtEpraExAsiaIndex() { return
	 * siGpPctWtEpraExAsiaIndex; } public void setSiGpPctWtEpraExAsiaIndex(String
	 * siGpPctWtEpraExAsiaIndex) { this.siGpPctWtEpraExAsiaIndex =
	 * siGpPctWtEpraExAsiaIndex; } public String getSiGpPctWtEpraExEuIndex() {
	 * return siGpPctWtEpraExEuIndex; } public void setSiGpPctWtEpraExEuIndex(String
	 * siGpPctWtEpraExEuIndex) { this.siGpPctWtEpraExEuIndex =
	 * siGpPctWtEpraExEuIndex; } public String getSiGpPctWtEpraExNaIndex() { return
	 * siGpPctWtEpraExNaIndex; } public void setSiGpPctWtEpraExNaIndex(String
	 * siGpPctWtEpraExNaIndex) { this.siGpPctWtEpraExNaIndex =
	 * siGpPctWtEpraExNaIndex; } public String getSiGpPctWtEpraEuIndex() { return
	 * siGpPctWtEpraEuIndex; } public void setSiGpPctWtEpraEuIndex(String
	 * siGpPctWtEpraEuIndex) { this.siGpPctWtEpraEuIndex = siGpPctWtEpraEuIndex; }
	 * public String getSiGpPctWtEpraEuZoneIndex() { return
	 * siGpPctWtEpraEuZoneIndex; } public void setSiGpPctWtEpraEuZoneIndex(String
	 * siGpPctWtEpraEuZoneIndex) { this.siGpPctWtEpraEuZoneIndex =
	 * siGpPctWtEpraEuZoneIndex; } public String getSiGpPctWtEpraEuUkResIndex() {
	 * return siGpPctWtEpraEuUkResIndex; } public void
	 * setSiGpPctWtEpraEuUkResIndex(String siGpPctWtEpraEuUkResIndex) {
	 * this.siGpPctWtEpraEuUkResIndex = siGpPctWtEpraEuUkResIndex; } public String
	 * getSiGpPctWtEpraEuExUkIndex() { return siGpPctWtEpraEuExUkIndex; } public
	 * void setSiGpPctWtEpraEuExUkIndex(String siGpPctWtEpraEuExUkIndex) {
	 * this.siGpPctWtEpraEuExUkIndex = siGpPctWtEpraEuExUkIndex; } public String
	 * getSiGpPctWtEpraEuL40ExUkIndex() { return siGpPctWtEpraEuL40ExUkIndex; }
	 * public void setSiGpPctWtEpraEuL40ExUkIndex(String
	 * siGpPctWtEpraEuL40ExUkIndex) { this.siGpPctWtEpraEuL40ExUkIndex =
	 * siGpPctWtEpraEuL40ExUkIndex; } public String getSiGpPctWtEpraEuL40Index() {
	 * return siGpPctWtEpraEuL40Index; } public void
	 * setSiGpPctWtEpraEuL40Index(String siGpPctWtEpraEuL40Index) {
	 * this.siGpPctWtEpraEuL40Index = siGpPctWtEpraEuL40Index; } public String
	 * getSiGpPctWtEpraAsiaIndex() { return siGpPctWtEpraAsiaIndex; } public void
	 * setSiGpPctWtEpraAsiaIndex(String siGpPctWtEpraAsiaIndex) {
	 * this.siGpPctWtEpraAsiaIndex = siGpPctWtEpraAsiaIndex; } public String
	 * getSiGpPctWtEpraPureAsiaIndex() { return siGpPctWtEpraPureAsiaIndex; } public
	 * void setSiGpPctWtEpraPureAsiaIndex(String siGpPctWtEpraPureAsiaIndex) {
	 * this.siGpPctWtEpraPureAsiaIndex = siGpPctWtEpraPureAsiaIndex; } public String
	 * getSiGpPctWtEpraNaIndex() { return siGpPctWtEpraNaIndex; } public void
	 * setSiGpPctWtEpraNaIndex(String siGpPctWtEpraNaIndex) {
	 * this.siGpPctWtEpraNaIndex = siGpPctWtEpraNaIndex; } public String
	 * getSiGpPctWtCountryIndex() { return siGpPctWtCountryIndex; } public void
	 * setSiGpPctWtCountryIndex(String siGpPctWtCountryIndex) {
	 * this.siGpPctWtCountryIndex = siGpPctWtCountryIndex; } public String
	 * getSiGpIndexMarker() { return siGpIndexMarker; } public void
	 * setSiGpIndexMarker(String siGpIndexMarker) { this.siGpIndexMarker =
	 * siGpIndexMarker; } public String getSiGpCompanyId() { return siGpCompanyId; }
	 * public void setSiGpCompanyId(String siGpCompanyId) { this.siGpCompanyId =
	 * siGpCompanyId; } public String getSiGpCompanyName() { return siGpCompanyName;
	 * } public void setSiGpCompanyName(String siGpCompanyName) {
	 * this.siGpCompanyName = siGpCompanyName; } public String getSiGpYear() {
	 * return siGpYear; } public void setSiGpYear(String siGpYear) { this.siGpYear =
	 * siGpYear; } public String getSiGpQuarter() { return siGpQuarter; } public
	 * void setSiGpQuarter(String siGpQuarter) { this.siGpQuarter = siGpQuarter; }
	 * public String getSiGpRevenueTotalUsd() { return siGpRevenueTotalUsd; } public
	 * void setSiGpRevenueTotalUsd(String siGpRevenueTotalUsd) {
	 * this.siGpRevenueTotalUsd = siGpRevenueTotalUsd; } public String
	 * getSiGpRevenueTotalLocal() { return siGpRevenueTotalLocal; } public void
	 * setSiGpRevenueTotalLocal(String siGpRevenueTotalLocal) {
	 * this.siGpRevenueTotalLocal = siGpRevenueTotalLocal; } public String
	 * getSiGpTotalAsserts() { return siGpTotalAsserts; } public void
	 * setSiGpTotalAsserts(String siGpTotalAsserts) { this.siGpTotalAsserts =
	 * siGpTotalAsserts; } public String getSiGpTotalAssertsGreen() { return
	 * siGpTotalAssertsGreen; } public void setSiGpTotalAssertsGreen(String
	 * siGpTotalAssertsGreen) { this.siGpTotalAssertsGreen = siGpTotalAssertsGreen;
	 * } public String getSiGpTotalPercentGreen() { return siGpTotalPercentGreen; }
	 * public void setSiGpTotalPercentGreen(String siGpTotalPercentGreen) {
	 * this.siGpTotalPercentGreen = siGpTotalPercentGreen; } public String
	 * getSiGpSqmAsserts() { return siGpSqmAsserts; } public void
	 * setSiGpSqmAsserts(String siGpSqmAsserts) { this.siGpSqmAsserts =
	 * siGpSqmAsserts; } public String getSiGpSqmAssertsGreen() { return
	 * siGpSqmAssertsGreen; } public void setSiGpSqmAssertsGreen(String
	 * siGpSqmAssertsGreen) { this.siGpSqmAssertsGreen = siGpSqmAssertsGreen; }
	 * public String getSiGpSqmPercentGreen() { return siGpSqmPercentGreen; } public
	 * void setSiGpSqmPercentGreen(String siGpSqmPercentGreen) {
	 * this.siGpSqmPercentGreen = siGpSqmPercentGreen; } public String
	 * getSiGpCarbanTotal() { return siGpCarbanTotal; } public void
	 * setSiGpCarbanTotal(String siGpCarbanTotal) { this.siGpCarbanTotal =
	 * siGpCarbanTotal; } public String getSiGpCarbanSqm() { return siGpCarbanSqm; }
	 * public void setSiGpCarbanSqm(String siGpCarbanSqm) { this.siGpCarbanSqm =
	 * siGpCarbanSqm; } public String getSiGpEnergyTotal() { return siGpEnergyTotal;
	 * } public void setSiGpEnergyTotal(String siGpEnergyTotal) {
	 * this.siGpEnergyTotal = siGpEnergyTotal; } public String getSiGpEnergySqm() {
	 * return siGpEnergySqm; } public void setSiGpEnergySqm(String siGpEnergySqm) {
	 * this.siGpEnergySqm = siGpEnergySqm; } public String getSigpConstituentNew() {
	 * return sigpConstituentNew; } public void setSigpConstituentNew(String
	 * sigpConstituentNew) { this.sigpConstituentNew = sigpConstituentNew; } public
	 * String getStartDate() { return startDate; } public void setStartDate(String
	 * startDate) { this.startDate = startDate; } public String getEndDate() {
	 * return endDate; } public void setEndDate(String endDate) { this.endDate =
	 * endDate; } public String getSecondDateCsSecondDate() { return
	 * secondDateCsSecondDate; } public void setSecondDateCsSecondDate(String
	 * secondDateCsSecondDate) { this.secondDateCsSecondDate =
	 * secondDateCsSecondDate; } public String getActiveFlag() { return activeFlag;
	 * } public void setActiveFlag(String activeFlag) { this.activeFlag =
	 * activeFlag; } public String getSourceFileName() { return sourceFileName; }
	 * public void setSourceFileName(String sourceFileName) { this.sourceFileName =
	 * sourceFileName; } public String getFileLoadDateTime() { return
	 * fileLoadDateTime; } public void setFileLoadDateTime(String fileLoadDateTime)
	 * { this.fileLoadDateTime = fileLoadDateTime; } public String
	 * getfIleProcessYear() { return fIleProcessYear; } public void
	 * setfIleProcessYear(String fIleProcessYear) { this.fIleProcessYear =
	 * fIleProcessYear; } public String getFileProcessMonth() { return
	 * fileProcessMonth; } public void setFileProcessMonth(String fileProcessMonth)
	 * { this.fileProcessMonth = fileProcessMonth; }
	 */

	

}
