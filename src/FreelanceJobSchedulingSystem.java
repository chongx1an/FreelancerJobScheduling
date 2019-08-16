import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class FreelanceJobSchedulingSystem {

	public static void main(String[] args) {
		
		Freelancer freelancer = new Freelancer("Sunn", 35);
		ArrayList<Job> availableJobs = createJobs();
		
		int count = 1;
		for(Job job:availableJobs) {
			System.out.println("Iteration " + count);
			System.out.println("==================================================================");
			System.out.println(String.format("%-15s%-15s%-15s%-15s", "Profit", "Duration", "Deadline", "Profit Per Day"));
			System.out.println(freelancer.scheduleJob(job));
			System.out.println("------------------------------------------------------------------");
			System.out.println("Total profit: " + freelancer.getTotalProfit());
			System.out.println("==================================================================");
			System.out.println();
			System.out.println();
			count++;
		}
		

	}

	public static ArrayList<Job> createJobs() {
		ArrayList<Job> jobs = new ArrayList<Job>();
		int profits[] = {1000, 200, 700, 3200, 200, 3000};
		int days[] = {14, 7, 5, 20, 2, 1};
		int deadlines[] = {16, 9, 15, 29, 27, 31};
		
//		int profits[] = {400, 3200, 200, 200};
//		int days[] = {5, 20, 2, 5};
//		int deadlines[] = {15, 29, 27, 9};
		
//		int profits[] = {800, 800, 2000};
//		int days[] = {4, 4, 1};
//		int deadlines[] = {15, 19, 32};
		
		for(int i = 0; i < profits.length; i++) {
			Job job = new Job(profits[i], days[i], deadlines[i]);
			jobs.add(job);
		}
		
		return jobs;
	}
}
