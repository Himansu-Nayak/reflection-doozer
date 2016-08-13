package com.org.dozer.type4;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.org.dozer.type4.dest.Person1;
import com.org.dozer.type4.src.MyPerson;

/**
 * The Class TestFlatBean2Nested is used as a test class to copy from Flat type
 * bean to a Bean of nested objects
 */
public class TestFlatBean2Nested {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String...args) {
		List<String> list = new ArrayList<>();
		list.add("flat2NestedBeanMapping.xml");

		Mapper mapper = new DozerBeanMapper(list);

		MyPerson p = new MyPerson();
		p.setAge(333);
		p.setName("XX");
		p.setDoorNo(13);
		p.setStName("street11");
		p.setCname("India");
		p.setCcode("111");
		p.setFd(23.45f);

		Person1 p1 = new Person1();
		mapper.map(p, p1, "a");

		System.out.println(p1.getAge1());
		System.out.println(p1.getName1());
		System.out.println(p1.getAdrs1().getDoorNo1());
		System.out.println(p1.getAdrs1().getStName1());
		System.out.println(p1.getAdrs1().getCountry().getName());
		System.out.println(p1.getAdrs1().getCountry().getCode());
		System.out.println(p1.getAdrs1().getCountry().getBd());
	}

}
