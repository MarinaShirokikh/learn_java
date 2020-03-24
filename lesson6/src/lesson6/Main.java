package lesson6;

import java.io.*;

/*
1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).
4. ** Написать метод, проверяющий, есть ли указанное слово в папке (google file).
* */
public class Main {

    public static void main(String[] args) throws IOException {
        try{
            byte[] text1 = ("The three little pigs are brothers.\nThey are going into the forest.\nThey want to build three houses.\n").getBytes();
            byte[] text2 = ("Let’s build our houses here,\nsays the first little pig, Percy. \nYes, says the second little pig, Peter. \nThat’s a good idea,\nsays the third little pig, Patrick.\n").getBytes();
            OutputStream outputStream = new FileOutputStream("file1.txt");
            outputStream.write(text1);
            outputStream.close();

            outputStream = new FileOutputStream("file2.txt");
            outputStream.write(text2);
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

//v2 use metod
        ReadAndWriteFile("file1.txt", "fileFairyTale.txt");
        ReadAndWriteFile("file2.txt", "fileFairyTale.txt");


    }

    public static void ReadAndWriteFile(String nameOriginalFile, String nameNewFile) throws IOException {
        try {
            FileInputStream fairy = new FileInputStream(nameOriginalFile);
            int b;
            char t;
            OutputStream outputStream = new FileOutputStream(nameNewFile, true);
            while ((b = fairy.read()) != -1) {
                t = (char)b;
                outputStream.write(t);
            }
            fairy.close();
            outputStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}

//v1
  /*          FileInputStream fairy = new FileInputStream("file1.txt");
            int b;
            char t;
            out = new FileOutputStream("fileFairyTale.txt", true);
            while ((b = fairy.read()) != -1){
                t = (char)b;
                out.write(t);
            }
            fairy.close();

            FileInputStream fairy2 = new FileInputStream("file2.txt");
            while ((b = fairy2.read()) != -1){
                t = (char)b;
                out.write(t);
            }
            fairy2.close();
            out.close();
*/
