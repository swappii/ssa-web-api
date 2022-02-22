package com.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class SsaService {

	public String fetchStateName(String ssn) {
		String stateName = null;

		if (ssn.startsWith("4")) {
			stateName = "New Jersey";
		} else if (ssn.startsWith("5")) {
			stateName = "Rhode Island";
		} else if (ssn.startsWith("6")) {
			stateName = "Kentucky";
		} else if (ssn.startsWith("7")) {
			stateName = "Ohio";
		} else {
			stateName = "Invalid SSN";
		}
		return stateName;
	}
}
