public class CreditPaymentService {

    public int calculate(double loanAmount, double interest, int loanTerm) {
        double monthlyInterest = interest / 12 / 100;
        int numberOfMonths = loanTerm * 12;

        double monthlyPayment = loanAmount * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfMonths))
                / (Math.pow(1 + monthlyInterest, numberOfMonths) - 1);
        int payment = (int) monthlyPayment;

        return payment;
    }
}