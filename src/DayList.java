
public class DayList extends AbstractDayList{
	private Day[] days;
	private int size;
	
	public DayList(int size) {
		days = new Day[size];
		for(int i = 0; i < size; i++) {
			Day day = new Day(i);
			days[i] = day;
		}
		this.size = size;
	}
	
	public int getNumAvailableDays() {
		
		int count = 0;
		
		for(Day day: days) {
			if(day.getAvailability()) {
				count++;
			}
		}
		
		return count;
	}

	public void assignJob(Job job) {
		Day endDay = null;
		for(int i = days.length - 1; i >= 0; i--) {
			if(days[i].getAvailability() && job.getDeadline() >= i) {
				endDay = days[i];
				break;
					
			}
		}
		
		if(endDay != null) {

			int startDay = endDay.getIndex() - job.getDuration();

			if (startDay >= 0) {
				for (int i = endDay.getIndex(); i > startDay; i--) {
					days[i].assignJob(job);
				}
			
			}
		}
		
	}
	
	public String getSchedule() {
		String schedule = "";
		for(Day day: days) {
			schedule += day.toString() + "\n";
		}
		
		return schedule;
	}
	
	public int getTotalProfit() {
		int totalProfit = 0;
		
		for(Day day: days) {
			if(day.getJobAssigned() != null) {
				totalProfit += day.getJobAssigned().getRatio();
			}
		}
		
		return totalProfit;
	}

	@Override
	public void add(int index, Day day) {
		ensureCapacity();
		
		// Move the elements to the right after the specified index
		for (int i = size - 1; i >= index; i--)
			days[i + 1] = days[i];
		
		// Insert new element to data[index]
		days[index] = day;
		
		// Increase size by 1
		size++;
		
	}

	private void ensureCapacity() {
		if (size >= days.length) {
			Day[] newData = (Day[])(new Object[size * 2 + 1]);
			System.arraycopy(days, 0, newData, 0, size);
			days = newData;
	 }
	}

	@Override
	public void clear() {
		days = new Day[size];
		for(int i = 0; i < size; i++) {
			Day day = new Day(i);
			days[i] = day;
		}
		
	}

	@Override
	public boolean contains(Day day) {
		for (int i = 0; i < size; i++)
			 if (day.equals(days[i])) 
				 return true;
		return false;
	}

	@Override
	public Day get(int index) {
		return days[index];
	}

	@Override
	public int indexOf(Day day) {
		for (int i = 0; i < size; i++)
			 if (day.equals(days[i])) 
				 return i;
		return -1;
	}

	@Override
	public int lastIndexOf(Day day) {
		for (int i = size - 1; i >= 0; i--)
			 if (day.equals(days[i])) 
				 return i;
		return -1;
	}


}
