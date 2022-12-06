package FacadePattern;

public class EncryptFacade {
    private FileReader reader;
    private fileWriter writer;
    private encryptAES encrypt;
    public EncryptFacade(){
        reader=new FileReader();
        writer=new fileWriter();
        encrypt=new encryptAES();
    }
    public void fileEncrypt(String fileNameSrc, String fileNameDes) throws Exception {
        System.out.println("正在加密");
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = encrypt.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
    public void fileDecode(String fileNameSrc, String fileNameDes) throws Exception {
        System.out.println("正在解密");
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = encrypt.decrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
