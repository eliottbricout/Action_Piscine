package launcher;

import action.Swimmer;
import pool.BasketPool;
import pool.CubiclePool;
import scheduler.FairScheduler;

public class Pool {
	
	public static void main(String args[]){
		
		BasketPool baskets = new BasketPool(6);
		CubiclePool cubicles = new CubiclePool(3);
		FairScheduler s = new FairScheduler();
		
		s.addAction(new Swimmer("Lucas",baskets,cubicles,6,4,8));
		
		int nbSteps = 0;
		while(!s.isFinished()){
			s.doStep();
			nbSteps++;
		}
		System.out.println("Finished in " + nbSteps + " steps");
		
	}

}
