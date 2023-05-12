package com.kie_pract.incentivetest;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IncentiveTest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int incen;
	private java.lang.String incentTypes;
	private java.lang.String incentiveEligible;
	private int payment;

	private java.lang.String type_of;

	private float value;

	private java.lang.String based_on;

	private int CTC;

	private java.lang.String results;

	public IncentiveTest() {
	}

	public java.lang.String getIncentTypes() {
		return this.incentTypes;
	}

	public void setIncentTypes(java.lang.String incentTypes) {
		this.incentTypes = incentTypes;
	}

	public java.lang.String getIncentiveEligible() {
		return this.incentiveEligible;
	}

	public void setIncentiveEligible(java.lang.String incentiveEligible) {
		this.incentiveEligible = incentiveEligible;
	}

	public java.lang.String getType_of() {
		return this.type_of;
	}

	public void setType_of(java.lang.String type_of) {
		this.type_of = type_of;
	}

	public java.lang.String getBased_on() {
		return this.based_on;
	}

	public void setBased_on(java.lang.String based_on) {
		this.based_on = based_on;
	}

	public int getPayment() {
		return this.payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public int getCTC() {
		return this.CTC;
	}

	public void setCTC(int CTC) {
		this.CTC = CTC;
	}

	public int getIncen() {
		return this.incen;
	}

	public void setIncen(int incen) {
		this.incen = incen;
	}

	public java.lang.String getResults() {
		return this.results;
	}

	public void setResults(java.lang.String results) {
		this.results = results;
	}

	public float getValue() {
		return this.value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public IncentiveTest(int incen, java.lang.String incentTypes,
			java.lang.String incentiveEligible, int payment,
			java.lang.String type_of, float value, java.lang.String based_on,
			int CTC, java.lang.String results) {
		this.incen = incen;
		this.incentTypes = incentTypes;
		this.incentiveEligible = incentiveEligible;
		this.payment = payment;
		this.type_of = type_of;
		this.value = value;
		this.based_on = based_on;
		this.CTC = CTC;
		this.results = results;
	}

}