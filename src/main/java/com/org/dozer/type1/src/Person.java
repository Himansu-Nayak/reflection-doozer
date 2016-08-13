package com.org.dozer.type1.src;

/**
 * The Class Person is used as a source bean for Person which contains Address
 * object.
 */
public class Person {

	/** The name. */
	private String name;

	/** The age. */
	private int age;

	/** The adrs. */
	private Address adrs;

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age.
	 * 
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 * 
	 * @param age
	 *            the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets the adrs.
	 * 
	 * @return the adrs
	 */
	public Address getAdrs() {
		return adrs;
	}

	/**
	 * Sets the adrs.
	 * 
	 * @param adrs
	 *            the new adrs
	 */
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

}
