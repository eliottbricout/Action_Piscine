package pool;

import resource.Cubicle;

public class CubiclePool extends ResourcePool<Cubicle> {

	public CubiclePool(int nbResources) {
		super(nbResources);
	}

	@Override
	protected Cubicle createResource() {
		return new Cubicle();
	}

}
