package com.example.donut;

import java.math.BigDecimal;

import com.example.donut.cooker.iDonutCooker;

public class GlazedDonut implements iDonut {
	@Override
	public boolean cook(iDonutCooker cooker) {
		return cooker.cook(this, 400, 130);
	}
	
	@Override
	public void addToppings() {
	}

	@Override
	public int getCalories() {
		return 180;
	}

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal("1.20");
	}

	@Override
	public String getDescription() {
		return "Glazed Donut";
	}

}
