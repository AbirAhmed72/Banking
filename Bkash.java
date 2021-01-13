package banking;

public class Bkash extends Account{

    public Bkash(String name, String account_phone_number, String pin) {
        super(name, account_phone_number, pin);
        this.setCashOutCharge(6);

    }

    //test override
    public void systemName() {
        System.out.println("\nThis is Bkash banking.");
    }

}