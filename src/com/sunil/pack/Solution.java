package com.sunil.pack;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.TimeZone;

public class Solution {

    public static void main(String[] args){
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(int i=0;i<methods.length;i++){
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }

        SimpleDateFormat asSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date actualDate = null;
        try {
            actualDate = asSdf.parse("2019-07-10 09:20:16");

            Date gmtDate = asSdf.parse("2019-07-10 04:20:16");
            //TimeZone originTZ = DateWithTimeZone.getTimeZoneFromGMTOffset((int) (actualDate.getTime() - gmtDate.getTime()));
            //TimeZone originTZ = TimeZone.getTimeZone("Africa/Addis_Ababa");
            TimeZone originTZ = TimeZone.getTimeZone("Antarctica/Mawson");



            if(null != originTZ) {
                asSdf.setTimeZone(originTZ);
                DateWithTimeZone dtz = new DateWithTimeZone(asSdf.parse("2019-07-10 09:20:16").getTime());
                dtz.setTimeZone(originTZ);
                System.out.println(dtz);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}