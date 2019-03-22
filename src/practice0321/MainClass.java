package practice0321;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {


    public static void main(String[] args){

        //String str = "JAVA";
        String str = new String("JAVA");
        System.out.println("str ="+ str);

        str = str + "_8";
        System.out.println("str ="+ str);

        //StringBuffer
        StringBuffer sf = new StringBuffer("HEE jeong");
        System.out.println("sf ="+ sf);

        sf.append("_world");
        System.out.println("sf ="+ sf);

        sf.length();
        System.out.println("sf.length() :" +sf.length());

        sf.insert(sf.length(),"~~~~~");
        System.out.println("sf :" +sf);

        sf.delete(4,8);
        System.out.println("sf :" +sf);

        StringBuilder sb = new StringBuilder("coooool");
        System.out.println("sb :"+sb);

        System.out.println();
        System.out.println();

        //
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("list.size : " + list.size());

        //데이터 추가
        list.add("Hello");
        list.add("Java");
        list.add("World");

        System.out.println(list);

        list.add(2,"Programing");

        System.out.println(list);

        list.set(1,"C");

        System.out.println(list);

        System.out.println("list.size : " + list.size());

        System.out.println();
        System.out.println();


        //Map
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        System.out.println("map.size() :" +map.size());

        //map데이터 추가
        map.put(5,"Hello");
        map.put(6,"Java");
        map.put(7,"World");

        System.out.println("map :" + map);
        System.out.println("map.size() :" +map.size());



    }
}
