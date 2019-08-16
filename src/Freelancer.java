import java.util.PriorityQueue;
import java.util.Queue;

public class Freelancer {
	private String name;
	private IDayList dayList;
	private Queue<Job> jobs;
	
	public String getName() {
		return this.name;
	}
	
	public IDayList getDayList() {
		return this.dayList;
	}
	
	
	public Freelancer(String name, int numDays) {
		this.name = name;
		this.dayList = new DayList(numDays);
		this.jobs = new PriorityQueue<Job>(new JobComparator());
	}
	
	public String scheduleJob(Job job) {
		jobs.add(job);
		Queue<Job> tempJobs = new PriorityQueue<Job>(jobs);
		
		dayList.clear();
		
		while(!tempJobs.isEmpty()) {
			Job currentJob = tempJobs.poll();
			System.out.println(currentJob.toString());
			
			if(dayList.getNumAvailableDays() >= currentJob.getDuration()) {
				dayList.assignJob(currentJob);
				
			}
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println();
		return dayList.getSchedule();
	}
	
	public int getTotalProfit() {
		return this.dayList.getTotalProfit();
	}
	
}
