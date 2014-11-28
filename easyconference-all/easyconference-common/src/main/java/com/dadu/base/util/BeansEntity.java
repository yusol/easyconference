package com.dadu.base.util;
 
import java.io.Serializable;
import java.lang.reflect.Field;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class BeansEntity implements Serializable, Cloneable  {

	public BeansEntity() {
		super();
	}
	/**
	 * Returns a String that represents the member variables of the sub class.
	 * @return a string representation of the receiver
	 */
	/*public String toString() {
		StringBuffer buf = new StringBuffer();
			
		Class c = this.getClass();
		String fullname = c.getName();
		String name = null;
		int index = fullname.lastIndexOf('.');
		if ( index == -1 ) name = fullname;
		else name = fullname.substring(index+1);
		buf.append(name).append(":{");
			
		Field[] fields = c.getFields();
		for (int i=0 ; i<fields.length; i++) {
			try {
				if ( i != 0 ) buf.append(',');
				buf.append(fields[i].getName()).append('=');
				Object f = fields[i].get(this);
				Class fc = fields[i].getType();
				if ( fc.isArray() ) {
					buf.append('[');
					int length = Array.getLength(f);
					for(int j=0; j<length ;j++){
						if ( j != 0 ) buf.append(',');
						Object element = Array.get(f, j);
						buf.append(element.toString());
					}
					buf.append(']');
				}
				else 	
					buf.append(f.toString());
			}
			catch(Exception e) {}
		}
		buf.append('}');
		return buf.toString();
	}*/
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
	/**
	 * name is a record name of xml string
	 * @param no
	 * @param name
	 * @return
	 */
	public String toXML(int no, String name) {
		StringBuffer buf = new StringBuffer();
		buf.append("<").append(name).append(" no=\"").append(no).append("\" ");

		Class c = this.getClass();
		Field[] fields = c.getFields();
		for (int i=0 ; i<fields.length; i++) {
			try {
				if ( i != 0 ) buf.append(' ');
				buf.append(fields[i].getName()).append("=\"");
				Object f = fields[i].get(this);
				buf.append(f.toString()).append("\" ");
			}
			catch(Exception e) {}
		}
		buf.append(" />");
		return buf.toString();
	}
}
