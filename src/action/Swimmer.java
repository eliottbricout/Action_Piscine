package action;

import pool.BasketPool;
import pool.CubiclePool;

public class Swimmer implements Action {
	
	private BasketPool basketPool;
	
	private CubiclePool cubiclePool;
	
	private int undressingTime;
	
	private int swimmingTime;
	
	private int dressingTime;

	public Swimmer(String string, BasketPool baskets, CubiclePool cubicles, int undressingTime, int swimmingTime, int dressingTime) {
		this.basketPool = baskets;
		this.cubiclePool = cubicles;
		this.undressingTime = undressingTime;
		this.swimmingTime = swimmingTime;
		this.dressingTime = dressingTime;
	}

	@Override
	public boolean isReady() {
		return false;
	}

	@Override
	public boolean isInProgress() {
		return false;
	}

	@Override
	public boolean isFinished() {
		return false;
	}

	@Override
	public void doStep() {
		
	}

}
