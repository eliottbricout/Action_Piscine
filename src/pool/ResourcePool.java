package pool;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import resource.Resource;

public abstract class ResourcePool<T extends Resource> {
	
	private List<T> freeResources;
	private List<T> occupiedResources;
	
	public ResourcePool(int nbResources){
		freeResources = new ArrayList<T>(nbResources);
		occupiedResources = new ArrayList<T>();
		for(int i=0;i<nbResources;i++){
			freeResources.add(createResource());
		}
	}
	
	public T provideResource(){
		if(freeResources.isEmpty()){
			throw new NoSuchElementException();
		}
		T resource = freeResources.get(0);
		occupiedResources.add(resource);
		freeResources.remove(resource);
		return resource;	
	}
	
	public void freeResource(T resource){
		if(!occupiedResources.contains(resource)){
			throw new IllegalArgumentException();
		}
		freeResources.add(resource);
		occupiedResources.remove(resource);
	}

	protected abstract T createResource();

}
