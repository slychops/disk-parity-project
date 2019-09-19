package com.project.rdp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RowParityDisk extends Disk{

//    Map<Integer, Integer> rowValues;
     public  RowParityDisk(List<Disk> disks){

         super.rowValues = new HashMap<>();
         buildValuesInRpd(disks);
     }

    private void buildValuesInRpd(List<Disk> disks) {
         for (int i =0; i < Disk.NUMBEROFFIELDS; i ++){
              int sumOfRow= 0;

             for(Disk  disk : disks){
               sumOfRow +=  disk.getRowValues().get(i) ;
             }
             rowValues.put(i,sumOfRow);
         }
    }

}
