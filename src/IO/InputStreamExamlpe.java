package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @program: JavaExample
 * @description: inputStream的小练习
 * @author: huiyuhang  https://github.com/Boombaozi
 * @create: 2018-11
 **/
public class InputStreamExamlpe {

    public static void main(String[] args) throws Exception {

        File file = new File("G:\\file\\1.txt");

        InputStream fileInputStream = new FileInputStream(file);
        int i = 0;
        //跳过windows系统自动在txt文件首添加的三个byte
        fileInputStream.skip(3);

        while (true) {
            i = fileInputStream.read();
            if (i == -1) {
                break;
            }
            //txt文件的ASCII码,和其对应的字符
            System.out.print(i + ":" + (char) i + " ");
        }
    }
}
