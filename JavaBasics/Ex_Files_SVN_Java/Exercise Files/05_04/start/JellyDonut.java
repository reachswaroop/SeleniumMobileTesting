package com.example.donut;

import java.math.BigDecimal;

import com.example.donut.cooker.iDonutCooker;

public class JellyDonut implements iDonut {
	private int powderedSugarGrams;
	private int toppingsMultiplier = 1;

	@Override
	public boolean cook(iDonutCooker cooker) {
		return cooker.cook(this, 400, 120);
	}
	
	public void setToppingsMultiplier(int multiplier) {
		toppingsMultiplier = Math.max(1, multiplier);
	}
	
	@Override
	public void addToppings() {
		powderedSugarGrams = (5 * toppingsMultiplier);
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
