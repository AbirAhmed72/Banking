package banking;

public class Rocket extends Account{

    public Rocket(String name, String account_phone_number, String pin) {
        super(name, account_phone_number, pin);
        this.setCashOutCharge(10);
    }

    //test override
    public void systemName() {
        System.out.println("\nThis is Rocket banking.");
    }

}