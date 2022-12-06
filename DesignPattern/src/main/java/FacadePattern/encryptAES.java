package FacadePattern;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


public class encryptAES {
    public static final String slatKey = "9B51BE373C236F20";//加密盐
    public static final String vectorKey  = "6A136D8E7E8EEE78";//加密向量
    /**
     * 
     * @param content:加密文本
     * @return 返回加密文本
     * @throws Exception
     */
    public static String encrypt(String content) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(slatKey.getBytes(), "AES");
        IvParameterSpec iv = new IvParameterSpec(vectorKey.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
        byte[] encrypted = cipher.doFinal(content.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    /**
     *
     * @param base64Content:待解密内容
     * @return 返回解密文本
     * @throws Exception
     */
    public static String decrypt(String base64Content) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(slatKey.getBytes(), "AES");
        IvParameterSpec iv = new IvParameterSpec(vectorKey.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);
        byte[] content = Base64.getDecoder().decode(base64Content);
        byte[] encrypted = cipher.doFinal(content);
        return new String(encrypted);
    }
    
}
