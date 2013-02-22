package proj.entity.Comparator;
import proj.entity.Business;
import java.util.Comparator;

public class CompareByName implements Comparator<Business> {
	@Override
	public int compare (Business b1, Business b2)
	{
		String name1=b1.getBusinessName();
		String name2=b1.getBusinessName();
		
		if(name1.compareToIgnoreCase(name2)==0)
		{
			return 0;
		}
		else if (name1.compareToIgnoreCase(name2)<0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
