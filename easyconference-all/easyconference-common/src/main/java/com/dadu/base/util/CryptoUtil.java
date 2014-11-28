package com.dadu.base.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class CryptoUtil {

	public static String key = "airscandbencrypt";

	/**
	 * hex to byte[] : 16吏꾩닔 臾몄옄�댁쓣 諛붿씠��諛곗뿴濡�蹂�솚�쒕떎.
	 *
	 * @param hex    hex string
	 * @return
	 */
	public static byte[] hexToByteArray(String hex) {
		if (hex == null || hex.length() == 0) {
			return null;
		}
		byte[] ba = new byte[hex.length() / 2];
		for (int i = 0; i < ba.length; i++) {
			ba[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
		}
		return ba;
	}
	/**
	 * byte[] to hex : unsigned byte(諛붿씠�� 諛곗뿴��16吏꾩닔 臾몄옄�대줈 諛붽씔��
	 *
	 * @param ba        byte[]
	 * @return
	 */
	public static String byteArrayToHex(byte[] ba) {
		if (ba == null || ba.length == 0) {
			return null;
		}
		StringBuffer sb = new StringBuffer(ba.length * 2);
		String hexNumber;
		for (int x = 0; x < ba.length; x++) {
			hexNumber = "0" + Integer.toHexString(0xff & ba[x]);
			sb.append(hexNumber.substring(hexNumber.length() - 2));
		}
		return sb.toString();
	}
	/**
	 * AES 諛⑹떇���뷀샇��
	 *
	 * @param message
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String message) throws Exception {
		// use key coss2
		SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), "AES");
		// Instantiate the cipher
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
		byte[] encrypted = cipher.doFinal(message.getBytes());
		return byteArrayToHex(encrypted);
	}
	/**
	 * AES 諛⑹떇��蹂듯샇��
	 *
	 * @param message
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String encrypted) throws Exception {
		// use key coss2
		SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, skeySpec);
		byte[] original = cipher.doFinal(hexToByteArray(encrypted));
		String originalString = new String(original);
		return originalString;
	}
}
