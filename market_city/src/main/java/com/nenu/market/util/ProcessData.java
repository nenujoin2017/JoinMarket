package com.nenu.market.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 19:53 2019/4/16
 */
public class ProcessData {
    public  Map<String,Integer> signCity(String strExcel){
        //读取数据
        JSONArray jsonArray = null;
        jsonArray = JSONArray.parseArray(strExcel);
        //list用于存储excel表格中的属性值
        List<String> list = new ArrayList();
        //map用于存储属性值出现的次数
        Map<String,Integer> map = new HashMap<String,Integer>();
        //遍历JsonArray
        for(int i = 0;i < jsonArray.size();i++){
            //访问JSONArray中的JSONObject对象
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            //访问目的属性值
            String signCity = jsonObject.getString("签约城市");
            //将属性值添加到链表
            list.add(signCity);
        }
        //遍历list
        for(String str:list){
            //判断如果key中已存在该字符串
            if(map.containsKey(str)){
                //value值加一次（多出现一次）
                map.put(str, map.get(str) + 1);
            }else{
                //如果该字符串没有出现，map新保存一组数据，出现次数为1次
                map.put(str, 1);
            }
        }
        map = sortByValueDescending(map);
        return map;
    }

    public Map<String,Integer> expectCity(String strExcel){
        //读取数据
        JSONArray jsonArray = null;
        jsonArray = JSONArray.parseArray(strExcel);
        //list用于存储excel表格中的属性值
        List<String> list = new ArrayList();
        //map用于存储属性值出现的次数
        Map<String,Integer> map = new HashMap<String,Integer>();
        //遍历JsonArray
        for(int i = 0;i < jsonArray.size();i++){
            //访问JSONArray中的JSONObject对象
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            //访问目的属性值
            String expectCity = jsonObject.getString("期望城市");
            //将属性值添加到链表
            list.add(expectCity);
        }
        //遍历list
        for(String str:list){
            //判断如果key中已存在该字符串
            if(map.containsKey(str)){
                //value值加一次（多出现一次）
                map.put(str, map.get(str) + 1);
            }else{
                //如果该字符串没有出现，map新保存一组数据，出现次数为1次
                map.put(str, 1);
            }
        }
        map = sortByValueDescending(map);
        return map;
    }

    public Map<String,Integer> studentFromCity(String strExcel){
        //读取数据
        JSONArray jsonArray = null;
        jsonArray = JSONArray.parseArray(strExcel);
        //list用于存储excel表格中的属性值
        List<String> list = new ArrayList();
        //map用于存储属性值出现的次数
        Map<String,Integer> map = new HashMap<String,Integer>();
        //遍历JsonArray
        for(int i = 0;i < jsonArray.size();i++){
            //访问JSONArray中的JSONObject对象
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            //访问目的属性值
            String expectCity = jsonObject.getString("生源城市");
            //将属性值添加到链表
            list.add(expectCity);
        }
        //遍历list
        for(String str:list){
            //判断如果key中已存在该字符串
            if(map.containsKey(str)){
                //value值加一次（多出现一次）
                map.put(str, map.get(str) + 1);
            }else{
                //如果该字符串没有出现，map新保存一组数据，出现次数为1次
                map.put(str, 1);
            }
        }
        map = sortByValueDescending(map);
        return map;
    }

    public Map<String,Integer> CountCompany(String strExcel){
        //读取数据
        JSONArray jsonArray = null;
        jsonArray = JSONArray.parseArray(strExcel);
        //list用于存储excel表格中的属性值
        List<String> list = new ArrayList();
        //map用于存储属性值出现的次数
        Map<String,Integer> map = new HashMap<String,Integer>();
        //遍历JsonArray
        for(int i = 0;i < jsonArray.size();i++){
            //访问JSONArray中的JSONObject对象
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            //访问目的属性值
            String expectCity = jsonObject.getString("所在城市");
            //将属性值添加到链表
            list.add(expectCity);
        }
        //遍历list
        for(String str:list){
            //判断如果key中已存在该字符串
            if(map.containsKey(str)){
                //value值加一次（多出现一次）
                map.put(str, map.get(str) + 1);
            }else{
                //如果该字符串没有出现，map新保存一组数据，出现次数为1次
                map.put(str, 1);
            }
        }
        map = sortByValueDescending(map);
        return map;
    }

    //降序排序
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDescending(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                int compare = (o1.getValue()).compareTo(o2.getValue());
                return -compare;
            }
        });
        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

}
