package scheduler;

import action.Action;

public abstract class Scheduler implements Action{
	
	private boolean ready = true;
	
	private boolean finished = false;
	
	private Action currentAction;
	
	@Override
	public void doStep() {
		if(finished){
			return;
		}
		ready = false;
		currentAction.doStep();
		currentAction = nextAction();
		if(currentAction == null){
			finished = true;
		}
	}
	
	@Override
	public boolean isReady(){
		return ready;
	}
	
	@Override
	public boolean isInProgress(){
		return !ready && !finished;
	}
	
	@Override
	public boolean isFinished(){
		return finished;
	}
	
	public abstract void addAction(Action action);
	
	public abstract Action nextAction();

}
