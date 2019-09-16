package com.isn.object.props;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.isn.object.model.Employee;

public class ObjectProperties {

	public static void main(String[] args) {
		
		ObjectProperties objectProperties = new ObjectProperties();
		Employee emp1 = new Employee("123","venkat","xyz@gmail.com","xyz");
		Employee emp2 = new Employee("124","venkats","xyz1@gmail.com","xyz");
		
		Map<String, Object> serviceOneResProperties = objectProperties.getNonNullProperties(emp1);
		Map<String, Object> serviceTwoResProperties = objectProperties.getNonNullProperties(emp2);
		
		for (Entry<String, Object> propertyEntry : serviceOneResProperties.entrySet()) {
			if (!propertyEntry.getValue().equals(serviceTwoResProperties.get(propertyEntry.getKey()))) {
				System.out.println("Mismatch value for property # "+propertyEntry.getKey()+""
						+ " # Service One value : "+propertyEntry.getValue()+" ###  "
								+ "Service Two value : "+serviceTwoResProperties.get(propertyEntry.getKey()));
			}
			
			
		}
	}
	
	public Map<String, Object> getNonNullProperties(final Object responseObject) {	
	    final Map<String, Object> nonNullProperties = new TreeMap<String, Object>();
	    try {
	        final BeanInfo beanInfo = Introspector.getBeanInfo(responseObject
	                .getClass());
	        for (final PropertyDescriptor descriptor : beanInfo
	                .getPropertyDescriptors()) {
	            final Object propertyValue = descriptor.getReadMethod()
	                        .invoke(responseObject);
	                if (propertyValue != null) {
	                    nonNullProperties.put(descriptor.getName(),
	                            propertyValue);
	                }
	            
	        }
	    } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException |IntrospectionException e) {
	        // do something sensible here
	    }
	    return nonNullProperties;
	}

}
