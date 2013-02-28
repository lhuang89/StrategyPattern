package proj.Algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeSort<T> implements SortAlgorithm<T> {
    @SuppressWarnings("hiding")
	private <T extends Comparable<? super T>>  List<T> StartMergeSort(List<T> aList)
    {
    	if (aList.size()<=1)
    		return aList;
    	
    	int middle=aList.size()/2;
    	List<T> leftList=(List<T>) aList.subList(0, middle);
    	List<T> rightList=(List<T>) aList.subList(middle, aList.size());
    	
    	leftList=StartMergeSort(leftList);
    	rightList=StartMergeSort(rightList);
    	
    	List<T> result=Merge(leftList,rightList);
    	
    	return result;
    }
    
    @SuppressWarnings("hiding")
	private <T extends Comparable<? super T>> List<T> Merge(List<T> left,List<T> right)
    {
    	List<T> result =new ArrayList<T>();
    	Iterator<T> it1=left.iterator();
    	Iterator<T> it2=right.iterator();
    	
    	T a=it1.next();
    	T b=it2.next();
    	
    	while(true)
    	{
    		if(a.compareTo(b)<=0)
    		{
    			result.add(a);
    			if(it1.hasNext())
    			{
    				a=it1.next();
    			}
    			else
    			{
    				result.add(b);
    				while(it2.hasNext())
    				{
    					result.add(it2.next());
    				}
    			    break;	
    			}
    		}
    		else
    		{
    			result.add(b);
    			if (it2.hasNext())
    			{
    				b=it2.next();
    			}
    			else
    			{
    				result.add(a);
    				while(it1.hasNext())
    				{
    					result.add(it1.next());
    				}
    			}
    			break;
    		}   		
    	}
    	return result;
    }

	@SuppressWarnings("hiding")
	@Override
	public <T extends Comparable<? super T>> List<T> Sort(List<T> aList) {
		return StartMergeSort(aList);
	}	
}
