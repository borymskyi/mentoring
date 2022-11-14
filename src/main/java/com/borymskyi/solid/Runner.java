package com.borymskyi.solid;

import com.borymskyi.solid.bad2.BadAccount;
import com.borymskyi.solid.bad2.BadDepositAccount;
import com.borymskyi.solid.bad2.BadSalaryAccount;
import com.borymskyi.solid.bad2.BadBank;
import com.borymskyi.solid.good2.*;

import java.math.BigDecimal;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Runner {
    public static void main(String[] args) {
//        CarCompany carCompany = new CarCompany();
//
//        CarInfoService carInfoService = new CarInfoService();
//        RentCarService rentCarService = new RentCarService();
//        PrinterService printerService = new PrinterService();
//
//        carInfoService.getCarInterestInfo(carCompany, CarType.VAN);
//        Order order = rentCarService.orderCar(carCompany, "1", new Client(1L, "Dmytrii", "Borymskyi"));
//        printerService.printOrder(carCompany, order);

//        BadRentCarService rentCarService = new BadRentCarService();
//        rentCarService.getCarInterestInfo(CarType.VAN);
//
//        Order order = rentCarService.orderCar("1", new Client(1L, "Dmytrii", "Borymskyi"));
//        rentCarService.printOrder(order);
// -----------------------------------------
//        BadBank bank = new BadBank();
//        bank.createSomeAccountBalance();
//        BadAccount badAccount = new BadAccount();
//        BadSalaryAccount badSalaryAccount = new BadSalaryAccount();
//        BadDepositAccount badDepositAccount = new BadDepositAccount();
//
//
//        badDepositAccount.refill(bank, "4444-1111", new BigDecimal("500.00"));
//        System.out.println(badDepositAccount.balance(bank, "4444-1111"));
//        badDepositAccount.payment(bank, "4444-1111", new BigDecimal("250.00"));

        //----------------------------------

        Bank bank = new Bank();
        bank.createSomeAccountBalance();

        Account account = new Account();
        DepositAccount depositAccount = new DepositAccount();
        PaymentAccount paymentAccount = new PaymentAccount();
        SalaryAccount salaryAccount = new SalaryAccount();

        depositAccount.refill(bank, "4444-1111", new BigDecimal("500.00"));
        System.out.println(depositAccount.balance(bank, "4444-1111"));
        salaryAccount.payment(bank, "4444-1111", new BigDecimal("250.00"));


    }
}
