package proj.entity.Comparator;

import java.util.Comparator;

import proj.entity.Business;

public class CompareByZip implements Comparator<Business> {
	@Override
	public int compare(Business b1, Business b2)
	{
		String zip1=b1.getZip();
		String zip2=b2.getZip();
		
		if(zip1.compareToIgnoreCase(zip2)==0)
		{
			return 0;
		}
		else if (zip1.compareToIgnoreCase(zip2)<0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}

}
