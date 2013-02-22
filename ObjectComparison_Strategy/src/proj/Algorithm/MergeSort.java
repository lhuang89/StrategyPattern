package proj.Algorithm;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort<T> implements SortAlgorithm<T> {
    @Override
	public ArrayList<T> Sort(ArrayList<T> array,Comparator<T> comparator)
    {
    	Split();
    	Merge();
    	return null;
    }
    
    private void Split()
    {}
    
    private void Merge()
    {}
}
