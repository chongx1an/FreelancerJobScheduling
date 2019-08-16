
public class Day {
	private int index;
	private boolean availabiity = true;
	private Job jobAssigned;
	
	public Day(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public boolean getAvailability() {
		return availabiity;
	}
	
	public Job getJobAssigned() {
		return this.jobAssigned;
	}
	
	public void assignJob(Job job) {
		this.jobAssigned = job;
		this.availabiity = false;
	}
	
	public String toString() {
		if (jobAssigned != null)
			return String.format("%2d: %-35s", index, jobAssigned.toString());
		else
			return String.format("%2d: %-10s", index, "Rest day");
	}
}
