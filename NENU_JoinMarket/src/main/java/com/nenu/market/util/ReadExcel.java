package com.nenu.market.util;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 20:51 2019/4/23
 */
public class ReadExcel {
    public String PoiTest(File file) throws IOException, InvalidFormatException {
        SXSSFWorkbook swb = new SXSSFWorkbook(new XSSFWorkbook(file),-1);
        Sheet sheet = swb.getXSSFWorkbook().getSheetAt(0);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        Row row ;
        //存储表头信息的链表，用来自动生成json的key
        List<Cell> list = new ArrayList();
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            row = sheet.getRow(i);
            //当扫描表头时将表头信息扫入链表
            if(i == 0){
                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                    list.add(row.getCell(j));
                }
                continue;
            }
            //非表头处理逻辑
            int count = 0;
            //临时变量 用来储存每行的栏目数
            int temp = row.getPhysicalNumberOfCells();
            //建立数组储存当前行的所有栏目
            String[] cells = new String[temp];
            //初始化数组
            for (int k = 0; k < temp; k++) {
                cells[k] = row.getCell(k).getStringCellValue();
            }
            //处理json格式
            stringBuffer.append("{");
            //增强for循环遍历表头链表 生成一条json 计数器count用来记录当前行中的cell
            for (Cell c:list) {
                stringBuffer.append("\"" + c.getStringCellValue() + "\"" + ":" + "\"" + cells[count++] + "\"" + ",");
            }
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
            stringBuffer.append("}");
            //处理json格式
            if (sheet.getPhysicalNumberOfRows() - 1 != i ) {
                stringBuffer.append(",");
                stringBuffer.append("\n");
            }
        }
        //处理json格式
        stringBuffer.append("]");
        swb.close();
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }
}
