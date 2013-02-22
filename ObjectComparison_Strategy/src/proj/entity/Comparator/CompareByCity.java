package proj.entity.Comparator;

import java.util.Comparator;

import proj.entity.Business;

public class CompareByCity implements Comparator<Business> {
@Override
public int compare(Business b1, Business b2)
{
	String city1=b1.getCity();
	String city2=b2.getCity();
	
	if(city1.compareToIgnoreCase(city2)==0)
	{
		return 0;
	}
	else if (city1.compareToIgnoreCase(city2)<0)
	{
		return -1;
	}
	else
	{
		return 1;
	}
}
}
