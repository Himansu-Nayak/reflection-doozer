package com.org.dozer.type5.converters;

import org.dozer.CustomConverter;

/**
 * The Class Double2BigDecimalConverter is used as a custom Dozer converter for
 * double to BigDecimal.
 */
public class Double2BigDecimalConverter implements CustomConverter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.dozer.CustomConverter#convert(java.lang.Object,
	 * java.lang.Object, java.lang.Class, java.lang.Class)
	 */
	public Object convert(Object existingDestinationFieldValue,
			Object sourceFieldValue, Class<?> arg2, Class<?> arg3) {
		System.out.println("Source Field Value :::" + sourceFieldValue);
		return null;
	}
}
