package Sdet_Java_Task2;
public class Q5 {
	int sec;
	int min;
	int hr;

	public Q5(int hr, int min, int sec) {
		this.hr = hr;
        this.min = min;
	    this.sec = sec;
	}
	public static Q5 difference(Q5 start, Q5 stop)
    {
        Q5 diff = new Q5(0, 0, 0);
       

        if(stop.sec > start.sec){
            --start.min;
            start.sec += 60;
        }

        diff.sec = start.sec - stop.sec;
        if(stop.min > start.min){
            --start.hr;
            start.min += 60;
        }

        diff.min = start.min - stop.min;
        diff.hr = start.hr - stop.hr;

        return(diff);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Q5 start = new Q5(10, 20, 35);
	    Q5 stop = new Q5(5, 15, 20);
	    Q5 diff;

	    diff = difference(start, stop);

	    System.out.printf("TIME DIFFERENCE is %d:%d:%d\n",diff.hr, diff.min, diff.sec);
	  
	}
	

	
	

}
