package com.org.dozer.type1;

import java.util.ArrayList;
import java.util.List;

import com.org.dozer.type1.dest.Person1;
import com.org.dozer.type1.src.Address;
import com.org.dozer.type1.src.Person;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

/**
 * The Class TestBeanMappingType1 is used as a test class for copying simple
 * types beans
 */
public class TestBeanMappingType1 {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String...args) {
		List<String> list = new ArrayList<>();
		// Add the mapping configuration
		list.add("dozerMapping.xml");
		// Add to DozerMapper
		Mapper mapper = new DozerBeanMapper(list);
		// Form the source object
		Person p = new Person();
		p.setAge(333);
		p.setName("XX");
		Address adrs = new Address();
		adrs.setDoorNo(13);
		adrs.setStName("street11");
		p.setAdrs(adrs);
		Person1 p1 = new Person1();// Destination Object
		// Copy the bean from source to destination
		mapper.map(p, p1, "a");
		// Check the destination bean
		System.out.println("Age : " + p1.getAge1());
		System.out.println("Door No : " + p1.getAdrs1().getDoorNo1());
		System.out.println("Street Name : " + p1.getAdrs1().getStName1());

	}

}
