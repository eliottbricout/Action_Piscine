package scheduler;

import java.util.List;

import action.Action;

public class SequentialScheduler extends Scheduler {
	
	private List<Action> actions;

	@Override
	public void addAction(Action action) {
		actions.add(action);
	}

	@Override
	public Action nextAction() {
		if(actions.isEmpty()){
			return null;
		}
		Action action = actions.get(0);
		if(action.isFinished()){
			actions.remove(0);
			return nextAction();
		}
		return action;
	}

}
