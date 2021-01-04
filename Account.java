package banking;

public class Account {
    private String account_holder_name;
    private String account_phone_number;
    private double balance;
    private String pin;

//    constructor
//    is a function having same name as class
//    always public function
//    no return type
//    can accept multiple agruments as function parameters

//    Constructor having pin, name, phone_number  arguments <String, String, String>
    public Account(String name, String account_phone_number, String pin){
        this.account_holder_name = name;
        this.account_phone_number = account_phone_number;
        this.pin = pin;
    }

//    Constructor without pin number  arguments <String, String>
  /*  public Account(String name, String account_pnone_number){
        this.account_holder_name = name;
        this.account_pnone_number = account_pnone_number;
    }
    */

//    Method overloading  []
//    Polymorphism

//    update pin; return true if success or return false if failed
    public boolean pin_update(String old_pin, String new_pin){
        if(old_pin == this.pin){
            this.pin = new_pin;
            System.out.println("Pin updated. " + pin_print());
            return true;
        }
        else{
            System.out.println("Old pin does not match. Pin update failed. " + pin_print());
            return false;
        }
    }

    private String pin_print(){
        String new_pin_info = getAccount_holder_name()+ ", Pin: " + this.pin;
        return new_pin_info;
    }

    public void add_money(double amount){
        this.balance += amount;
        System.out.println("Add money: " + amount);
    }

    public void cash_out(double amount, String pin){
        if (pin != this.pin){
            System.out.println("Pin does not match");
            return;
        }
        else{
            if (balance >= amount){
                balance -= amount;
                System.out.println("Cash out: " + amount);
            }

            else {
                System.out.println("Failed to cash out due to balance limit");
            }
        }
    }

    @Override
    public String toString() {
        return "Account { " +
                "Account Holder Name= " + account_holder_name  +
                ", Pnone Number= " + account_phone_number + ", Balance= " + balance + "}";
    }

    public String getAccount_holder_name(){
        return this.account_holder_name;
    }

    protected String getAccount_phone_number(){
        return this.account_phone_number;
    }

    public double getBalance(){
        return this.balance;
    }

}
