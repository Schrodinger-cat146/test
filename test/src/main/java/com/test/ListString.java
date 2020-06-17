package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;


public class ListString {
    public static void main(String[] args) {
        Dao a1 = new Dao();
        a1.setName("李");
        a1.setAddress("sdfsfsdf");
        a1.setAge(3);

        Dao a2 = new Dao();
        a2.setName("&刘");
        a2.setAddress("搭建开发后开始");
        a2.setAge(5);

        Dao2 d1 = new Dao2();
        d1.setName("&李");
        d1.setAddress("sdfsfsdf");
        d1.setAge(3);

        Dao2 d2 = new Dao2();
        d2.setName("刘");
        d2.setAddress("搭建开发后开始");
        d2.setAge(5);

        /*List<String> daos = new ArrayList<String>();
        daos.add(o1);
        daos.add(o2);
        ArrayList<Dao> daos1 = new ArrayList<Dao>();
        for (String dao : daos) {
            String s = dao.replaceAll("&", "&amp;");
            Dao dao1 = JSONObject.parseObject(s, Dao.class);
            daos1.add(dao1);
        }

        System.out.println(daos1);*/

       /* ArrayList<Dao> list = new ArrayList<Dao>();
        for (Dao dao : daoList) {
            String s = JSONArray.toJSON(dao).toString();
            String s1 = s.replaceAll("&", "&amp;");
            Dao dao1 = JSONObject.parseObject(s1, Dao.class);
            list.add(dao1);
        }
        System.out.println(list);*/



        List<Dao> daoList = new ArrayList<Dao>();
        daoList.add(a1);
        daoList.add(a2);

        ArrayList<Dao2> dao2s = new ArrayList<Dao2>();
        dao2s.add(d1);
        dao2s.add(d2);


       List<Dao> ceshi =ceshi(daoList);


        System.out.println(ceshi);

        for (Dao dao : ceshi) {
            System.out.println(dao.getAddress());
        }

    }

   private static List ceshi (List list) {
        ArrayList<Object> objects = new ArrayList<Object>();
       for (Object o : list) {
           String s = JSONArray.toJSON(o).toString();
           String s1 = s.replaceAll("&", "&amp;");
           Object t = JSONObject.parseObject(s1,o.getClass());
           objects.add(t);
       }

        return objects;
    }


}
