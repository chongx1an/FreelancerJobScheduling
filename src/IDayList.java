
public interface IDayList {
	public int getNumAvailableDays();
	public void assignJob(Job job);
	public String getSchedule();
	public int getTotalProfit();
	
	/** Add a new element at the end of this list */
	public void add(Day day);
	 
	/** Add a new element at the specified index in this list */
	public void add(int index, Day day);
	 
	/** Clear the list */
	public void clear();
	 
	/** Return true if this list contains the element */
	public boolean contains(Day day);
	 
	/** Return the element from this list at the specified index */
	public Day get(int index);
	 
	/** Return the index of the first matching element in this list.
	 * Return -1 if no match. */
	public int indexOf(Day day);
	 
	/** Return true if this list contains no elements */
	public boolean isEmpty();
	
	/** Return the index of the last matching element in this list
	 * Return -1 if no match. */
	public int lastIndexOf(Day day);
	 
	/** Remove the first occurrence of the element o from this list.
	 * Shift any subsequent elements to the left.
	 * Return true if the element is removed. */
	public boolean remove(Day day);
	 
	/** Remove the element at the specified position in this list
	 * Shift any subsequent elements to the left.
	 * Return the element that was removed from the list. */
	public Day remove(int index);
	 
	/** Replace the element at the specified position in this list
	 * with the specified element and return the old element. */
	public Day set(int index, Day day);
	 
	/** Return the number of elements in this list */
	public int size();
	 
	/** Adds the elements in otherList to this list
	 * Returns true if this list changed as a result of the call */
	public boolean addAll(IDayList otherList);
	 
	/** Removes all the elements in otherList from this list
	 * Returns true if this list changed as a result of the call */
	public boolean removeAll(IDayList otherList);
	 
	/** Retains the elements in this list that are also in otherList
	 * Returns true if this list changed as a result of the call */
	public boolean retainAll(IDayList otherList);
	
	 
}
