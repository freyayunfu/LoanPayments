/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loanpayments;

import javax.swing.JOptionPane;

/**
 *
 * @author fuyun
 */
public class LoanPayments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic       
        String LoanAmountString = JOptionPane.showInputDialog(null,"Loan Amount","LoanPaymentsCalculation",JOptionPane.QUESTION_MESSAGE); 
        double LoanAmount = Double.parseDouble(LoanAmountString);
        //System.out.println(LoanAmountDouble);
        
        String monthlyInterestRateString = JOptionPane.showInputDialog(null,"Monthly Interest Rate","LoanPaymentsCalculation",JOptionPane.QUESTION_MESSAGE); 
        double monthlyInterestRate = Double.parseDouble(monthlyInterestRateString);
        
        String numberOfYearsString = JOptionPane.showInputDialog(null,"Number of Years","LoanPaymentsCalculation",JOptionPane.QUESTION_MESSAGE); 
        int numberOfYears = Integer.parseInt(numberOfYearsString);
        
        System.out.println(LoanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,numberOfYears * 12)));
    }
    
}
