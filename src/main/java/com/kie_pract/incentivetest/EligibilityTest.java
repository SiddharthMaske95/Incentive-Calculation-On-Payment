package com.kie_pract.incentivetest;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class EligibilityTest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Boolean incentiveEligible;
	private double primarySalesPersonCTC;
	private double projectPrice;

	public EligibilityTest() {
	}

	public java.lang.Boolean getIncentiveEligible() {
		return this.incentiveEligible;
	}

	public void setIncentiveEligible(java.lang.Boolean incentiveEligible) {
		this.incentiveEligible = incentiveEligible;
	}

	public double getPrimarySalesPersonCTC() {
		return this.primarySalesPersonCTC;
	}

	public void setPrimarySalesPersonCTC(double primarySalesPersonCTC) {
		this.primarySalesPersonCTC = primarySalesPersonCTC;
	}

	public double getProjectPrice() {
		return this.projectPrice;
	}

	public void setProjectPrice(double projectPrice) {
		this.projectPrice = projectPrice;
	}

	public EligibilityTest(java.lang.Boolean incentiveEligible,
			double primarySalesPersonCTC, double projectPrice) {
		this.incentiveEligible = incentiveEligible;
		this.primarySalesPersonCTC = primarySalesPersonCTC;
		this.projectPrice = projectPrice;
	}

}