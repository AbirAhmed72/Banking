package banking;

public class Nagad extends Account{

    public Nagad(String name, String account_phone_number, String pin) {
        super(name, account_phone_number, pin);
        this.setCashOutCharge(8);

    }

    //test override
    public void systemName() {
        System.out.println("\nThis is Nagad banking");
    }

}