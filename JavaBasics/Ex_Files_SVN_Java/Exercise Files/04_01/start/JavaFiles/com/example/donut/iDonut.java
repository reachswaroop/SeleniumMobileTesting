package com.example.donut;

import java.math.BigDecimal;

import com.example.donut.cooker.iDonutCooker;

public interface iDonut {
	public boolean cook(iDonutCooker cooker);
	public void addToppings();
	public int getCalories();
	public BigDecimal getPrice();
	public String getDescription();
}
