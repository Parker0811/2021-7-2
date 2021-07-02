package jiang.ren.bao;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 姜宝
 * 2021/6/19
 */
public class TestTwo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JAVA\\1");
        // check(file);
        //drop(file);
      /*  List<String> list = new ArrayList<>();
        Collections.addAll(list, "jiang","ren","bao");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.com;
            }
        });*/
        Thread thread = new Thread();
    }

    //定义方法删除文件夹
    private static void drop(File file) {
        if (file.isFile()) {
            file.delete();
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isFile()) {
                    f.delete();
                } else {
                    drop(f);
                }

            }
            file.delete();
        }
    }

    //定义方法查看文件所有的内容
    private static void check(File file) {
        if (file.isFile()) {
            System.out.println(file);
            return;
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isFile()) {
                    System.out.println(f);
                } else {
                    check(f);
                }
            }
        }
    }
}

