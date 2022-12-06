package FacadePattern;

public class Main {
    public static void main(String[] args) {
    //验证外观模式
      EncryptFacade en=new EncryptFacade();
        try {
            en.fileEncrypt("src/main/java/FacadePattern/1.txt","src/main/java/FacadePattern/2.txt");
            en.fileDecode("src/main/java/FacadePattern/2.txt","src/main/java/FacadePattern/3.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
