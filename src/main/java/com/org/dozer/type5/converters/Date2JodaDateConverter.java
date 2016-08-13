package com.org.dozer.type5.converters;

import org.dozer.CustomConverter;
import org.dozer.MappingException;
import org.joda.time.LocalDate;

/**
 * The Class Date2JodaDateConverter is used as a Dozer custom converter for
 * converting java.util.Date to Jodatime LocalDate.
 */
public class Date2JodaDateConverter implements CustomConverter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.dozer.CustomConverter#convert(java.lang.Object,
	 * java.lang.Object, java.lang.Class, java.lang.Class)
	 */
	public Object convert(Object existingDestinationFieldValue,
			Object sourceFieldValue,
			@SuppressWarnings("rawtypes") Class destinationClass,
			@SuppressWarnings("rawtypes") Class sourceClass) {
		if (sourceFieldValue == null) {
			return null;
		}

		if (sourceFieldValue instanceof java.util.Date) {
			java.util.Date utilDate = (java.util.Date) sourceFieldValue;
			LocalDate localDate = new LocalDate(utilDate.getTime());
			return localDate;
		}
		throw new MappingException("Misconfigured/unsupported mapping");
	}

}