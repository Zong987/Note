package com.zong.note.utils;

import java.security.MessageDigest;

public class EncodeUtil {

	public static String encode(String code) {
		String str = "helloJava";  //�n�[�K���r��
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String result = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("UTF-8"));
            //Hash�p��, ����128�쪺�����
            byte[] bytes = messageDigest.digest();
            StringBuffer sb = new StringBuffer(bytes.length * 2);
            for(Byte b : bytes){
                //�k���|��, ���r�`���e�|���ഫ
                sb.append(hexDigits[(b >> 4) & 0x0f]);
                //���r�`����|���ഫ
                sb.append(hexDigits[b & 0x0f]); 
            }
            result = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
	}
}
