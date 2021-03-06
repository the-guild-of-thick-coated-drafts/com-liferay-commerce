/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.openapi.admin.model.v2_0;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import com.liferay.commerce.openapi.core.annotation.Nullable;

import java.util.Map;

import javax.annotation.Generated;

/**
 * @author Igor Beslic
 */
@Generated(value = "OSGiRESTModuleGenerator")
@JacksonXmlRootElement(localName = "Country")
public class CountryDTO {

	@Nullable
	public Long getId() {
		return _id;
	}

	public Map<String, String> getName() {
		return _name;
	}

	public Integer getNumericISOCode() {
		return _numericISOCode;
	}

	@Nullable
	public RegionDTO[] getRegions() {
		return _regions;
	}

	public String getThreeLettersISOCode() {
		return _threeLettersISOCode;
	}

	public String getTwoLettersISOCode() {
		return _twoLettersISOCode;
	}

	@Nullable
	public Boolean isBillingAllowed() {
		return _billingAllowed;
	}

	@Nullable
	public Boolean isShippingAllowed() {
		return _shippingAllowed;
	}

	@Nullable
	public Boolean isSubjectToVAT() {
		return _subjectToVAT;
	}

	public void setBillingAllowed(Boolean billingAllowed) {
		_billingAllowed = billingAllowed;
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setName(Map<String, String> name) {
		_name = name;
	}

	public void setNumericISOCode(Integer numericISOCode) {
		_numericISOCode = numericISOCode;
	}

	public void setRegions(RegionDTO[] regions) {
		_regions = regions;
	}

	public void setShippingAllowed(Boolean shippingAllowed) {
		_shippingAllowed = shippingAllowed;
	}

	public void setSubjectToVAT(Boolean subjectToVAT) {
		_subjectToVAT = subjectToVAT;
	}

	public void setThreeLettersISOCode(String threeLettersISOCode) {
		_threeLettersISOCode = threeLettersISOCode;
	}

	public void setTwoLettersISOCode(String twoLettersISOCode) {
		_twoLettersISOCode = twoLettersISOCode;
	}

	@Nullable
	private Boolean _billingAllowed;

	@Nullable
	private Long _id;

	private Map<String, String> _name;
	private Integer _numericISOCode;

	@Nullable
	private RegionDTO[] _regions;

	@Nullable
	private Boolean _shippingAllowed;

	@Nullable
	private Boolean _subjectToVAT;

	private String _threeLettersISOCode;
	private String _twoLettersISOCode;

}