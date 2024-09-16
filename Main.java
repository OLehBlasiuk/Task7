public class Main {
    public static void main(String[] args){
        BankAccount mono1 = new BankAccount("Leo", "MonoBank", 2005, "USD");
        BankAccount mono2 = new BankAccount("Leo", "MonoBank", 2125, "UAH");
        BankAccount mono3 = new BankAccount("Dorian", "MonoBank", 2400, "UAH");
        BankAccount priv1 = new BankAccount("Dorian", "Privat24", 2600, "USD");
        BankAccount priv2 = new BankAccount("Leo", "Privat24", 1800, "UAH");

        Bank Mono1 = new Bank(mono1.user, mono1.account, mono1.balance, mono1.currency);
        Bank Mono2 = new Bank(mono2.user, mono2.account, mono2.balance, mono2.currency);
        Bank Mono3 = new Bank(mono3.user, mono3.account, mono3.balance, mono3.currency);
        Bank Priv1 = new Bank(priv1.user, priv1.account, priv1.balance, priv1.currency);
        Bank Priv2 = new Bank(priv2.user , priv2.account , priv2.balance , priv2.currency );

        Bank.transferMone(Mono2.User,Mono2.Account,Mono2.Count,Mono2.Currency, Mono1.User, Mono1.Account, Mono1.Count,Mono1.Currency );
        Bank.transferMone(Mono3.User,Mono3.Account,Mono3.Count,Mono3.Currency, Mono1.User, Mono1.Account, Mono1.Count ,Mono1.Currency);
        Bank.transferMone(Priv1.User,Priv1.Account,Priv1.Count,Priv1.Currency, Mono1.User, Mono1.Account, Mono1.Count, Mono1.Currency);
        Bank.transferMone(Priv2.User,Priv2.Account,Priv2.Count ,Priv2.Currency, Mono1.User, Mono1.Account, Mono1.Count, Mono1.Currency);
    }}









