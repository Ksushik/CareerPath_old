package com.syniaeva.idp.dto.utils;

/**
 * Created by osyniaeva on 1/31/17.
 */
public enum Level {

	INTERN(0), JUNIOR(1), REGULAR(2), SENIOR(3);

	private final int key;

	Level(int key) {
		this.key = key;
	}

	public int getKey() {
		return key;
	}

}
