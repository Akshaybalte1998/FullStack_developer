package entity;

public enum ServicePlan {
	SILVER(1000) 
	,GOLD(2000)
	,DIAMOND(5000)
	,PLATINUM(10000);


	private int amount;

	ServicePlan(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
