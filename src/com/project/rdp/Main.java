package com.project.rdp;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ApplicationService service;


        //Create empty disks
        service = new ApplicationService( 4);

        //Write data to those disks
        service.writeInformationToDisks();

        showDiskValues(service);

        //Create RowParityDisk
        service.createRowParityDisk();
        showDiskValues(service);
        //Calculate RPD data

        showDiskAndRpdValues(service);

        //Create the DiagonalParityDisk
            //Calculate DPD data



    }

    private static void showDiskAndRpdValues(ApplicationService service) {
    }

    private static void showDiskValues(ApplicationService service) {
        List<Disk> disks;
        disks = service.getDisks();

        for (int i=0; i < disks.size(); i ++ ) {
            Disk disk = disks.get(i);
            System.out.printf("%s %n", "Disk number: " + i);
            for (int j = 0; j < Disk.NUMBEROFFIELDS; j++) {
                System.out.printf("%d %n", disk.getRowValues().get(j));
            }
            System.out.println("================================");
        }
    }

}
