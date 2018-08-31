package greedyalgorithms;

public class ActivitySelection {
	public static void main(String[] args)
	{
		//sort according to finishing time.
		int s[] = {1,3,0,5,8,5};//starting time 
		int f[] = {2,4,6,7,9,9};//finishing time
		int n=s.length;
		
		maxActivities(s,f,n);
		
	}
	public static void maxActivities(int s[],int f[], int n)
	{
		int i,j;
		System.out.println("activities that are mutually compatable");
		//first is selected as it is sorted according to time
		i=0;
		System.out.println(i+"");
		//consider remaining
		for( j=1;j<n;j++)
		{
			//if this activity starting time is greaterthan
			//or equal to finshing time of previous activity,
			//than select it.
			if(s[j]>=f[i])
			{
				System.out.println(j+"");
				i=j;
			}
		}
	}

}
