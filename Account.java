package banking;

public class Account {

    public String account_holder_name;
    public String account_phone_number;
    public double balance;
    public String pin;
    public double cashOutCharge;

    public Account(String name, String account_phone_number, String pin) {
        this.account_holder_name = name;
        this.account_phone_number = account_phone_number;
        this.pin = pin;
    }

    public boolean pin_update(String old_pin, String new_pin) {
        if (old_pin == this.pin) {
            this.pin = new_pin;
            System.out.println("Pin updated. " + pin_print());
            return true;
        } else {
            System.out.println("Old pin does not match. Pin update failed. " + pin_print());
            return false;
        }
    }

    public String pin_print() {
        String new_pin_info = " Pin: " + this.pin;
        return new_pin_info;
    }

    public void setCashOutCharge(double cashOutCharge) {
        this.cashOutCharge = cashOutCharge;

    }


    public void add_money(double amount) {
        this.balance += amount;
        System.out.println("Add money: " + amount);
    }

    public void cash_out(double amount, String pin) {
        if (pin != this.pin) {
            System.out.println("Pin does not match");
            return;
        } else {
            if (balance >= amount) {
                balance = amount - balance * this.cashOutCharge/100;
                System.out.println("Cash out: " + amount);
            } else {
                System.out.println("Failed to cash out due to balance limit");
            }
        }
    }

    //show account information
    public String showBalance() {
        return "->"+this.account_holder_name+" Phone No:"+ this.account_phone_number+ " Balance:"+ this.balance;
    }

    //test override
    public void systemName() {
        System.out.println("This is Account system");
    }

}
