package com.lseg.domainservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


/**
 * @Data is a convenient shortcut annotation that bundles the features
 *       of @ToString, @EqualsAndHashCode, @Getter / @Setter
 *       and @RequiredArgsConstructor together.
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuerInfo {

	private String issuerName;
	private String type;
	private String isin;
	private String cusip;
	private String sedol;
	private String reutersInstrumentCode;
	private String securityDescription;
	private Long tradingLineID;
	private Long issueID;
	private String issueShortName;
	private String assetSubType;
	private String ticker;
	private String permID;
	private String beginDate;
	private String lastUpdatedBy;


}
