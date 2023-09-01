public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        double loanAmount = 1_000_000;
        double interest = 9.99;
        int loanTerm1 = 1;
        int loanTerm2 = 2;
        int loanTerm3 = 3;

        int payment1 = creditPaymentService.calculate(loanAmount, interest, loanTerm1);
        int payment2 = creditPaymentService.calculate(loanAmount, interest, loanTerm2);
        int payment3 = creditPaymentService.calculate(loanAmount, interest, loanTerm3);


        System.out.println("Ежемесячный платеж: " + payment1 + " рублей");
        System.out.println();
        System.out.println("Ежемесячный платеж: " + payment2 + " рублей");
        System.out.println();
        System.out.println("Ежемесячный платеж: " + payment3 + " рублей");
    }
}