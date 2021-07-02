import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Arrays;

/**
 * 姜宝
 * 2021/6/16
 */
public class Test1 extends Test2 {
    public Test1() {
        System.out.println("test1无参执行");
    }

    public Test1(int anInt) {
        System.out.println("test1有参执行");
    }

    public static int anInt;

    static {
        anInt = 10;
    }

    public static void main(String[] args) {
        //System.out.println(anInt);
        // new Test1(123);
        //System.out.printf("%.2f", 33.121212);
        /*System.out.println(sum(1,2,3));
        int[] ints={1,1,1,};
        System.out.println(sum(ints));*/
        /*int[] ints={1,2,3,4,5};
        int[] ints1={5,5,4,5,6,4};
        System.arraycopy(ints, 0, ints1, 1, 3);
        System.out.println(Arrays.toString(ints1));*/
        //System.out.println(5<<1);
        /*int[][] ints = new int[4][3];
        ints[0]=new int[]{1,2};
        ;*/
        Student[] students = new Student[10];
        int size = 0;
        students[size++] = new Student(10);
        students[size++] = new Student(12);
       /* for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }*/
       /*students[size++] = new Student(14);
       //删除索引为1的对象元素
        System.arraycopy(students,2 , students, 1, 1);
        students[size-1]=null;
        size--;
        System.out.println(Arrays.toString(students));*/
        //Arrays类中的方法
        int[] ints = {2, 5, 4, 3, 1};
        Arrays.sort(ints);
        int result = Arrays.binarySearch(ints, 2);
        Arrays.fill(ints, 1, 2, 9);
        //System.out.println(Arrays.toString(ints));
        /*      *//*ints = Arrays.copyOf(ints, 2);
        System.out.println(Arrays.toString(ints));*//*
        ints = Arrays.copyOfRange(ints, 1, 3);
        System.out.println(Arrays.toString(ints));*/

    }

    private static int sum(int... data) {
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            result += data[i];
        }
        return result;
    }
}

class Student {
    private int i;

    public Student(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "i=" + i +
                '}';
    }
}