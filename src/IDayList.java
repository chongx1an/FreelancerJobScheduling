
public interface IDayList<Day> {
	public int getNumAvailableDays();
	public void assignJob(Job job);
	public String getSchedule();
	public int getTotalProfit();
}
