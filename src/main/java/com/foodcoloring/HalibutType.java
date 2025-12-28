package com.foodcoloring;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum HalibutType {
	NONE("None"),
	LIGHT("Light"),
	GREEN("Green"),
	BROWN("Brown"),
	HALIBWAN("Halibwan");

	@Getter
	private final String name;
}
