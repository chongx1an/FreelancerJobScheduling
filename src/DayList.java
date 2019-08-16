
public class DayList extends AbstractDayList{
	private Day[] days;
	
	public DayList(int size) {
		days = new Day[size];
		for(int i = 0; i < size; i++) {
			Day day = new Day(i);
			days[i] = day;
		}
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
	
//	public void assignJob(Job job) {
//		Day startDay = null;
//		for(Day day:days) {
//			if(day.getAvailability()) {
//				startDay = day;
//				break;
//			}
//		}
//		
//		if(startDay != null) {
//			for (int i = startDay.getIndex(); i < startDay.getIndex() + job.getDuration(); i++) {
//				if(job.getDeadline() >= startDay.getIndex() + job.getDuration())
//					days[i].assignJob(job);
//			}
//		}
//		
//	}
	
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

			if (startDay > 0) {
				for (int i = endDay.getIndex(); i > startDay; i--) {
					days[i].assignJob(job);
				}
			
			}
		}
		
	}
	
//	public void assignJob(Job job) {
//	int startDay = job.getDeadline() - job.getDuration();
//	
//	for (int i = startDay; i < startDay + job.getDuration(); i++) {
//		if(job.getDeadline() >= startDay + job.getDuration())
//			days[i].assignJob(job);
//	}
//	
//}
	
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
}
