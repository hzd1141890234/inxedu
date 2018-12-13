package com.demo.util;

import org.apache.commons.codec.digest.DigestUtils;
import java.security.MessageDigest;
public class md5Utils {
	 /**
     * MD5����
     * 
     * @param text ����
     * @param key ��Կ
     * @return ����
     * @throws Exception
     */
    public static String md5(String text, String key) throws Exception {
        //���ܺ���ַ���
        String encodeStr=DigestUtils.md5Hex(text + key);
        System.out.println("MD5���ܺ���ַ���Ϊ:encodeStr="+encodeStr);
        return encodeStr;
        }

    /**
     * MD5��֤����
     * 
     * @param text ����
     * @param key ��Կ
     * @param md5 ����
     * @return true/false
     * @throws Exception
     */
    public static boolean verify(String text, String key, String md5) throws Exception {
        //���ݴ������Կ������֤
        String md5Text = md5(text, key);
        if(md5Text.equalsIgnoreCase(md5))
        {
            System.out.println("MD5��֤ͨ��");
            return true;
        }

            return false;
    }

	
	
}
