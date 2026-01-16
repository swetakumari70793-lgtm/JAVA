// Data Abstraction Example.....
class ATMMachine
{
    public void Enter_Card()
    {
        System.out.println("Card Varification...");
    }
    public void Enter_pin()
    {
        System.out.println("Pin Varification...");
    }
    public void Cash_withdrawal()
    {
        System.out.println("To withdraw cash from ATM...");
    }
    public void Validate_withdraw_amount()
    {
        System.out.println("Validate the amount to be withdraw");
    }
    public void Update_amount()
    {
        System.out.println("Update the amount after withdraw");
    }
    public void Cash_deposite()
    {
        System.out.println("Deposite the cash from ATM");
    }
    public void Mini_statement()
    {
        System.out.println("Get the mini statement");
    }
}
class Maimmm
{
    public static void main (String[]args)
    {
         ATMMachine atm = new ATMMachine();
         atm.Enter_Card();
         atm.Enter_pin();
         atm.Cash_withdrawal();
         atm.Validate_withdraw_amount();
         atm.Update_amount();
         atm.Cash_deposite();
         atm.Mini_statement();
    }
}
