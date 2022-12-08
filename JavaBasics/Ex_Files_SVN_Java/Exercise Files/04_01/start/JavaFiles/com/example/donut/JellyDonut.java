package com.example.donut;

import java.math.BigDecimal;

import com.example.donut.cooker.iDonutCooker;

public class JellyDonut implements iDonut {
	private int powderedSugarGrams;

	@Override
	public boolean cook(iDonutCooker cooker) {
		return cooker.cook(this, 400, 120);
	}
	
	@Override
	public void addToppings() {
		powderedSugarGrams = 5;
	}

	@Override
	public int getCalories() {
		return 200 + (powderedSugarGrams * 4);
	}

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal("1.50");
	}

	@Override
	public String getDescription() {
		return "Jelly Doughnut";
	}

}
