package com.org.dozer.type2;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.org.dozer.type2.dest.AddressBean;
import com.org.dozer.type2.dest.AddressBeanList;
import com.org.dozer.type2.src.Address;
import com.org.dozer.type2.src.AddressList;

/**
 * The Class TestList2List is used as a test class to perform list to list copy.
 */
public class TestList2List {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String...args) {
		List<String> list = new ArrayList<>();
		list.add("list2ListMapping.xml");
		Mapper mapper = new DozerBeanMapper(list);

		// End of Mapping

		Address adrs = new Address();
		adrs.setId(11);
		adrs.setName("name1");

		Address adrs1 = new Address();
		adrs1.setId(22);
		adrs1.setName("name22");

		AddressList adrsList = new AddressList();

		List<Address> adList = new ArrayList<Address>();
		adList.add(adrs);
		adList.add(adrs1);

		adrsList.setAdrsList(adList);

		AddressBeanList destnAdrsBeanList = mapper.map(adrsList,
				AddressBeanList.class, "q1");
		List<AddressBean> adrsBeanList11 = destnAdrsBeanList.getAdrsList();

		for (AddressBean adBean : adrsBeanList11) {
			System.out.println("Id of AdressBean :: " + adBean.getId());
			System.out.println("Name of AdressBean :: " + adBean.getName());
		}

	}

}
