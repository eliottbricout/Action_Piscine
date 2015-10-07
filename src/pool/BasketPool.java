package pool;

import resource.Basket;

public class BasketPool extends ResourcePool<Basket> {

	public BasketPool(int nbResources) {
		super(nbResources);
	}

	@Override
	protected Basket createResource() {
		return new Basket();
	}

}
