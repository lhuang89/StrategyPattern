package proj.Algorithm;

import java.util.LinkedList;
import java.util.List;

public class QuickSort<T> implements SortAlgorithm<T> {
	@SuppressWarnings("hiding")
	@Override
	public <T extends Comparable<? super T>> List<T> Sort(
			List<T> array) {
		if(array.size()<=1)
		{
			return array;
		}
		
		T pivot=array.get(0);
		
		List<T> less=new LinkedList<T>();
		List<T> pivotList=new LinkedList<T>();
		List<T> more=new LinkedList<T>();
		
		for (T i:array)
		{
			if(i.compareTo(pivot)<0)
			{
				less.add(i);
			}
			else if(i.compareTo(pivot)>0)
			{
				more.add(i);
			}
			else 
				pivotList.add(i);
		}
		
		less=Sort(less);
		more=Sort(more);
		
		less.addAll(pivotList);
		less.addAll(more);
		return less;
	}
}
