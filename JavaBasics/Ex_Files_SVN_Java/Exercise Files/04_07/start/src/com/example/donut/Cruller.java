package com.example.donut;

import java.math.BigDecimal;

import com.example.donut.cooker.iDonutCooker;

public class Cruller implements iDonut {
	@Override
	public boolean cook(iDonutCooker cooker) {
		return cooker.cook(this, 400, 150);
	}
	
	@Override
	public void addToppings() {
	}

	@Override
	public int getCalories() {
		return 160;
	}

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal("1.75");
	}

	@Override
	public String getDescription() {
		return "French Cruller";
	}

}
