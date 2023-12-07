package org.comit.galaxysandbox.bean;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name="loans") //Database table is loans
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //MYSQL will generator ID keys
	@Column(name = "LOAN_NUM")
	private Integer loanNum;
	private String loanRegion;
	private String loanType;
	private String loanStatus;
	private Date studyEndDate;
	private Date repaymentStartDate;
	private int loanTerm;
	private Date firstPaymentDueDate;
	private Date paymentDueDate;
	private double currentPriniciple;
	private double intRate;
	private double totalOwing;
	private double mpa;
	private String paymentMethod;
	
	@ManyToOne(optional = false) //Cannot have loan without a borrower assigned
	private Borrower borrower;

	public Borrower getBorrower() {
		return borrower;
	}
	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
	public Integer getLoanNum() {
		return loanNum;
	}
	public void setLoanNum(Integer loanNum) {
		this.loanNum = loanNum;
	}
	public String getLoanRegion() {
		return loanRegion;
	}
	public void setLoanRegion(String loanRegion) {
		this.loanRegion = loanRegion;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public Date getStudyEndDate() {
		return studyEndDate;
	}
	public void setStudyEndDate(Date studyEndDate) {
		this.studyEndDate = studyEndDate;
	}
	public Date getRepaymentStartDate() {
		return repaymentStartDate;
	}
	public void setRepaymentStartDate(Date repaymentStartDate) {
		this.repaymentStartDate = repaymentStartDate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	public Date getFirstPaymentDueDate() {
		return firstPaymentDueDate;
	}
	public void setFirstPaymentDueDate(Date firstPaymentDueDate) {
		this.firstPaymentDueDate = firstPaymentDueDate;
	}
	public Date getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}
	public double getCurrentPriniciple() {
		return currentPriniciple;
	}
	public void setCurrentPriniciple(double currentPriniciple) {
		this.currentPriniciple = currentPriniciple;
	}
	public double getIntRate() {
		return intRate;
	}
	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}
	public double getTotalOwing() {
		return totalOwing;
	}
	public void setTotalOwing(double totalOwing) {
		this.totalOwing = totalOwing;
	}
	public double getMpa() {
		return mpa;
	}
	public void setMpa(double mpa) {
		this.mpa = mpa;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
}
