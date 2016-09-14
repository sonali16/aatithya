package com.aatithya.messaging;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Random {

	public Integer getOtp() {

		SecureRandom secureRandomGenerator = new SecureRandom();
		List<Object> randomNumberList = new ArrayList<Object>();

		randomNumberList = secureRandomGenerator.ints(1, 1000, 9999).boxed().collect(Collectors.toList());
		return (Integer) randomNumberList.get(0);
	}

}