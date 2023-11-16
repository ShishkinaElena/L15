package dz14;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        int a;
        System.out.println("Copy png file");
        try{
            FileInputStream fileInputStream = new FileInputStream("1.png"); //поток ввода
            FileOutputStream fileOutputStream = new FileOutputStream("2.png");

            a = fileInputStream.read();  // считываем первый файл из файла, далее делаем цикл
            while (a!=-1){
                fileOutputStream.write(a);
                a = fileInputStream.read();
            }
            fileOutputStream.close();  // закрытие потока
            fileInputStream.close();
            System.out.println("File is copied");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}