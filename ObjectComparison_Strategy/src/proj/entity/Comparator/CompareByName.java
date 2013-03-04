package proj.entity.Comparator;
import proj.entity.Business;
import java.util.Comparator;

public class CompareByName implements Comparator<Business> {
	@Override
	public int compare (Business b1, Business b2)
	{
		String name1=b1.getBusinessName();
		String name2=b2.getBusinessName();
		
		return name1.compareToIgnoreCase(name2);
	}
}
