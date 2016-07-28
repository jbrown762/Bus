package com.tiy.bus;

public class Rider
{
	private BusStop bs;

	public Rider(BusStop bs)
	{
		this.bs = bs;
	}
	
	public void setDestinationBusStop(BusStop currentStop)
	{
		bs = currentStop;
	}

	public BusStop getDestinationBusStop()
	{
		return bs;

	}
}