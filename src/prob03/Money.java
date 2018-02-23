package prob03;

public class Money {

	private int amount;

	public Money(int amount) {
		this.amount = amount;
	}
    
	public Money add(Money m) {
		int result = this.amount + m.amount;
		Money money = new Money(result);
		return money;
	}
	public Money minus(Money m) {
		int result = this.amount - m.amount;
		Money money = new Money(result);
		return money;
	}
	public Money multiply(Money m) {
		int result = this.amount * m.amount;
		Money money = new Money(result);
		return money;
	}
	public Money devide(Money m) {
		int result = this.amount / m.amount;
		Money money = new Money(result);
		return money;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
    
}
