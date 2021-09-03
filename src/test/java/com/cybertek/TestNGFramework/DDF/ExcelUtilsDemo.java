package com.cybertek.TestNGFramework.DDF;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {

    @Test
    public void readExcelFile(){
        //create an object from ExcelUtil
        //it accepts two arg
        //argument 1 : location of the file(path);
        //argument 2 : sheet that we want to open (SheetName)

        ExcelUtil qa3short = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA3-short");

        //how many rows in the sheet
        System.out.println("row count = " + qa3short.rowCount());

        //how many columns in the sheet
        System.out.println("column count = " + qa3short.columnCount());

        //get all column name
        System.out.println("column names = " + qa3short.getColumnsNames());

        //get all data in list of maps
        List<Map<String,String>> mapList = qa3short.getDataList();
        //System.out.println(mapList);
        //System.out.println(qa3short.getDataList().get(0).get("firstname"));
        for (Map<String,String>each : mapList){
            System.out.println(each);
        }

        //get all data in 2d array
        String[][] array2d = qa3short.getDataArray();
        //print 2d array
        System.out.println(Arrays.deepToString(array2d));
    }
}
