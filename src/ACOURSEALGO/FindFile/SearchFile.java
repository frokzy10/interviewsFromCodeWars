package ACOURSEALGO.FindFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFile {
    public static void main(String[] args) {
        ArrayList<File> files = new ArrayList<File>();
        searchFiles(new File("/Users/nurdinbakytbekov/Desktop"), files);
        for (File file : files) {
            System.out.println("Нашел в: ");
            System.out.println(file.getAbsolutePath());
        }
    }

    private static void searchFiles(File file, List<File> fileList) {
        if (file.isDirectory()) {
            System.out.println("Ищет в: " + file.getAbsolutePath());
            File[] directoryList = file.listFiles();
            if (directoryList != null) {
                for (File directory : directoryList) {
                    if (directory.isDirectory()) {
                        searchFiles(directory, fileList);
                    } else {
                        if (directory.getName().endsWith(".jpg")) {
                            fileList.add(directory);
                        }
                    }
                }
            }
        }
    }
}
