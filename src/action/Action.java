package action;

public interface Action {
	
	public boolean isReady();
	
	public boolean isInProgress();
	
	public boolean isFinished();
	
	public void doStep();

}
