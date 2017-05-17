package hbci4java;


import java.util.List;

import domain.BankAccess;
import domain.BankAccount;
import domain.Booking;

public interface OnlineBankingService {

    List<BankAccount> loadBankAccounts(BankAccess bankAccess, String pin);

    List<Booking> loadBookings(BankAccess bankAccess, BankAccount bankAccount, String pin);

}