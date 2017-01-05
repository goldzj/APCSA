
//Name - Zachary Gold
//Date - 9/21/16
//Class - AP Comp Sci A Period 2
//Lab  - Loop Stats

import static java.lang.System.*;

public class LoopStatsRunner
{
	public static void main ( String[] args )
	{
		LoopStats go = new LoopStats();
		go.loopStats(1,5);
		go.loopStatsGo();
		go.setNums(2,8);
		go.loopStatsGo();
		go.setNums(5,15);
		go.loopStatsGo();
	}
}