package proj.Algorithm;

import java.util.List;

public class ShellSort<T> implements SortAlgorithm<T> {
	@SuppressWarnings("hiding")
	@Override
	public <T extends Comparable<? super T>> List<T> Sort(List<T> array) {
		int increment=array.size()/2;
		
		while (increment>0)
		{
			for (int i=increment;i<array.size();i++)
			{
				int j=i;
				T temp=array.get(i);
				while(j>=increment && array.get(j-increment).compareTo(temp)>0){
					array.set(j, array.get(j-increment));
					j=j-increment;
				}
				array.set(j, temp);
			}
			
			if (increment==2)
			{
				increment=1;
			}
			else
			{
				increment*=5.0/11;
			}
		}
		return array;
	}
}
