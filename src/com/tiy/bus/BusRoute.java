package com.tiy.bus;

import java.util.ArrayList;

public class BusRoute
{
	private ArrayList<BusStop> busStops = new ArrayList<>();

	public BusRoute()
	{
		BusStop a = new BusStop();
		BusStop b = new BusStop();
		BusStop c = new BusStop();
		BusStop d = new BusStop();

		busStops.add(a);
		busStops.add(b);
		busStops.add(c);
		busStops.add(d);

		for (BusStop busStop : busStops)
		{
			busStop.addWaitingRider(new Rider(b));
			busStop.addWaitingRider(new Rider(c));
			busStop.addWaitingRider(new Rider(d));
		}
		// Create several BusStops and add them to busStops
		// Add a few waiting Riders to each BusStop

		Bus bus = new Bus();
		// Create the Bus

		for (BusStop busStop : busStops)
		{
			// Loop through bus stops and make the
			// Bus arrive at each
			busStop.busHasArrived(bus);
			System.out.println(bus.getRiders().size());
			// bus.addRiders(busStop);
		}
		
		
	}
	
	public static void main(String[] args)
	{
		BusRoute br = new BusRoute();
	}
}