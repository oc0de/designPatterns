package state;

public class NoCash implements ATMState{
	
	ATMMachine atmMachine;
	
	public NoCash(ATMMachine newATMMachine) {
		atmMachine = newATMMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Out of service");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("Out of service");
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("Out of service");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("Out of service");
		
	}
}
