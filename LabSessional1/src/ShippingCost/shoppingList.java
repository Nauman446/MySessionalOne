package ShippingCost;

public class shoppingList implements Container{
	public int listCategory[] = {1,2,3,4};

	@Override
	public shipmentCost getIterator() {
	// TODO Auto-generated method stub
	return null;
	}

	public class Item implements shipmentCost{
	public int itamId;
	public String itemName;
	public int weight;

	int index;

	@Override
	public boolean cost(){
	if(index < listCategory.length){
	return true;
	}
	return false;
	}

	@Override
	public Object Cart() {

	if(this.cost()){
	float total=0;
	while(index < listCategory.length)
	total=total + listCategory[index++];
	float totalCost;

	}
	return null;
	}	
	}
	}
