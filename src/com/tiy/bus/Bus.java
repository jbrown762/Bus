package com.tiy.bus;

import java.util.ArrayList;

public class Bus
{
	private ArrayList<Rider> riders = new ArrayList<>();

	public Bus()
	{
	}

	public void addRiders(Rider r)
	{
		riders.add(r);

		// bs.busHasArrived(bus);
		// Move all the riders in the BusStop into the Bus
		// Hint: There are shortcut methods to help do this in ArrayList class.

		// Make sure you remove the Riders from the BusStop before leaving
	}

	public void unLoadRiders(BusStop bs)
	{
		for (int i = 0; i < riders.size(); i++)
		{
			if (riders.get(i).getDestinationBusStop().equals(bs))
			{
				riders.remove(getRiders().get(i));
				//System.out.println("REMOVED");
			}
		}
		// For any Rider that has the destinationStop matching the passed
		// BusStop
		// Remove them from the Bus
	}

	public ArrayList<Rider> getRiders()
	{
		return riders;
	}
}
