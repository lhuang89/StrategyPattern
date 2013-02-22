package proj.entity;

import java.util.ArrayList;
import java.util.Comparator;

import proj.Algorithm.SortAlgorithm;

public class BusinessDirectory {
private ArrayList<Business> business_dir;
private SortAlgorithm<Business> sort_strategy;

public void AddBusiness(Business business)
{
	business_dir.add(business);
}

public void RemoveBusiness(Business business)
{
	business_dir.remove(business);
}

public void ListAllBusiness()
{
	java.util.Iterator<Business> i =business_dir.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.toString());
	}
}

public void setSortStrategy(SortAlgorithm<Business> strategy)
{
	this.sort_strategy=strategy;
}

public void Sort(Comparator<Business> comparator)
{
	this.sort_strategy.Sort(business_dir, comparator);
}
}
