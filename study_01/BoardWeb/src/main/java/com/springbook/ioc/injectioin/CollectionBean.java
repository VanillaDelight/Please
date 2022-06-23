package com.springbook.ioc.injectioin;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	private List<String> addressList;
	private Set<String> addressSet;
	private Map<String, String> addressMap;
	private Properties addressProperties;

	public CollectionBean() {
		System.out.println("CollectionBean");
	}

	public List<String> getAddressList() {
		return addressList;
	}

	public Set<String> getAddressSet() {
		return addressSet;
	}

	public Map<String, String> getAddressMap() {
		return addressMap;
	}

	public Properties getAddressProperties() {
		return addressProperties;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}

	public void setAddressProperties(Properties addressProperties) {
		this.addressProperties = addressProperties;
	}
}
