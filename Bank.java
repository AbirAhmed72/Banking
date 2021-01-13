package banking;

public class Bank {

    public void start_banking(){
        //Bkash

            Bkash bkash1 = new Bkash("Abir Ahmed", "01293123", "1229");
            bkash1.systemName();
            bkash1.add_money(5000);
            bkash1.cash_out(2000, "1229");
            System.out.println(bkash1.pin_print());
            System.out.println(bkash1.showBalance());

        //Nagad
            Nagad nagad1 = new Nagad("Abir Ahmed", "01293123", "1229");
            nagad1.systemName();
            nagad1.add_money(5000);
            nagad1.cash_out(2000, "1229");
            System.out.println(nagad1.pin_print());
            System.out.println(nagad1.showBalance());

        //Rocket
            Rocket rocket1 = new Rocket("Abir Ahmed", "01293123", "1229");
            rocket1.systemName();
            rocket1.add_money(5000);
            rocket1.cash_out(2000, "1229");
            System.out.println(rocket1.pin_print());
            System.out.println(rocket1.showBalance());
    }
}