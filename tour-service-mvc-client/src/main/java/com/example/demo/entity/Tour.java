package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tour {
	
	private int tourID;
	private String tourName;
	private double duration;
	private double cost;

}
