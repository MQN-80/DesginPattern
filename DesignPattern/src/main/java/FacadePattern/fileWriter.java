package FacadePattern;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileWriter {
    public void write(String text,String fileName) {
        System.out.println("写入文件。");
        try {
            FileOutputStream outFS = new FileOutputStream(fileName);
            outFS.write(text.getBytes());
            outFS.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
    }
}
