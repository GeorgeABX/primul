import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Facultate\\PP\\lab1\\lab1_pb2\\exemplu.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        while ((s = br.readLine()) != null)
            System.out.println(s);
    }
}
