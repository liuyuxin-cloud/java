import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

// 调用PrintWriter的构造方法可能会抛出某种I/O异常，Java强制编写代码处理这类异常
// 为了简单起见，只要在方法头中声明 throws Exception 即可

public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) { // 检查scores.txt是否存在
            System.out.println("File already exists");
            System.exit(1); // 如果存在则退出程序
        }
        // 如果不存在则创建一个新文件
        try (PrintWriter output = new PrintWriter(file);) {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
            // 若没有try-with-resources结构则必须使用 close() 关闭文件，否则数据就不能正常地保存在文件中
            // output.close();
        }
    }
}
