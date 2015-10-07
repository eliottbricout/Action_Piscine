package scheduler;

import java.util.ArrayList;
import java.util.List;

import action.Action;

public class FairScheduler extends Scheduler {
	
	private List<Action> actions;
	
	private int currentActionIndex;
	
	public FairScheduler(){
		actions = new ArrayList<Action>();
		currentActionIndex = -1;
	}

	@Override
	public void addAction(Action action) {
		actions.add(action);
	}

	@Override
	public Action nextAction() {
		if(actions.isEmpty()){
			return null;
		}
		currentActionIndex = (currentActionIndex+1)%actions.size();
		Action action = actions.get(currentActionIndex);
		if(action.isFinished()){
			actions.remove(action);
			return nextAction();
		}
		return action;
	}

}
