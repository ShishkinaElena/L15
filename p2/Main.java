package p2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Main { public static void main(String[] args) {
    String text = "Hello all!!!!";
    try(FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
        PrintStream stream = new PrintStream(fileOutputStream); // класс PrintStream для вывода информации. В параметры отдаем (fileOutputStream)
    ){
        stream.println(text);
        System.out.println("DONE");
    }catch (IOException exception){
        exception.printStackTrace();
    }
    // второй способ записи информации в файл
    try(PrintStream stream = new PrintStream("d.txt")){
        stream.print("HELLO");   // print метод для вывода информации
        stream.println("_HELLO");
        stream.printf("Info: %s \n", "Alex");
        String mess = "PStream";
        byte[] messBytes = mess.getBytes(); // создаём массив байт
        stream.write(messBytes);  // метод write в него передаем массив

        System.out.println("DONE");
    }catch (IOException exception){
        exception.printStackTrace();
    }
    // вывод в консоль
    try(PrintWriter printWriter = new PrintWriter(System.out)){
        printWriter.println("Test");
    }
}
}
