package cn.jinyan.ljw.part1.section1;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Section1 {

    public static void main(String[] args) {
        Arrays.stream(listHiddenFile1(".")).forEach(System.out::println);
        System.out.printf("---------");
        Arrays.stream(listHiddenFile2(".")).forEach(System.out::println);
    }

    public static File[] listHiddenFile1(final String path){
        return new File(path).listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });
    }

    public static File[] listHiddenFile2(String path){
        return new File(path).listFiles(File::isHidden);
    }
}
