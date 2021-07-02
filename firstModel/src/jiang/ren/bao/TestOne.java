package jiang.ren.bao;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

/**
 * 姜宝
 * 2021/6/17
 */
public class TestOne {
    public static void main(String[] args) throws ParseException, IOException {
        /*DecimalFormat df = new DecimalFormat("#,###.000");
        String result = df.format(123456.12);
        System.out.println(result);*/
        /*Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(3));
        }*/
        //System.out.println(Math.pow(2, 3));
       /* System.out.println(Math.ceil(10.12));
        System.out.println(Math.floor(10.12));*/
//        System.out.println(new Date());
//        System.out.println(new Date().getTime());
//        System.out.println(System.currentTimeMillis());//1623938181946
        /*Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM:dd-HH:mm-ss");
        String result = sdf.format(date);
        System.out.println(result);*/
//        String text = "2021年1月1日";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日");
//        Date date = sdf.parse(text);
//        System.out.println(date);
     /*   LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH:mm:ss");
        String result = now.format(dtf);
        //System.out.println(result);
        LocalDateTime time = LocalDateTime.parse(result, dtf);
        System.out.println(time);*/
        StringBuilder sb = new StringBuilder();
        sb.append("123");
        sb.delete(1, 2);
        //System.out.println(sb);
        sb.insert(1, 2);
        //System.out.println(sb);
        // sb = sb.reverse();
        //System.out.println(sb);
        sb.replace(1, 2, "2222222222");
        //System.out.println(sb);
        String str = sb.substring(1);
        //System.out.println(sb);
        //System.out.println(str);
        String number = "123456789";
        int result = Integer.parseInt(number);
        //System.out.println(result);
        String string = Integer.toBinaryString(1024);
        //System.out.println(string);
        /*FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\cv.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\copy.txt");
        byte[] bytes = new byte[1024];
        int length = fis.read(bytes);
        while (length!=-1){
            fos.write(bytes, 0, length);
            length = fis.read(bytes);
        }
        fos.flush();
        fos.close();
        fis.close();*/
        /*try (
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\cv.txt"))
        ){
            bos.write("hello啊树哥!".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
       /* try (
                PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\cv.txt"))
                ){
            ps.print("不换行           ");
            ps.println("下一个换行");
            System.setOut(ps);
            System.out.println("这个信息打印到cv.txt文件中");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        File file = new File("C:\\Users\\Administrator\\Desktop\\cv.txt");
        //System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.length());
    }
}
