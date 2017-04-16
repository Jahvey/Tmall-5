package util;

import java.io.UnsupportedEncodingException;

public class StringUtil {
	/**
	 * ���ַ���תΪutf-8��ʽ������
	 * @param str
	 * @return
	 */
	public static String ToCN(String str) {
		if (str == null)
			return str;
		try {
			return new String(str.getBytes("iso8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			return str;
			//e.printStackTrace();
		}
	}

}
