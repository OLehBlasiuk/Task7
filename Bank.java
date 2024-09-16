public class Bank {

    public String User;
    public String Account;
    public double Count;
    public String Currency;

    public static  void transferMone(String user1, String Account1, double Count1, String Currency1, String user2, String Account2, double Count2, String Currency2) {


        if (!Currency1.equals(Currency2)) {
            if (Currency2.equals("UAH")) {
                Count2 = exchangeUAHToUSD(Count2, "UAH");
                Currency2 = "USD";
            } else if (Currency1.equals("UAH")) {
                Count1 = exchangeUAHToUSD(Count1, "UAH");
                Currency1 = "USD";
            }
        }
        if (user1.equals(user2)) {
            if (Account1.equals(Account2)) {

                Count1 += Count2;
                Count2 = 0;

            } else {
                Count1 += Count2 * 0.98;
                Count2 = 0;
            }


        } else if (Account1.equals(Account2)) {

            Count1 += Count2 * 0.97;
            Count2 = 0;
        } else {
            Count1 += Count2 * 0.94;
            Count2 = 0;
        }
        System.out.println(user1 + " " + Account1 + ":" + Count1+" (" + Currency1 + "): ");
        System.out.println(user2 + " " + Account2 + " " + Count2+" (" + Currency2 + "): ");


    }

    Bank(String user, String account, double count, String currency) {
        this.User = user;
        this.Account = account;
        this.Count = count;
        this.Currency = currency;
    }

    private static  double exchangeUAHToUSD(double amount, String currency) {
        if (currency.equals("UAH")) {
            return amount / 40.2; // курс гривні до долара
        }
        return amount; // якщо валюта не UAH, залишаємо суму без змін
    }}

