import java.util.Comparator;

public class JobComparator implements Comparator<Job> {
	public int compare(Job job1, Job job2) {
		
		double value = job1.getProfit()/job1.getDuration() - job2.getProfit()/job2.getDuration();
		
		if(value > 0)
			return -1;
		
		else if(value < 0)
			return 1;
		
		else
			return 0;
	}
}
