package Unit13_InOutFilesDates;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Unit_13_3 {
    public static void main(String[] args) throws IOException {
        File file = new File("Unit15_CollectionsFramework/testFile.txt");
        File folder = new File("E:\\Steam");
        System.out.println("Размер папки: " + getFolderSize(folder)/1000000 + " Мегабайт");
        wordCountInFile(file);
        addDateOfRunning(file);

    }
    public static long getFolderSize(File folder){
        File[] files = folder.listFiles();
        long length = 0;
        int count = files.length;
        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            } else {
                length += getFolderSize(files[i]);
            }
        }
        return length;
    }
    public static void wordCountInFile(File file){
        int b = 0;
        String text = "";
        try {
            FileReader is = new FileReader(file);
            while ((b = is.read()) != -1) { // чтение
                text += (char)b;
            }
            is.close(); // закрытие потока ввода
        }
        catch (IOException e) {
            System.err.println("ошибка файла: " + e);
        }
        String[] words = text.split(" ");
        System.out.println("Колличество слов в файле: " + words.length);
    }
    public static void addDateOfRunning(File file) throws IOException {
        FileWriter fileDateRunning = new FileWriter(file, true);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd.MM.yyyy ");
        Calendar date = Calendar.getInstance();
        String dateOfRunning = sdf.format(date.getTime());
        fileDateRunning.write(dateOfRunning);
        fileDateRunning.write(10);
        fileDateRunning.close();
    }
}
