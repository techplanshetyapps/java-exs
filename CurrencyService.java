public class CurrencyService {
    CurrencyConverter cc = new CurrencyConverter();

    double computeTransferAmount(int countryIndex, double amount) {
        return cc.computeTransferAmount(countryIndex, amount);
    }

    double computeTransferFee(int countryIndex, double amount) {
        double transferAmount = computeTransferAmount(countryIndex, amount);
        return transferAmount * 0.02;
    }

}