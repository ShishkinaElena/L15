package p5;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        // объединение BufferedReader и BufferedWriter
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("console.txt")) // записать в файл из консоли
        ){
            String text;
            while (!(text=reader.readLine()).equals("ESC")){ // текст будет до тех пор вводиться, пока не будет команды"ESC"
                writer.write(text + "\n");
                writer.flush();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

}
