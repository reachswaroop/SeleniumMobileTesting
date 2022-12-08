package com.example.donut.collection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.example.donut.iDonut;

public class BoxOfDonuts {
	private List<iDonut> donuts = new ArrayList<iDonut>();
	
	public void addDonut(iDonut donut, int count) {
		for (int i = 0; i < count; i++) {
			donuts.add(donut);
		}
	}
	
	public int getCount() {
		return donuts.size();
	}
	
	public int getCalories() {
		int calories = 0;
		for (iDonut donut : donuts) {
			calories += donut.getCalories();
		}
		return calories;
	}
	
	public BigDecimal getPrice() {
		BigDecimal price = BigDecimal.ZERO;
		for (iDonut donut : donuts) {
			price.add(donut.getPrice());
		}
		return price;
	}
}
