
public class Freelancer {
	private String name;
	private IDayList dayList;
	
	public Freelancer(String name, int numDays) {
		this.name = name;
		this.dayList = new DayList(numDays);
	}
	
}
