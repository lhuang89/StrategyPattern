package proj.entity;

import java.util.ArrayList;
import java.util.Comparator;

import proj.Algorithm.SortAlgorithm;

public class BusinessDirectory {
private ArrayList<Business> business_dir;
private SortAlgorithm<Business> sort_strategy;

public BusinessDirectory()
{
	business_dir=new ArrayList<Business>();
}
public void AddBusiness(Business business)
{
	this.business_dir.add(business);
}

public void RemoveBusiness(Business business)
{
	this.business_dir.remove(business);
}

public void ListAllBusiness()
{
	for (Business i:this.business_dir)
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
	this.sort_strategy.Sort(this.business_dir);
}

public ArrayList<Business> getBusinessDirectory()
{
	return this.business_dir;
}
}
