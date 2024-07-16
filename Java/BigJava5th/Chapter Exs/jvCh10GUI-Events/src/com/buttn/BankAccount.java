/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buttn;

/**
 *
 * @author Pana
 */
public class BankAccount {
        private double Balance;
        private double Rate;
        
        public BankAccount(double accBalance){
            this.Balance = accBalance;
            this.Rate = 0;
        }
        public BankAccount(double aBalance,double aRate){
            Balance = aBalance;
            Rate = aRate;
        }

        public double getBalance() {
            return Balance;
        }

        public void setBalance(double AccBalance) {
            this.Balance = AccBalance;
        }

        public double getRate() {
            return Rate;
        }

        public void setRate(double AccRate) {
            this.Rate = AccRate;
        }
        //a method that withdraws money from the account
        public double withAmount(double wAmount){
            return this.Balance -= wAmount;
        }
        //a method that deposits money into an account
        public double depoAmount(double dAmount){
            return this.Balance += dAmount;
        }
        
        
}
