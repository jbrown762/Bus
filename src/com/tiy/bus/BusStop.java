package com.tiy.bus;

import java.util.ArrayList;

public class BusStop
{
	private ArrayList<Rider> waitingRiders = new ArrayList<>();

	public void busHasArrived(Bus bus)
	{
		for (Rider r : waitingRiders)
		{
			bus.addRiders(r);
			// waitingRiders.add(bus.);
			// bus.addRiders(bus);
		}
		// Move all the waiting riders into the bus

		// Remove all the riders from the Bus whose destination is this BusStop
		
		bus.unLoadRiders(this);
	}

	public void addWaitingRider(Rider rider)
	{
		waitingRiders.add(rider);
	}

}