package proj.Algorithm;

import java.util.List;

public interface SortAlgorithm<T> {
	@SuppressWarnings("hiding")
	public <T extends Comparable<? super T>> List<T> Sort(List<T> array);

}
