package com.dadu.base.datasource;

import org.apache.commons.dbcp.BasicDataSource;

import com.dadu.base.util.CryptoUtil;

public class BasicDataSoruceExt extends BasicDataSource{

	@Override
	public void setPassword(String password) {
		
		try {
			super.setPassword(CryptoUtil.decrypt(password));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
