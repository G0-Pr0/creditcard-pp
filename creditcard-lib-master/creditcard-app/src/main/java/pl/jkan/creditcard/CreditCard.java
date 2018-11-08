package pl.jkan.creditcard;

class CreditCard {
    
    private boolean blockade = false;
    
    public void assignLimit(double money) {
        
    }
    
    public double getLimit() {
        return 2000;
    }
    
    public void block() {
        this.blockade = true;
    }
    
    public boolean isBlocked() {
        return this.blockade;
    }
    
    public void pay(double cash){
	    this.balance+=cash
	}
	
    public void repay(){
	    if(balance<0){balance=0;}
	}
}
