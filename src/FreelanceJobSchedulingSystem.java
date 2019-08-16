import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class FreelanceJobSchedulingSystem {

	public static void main(String[] args) {
		
		Queue<Job> jobs = createJobs();
		DayList dayList = new DayList(35);
		
		while(!jobs.isEmpty()) {
			Job job = jobs.poll();
			System.out.println(job.toString());
			
			if(dayList.getNumAvailableDays() >= job.getDuration()) {
				dayList.assignJob(job);
			}
		}
		
		System.out.println(dayList.getSchedule());
		System.out.println(dayList.getTotalProfit());
	}

	public static Queue<Job> createJobs() {
		Queue<Job> jobs = new PriorityQueue<Job>(new JobComparator());
		int profits[] = {1000, 200, 800, 3200, 200, 3000};
		int days[] = {14, 7, 5, 20, 2, 1};
		int deadlines[] = {16, 9, 15, 29, 27, 31};
		
		for(int i = 0; i < profits.length; i++) {
			Job job = new Job(profits[i], days[i], deadlines[i]);
			jobs.offer(job);
		}
		
		return jobs;
	}
}
