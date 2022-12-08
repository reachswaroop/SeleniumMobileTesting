package com.example.donut.collection;

import com.example.donut.iDonut;

/**
 * Four times the donuts... mmmmmm...
 * @author homer
 */
public class GiantBoxOfDonuts extends BoxOfDonuts {

	@Override
	public void addDonut(iDonut donut, int count) {
		super.addDonut(donut, count * 4);
	}

}
