
public abstract class AbstractDayList implements IDayList{
	
	protected int size = 0; // The size of the list
	
	public int getNumAvailableDays() {
		return this.size;
	}
	
	public void assignJob(Job job) {
		
	}
	
	public String getSchedule() {
		return null;
	}
	
	public int getTotalProfit() {
		return 1;
	}
	
	/** Create a default list */
	protected AbstractDayList() {
	 
	}
 
	/** Create a list from an array of objects */
	protected AbstractDayList(Day[] days) {
		for (int i = 0; i < days.length; i++)
			add(days[i]);
	}
 
	/** Add a new element at the end of this list */
	@Override
	public void add(Day day) {
		add(size, day);
	}
 
	/** Return true if this list contains no elements */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
 
	/** Return the number of elements in this list */
	@Override
	public int size() {
		return size;
	}

	/** Adds the elements in otherList to this list.
	 * Returns true if this list changed as a result of the call */
	@Override
	public boolean addAll(IDayList otherList) {
		for (int i = 0; i < otherList.size(); i++)
			add(otherList.get(i));

		if (otherList.size() > 0)
			return true;
		else
			return false;
	}

 
	/** Retains the elements in this list that are also in otherList
	 * Returns true if this list changed as a result of the call */
	@Override
	public boolean retainAll(IDayList otherList) {
		boolean changed = false;
		for (int i = 0; i < this.size(); ) {
			if (!otherList.contains(this.get(i))) {
				this.remove(get(i));
			 		changed = true;
			}
			else
				i++;
		}

		return changed;
	}

	@Override
	public boolean remove(Day day) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Day remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Day day) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(IDayList otherList) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
