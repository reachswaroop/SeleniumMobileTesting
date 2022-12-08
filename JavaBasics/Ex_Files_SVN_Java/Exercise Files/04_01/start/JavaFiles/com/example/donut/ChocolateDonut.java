package com.example.donut;

import java.math.BigDecimal;

import com.example.donut.cooker.iDonutCooker;

public class ChocolateDonut implements iDonut {
	private int glazeGrams;

	@Override
	public boolean cook(iDonutCooker cooker) {
		return cooker.cook(this, 400, 120);
	}
	
	@Override
	public void addToppings() {
		glazeGrams = 2;
	}

	@Override
	public int getCalories() {
		return 180 + (glazeGrams * 5);
	}

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal("1.25");
	}

	@Override
	public String getDescription() {
		return "Chocolate Doughnut";
	}

}
