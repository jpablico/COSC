import java.io.*;

public class printToFile {

    public static void main(String[] args) throws IOException {
        PrintWriter outfile = new PrintWriter("printToFile.txt");

	
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }
}