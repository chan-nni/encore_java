package com.encore.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class EncoreInteger implements Comparable<EncoreInteger>{

	private int data;

	@Override
	public int compareTo(EncoreInteger o) {
		return this.data - o.data;
	}

	
}