import java.io.File;
import java.io.IOException;

public class iodemo1{
    public static void main(String[] args) throws IOException {
        File file = new File("./15.png");
        System.out.println(file.getParent());//父路径
        System.out.println(file.getName());//文件名
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
    }
}
