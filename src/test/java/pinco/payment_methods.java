package pinco;

public class payment_methods {

	private boolean cod;
	private boolean wallet;
	private boolean online;
	private boolean cashback;

	public boolean isCod() {
		return cod;
	}
	public void setCod(boolean cod) {
		this.cod = cod;
	}
	public boolean isWallet() {
		return wallet;
	}
	public void setWallet(boolean wallet) {
		this.wallet = wallet;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public boolean isCashback() {
		return cashback;
	}
	public void setCashback(boolean cashback) {
		this.cashback = cashback;
	}
	
	
}
