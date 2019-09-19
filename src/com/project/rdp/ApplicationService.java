package com.project.rdp;

import java.util.ArrayList;
import java.util.List;

public class ApplicationService {

    private List<Disk> disks;

    public ApplicationService(int numberOfDisks) {
        disks = new ArrayList<>();
        createDiskSetup(numberOfDisks);
    }

    private void createDiskSetup(int numberOfDisks){

        for (int i = 0; i < numberOfDisks; i++) {
                disks.add(new Disk());
        }
    }

    public void writeInformationToDisks() {
        for (Disk disk: disks) {
            disk.writeDataToDisk();
        }
    }

    public List<Disk> getDisks() {
        return disks;
    }

    public void createRowParityDisk() {
        RowParityDisk rpd = new RowParityDisk(disks);
        disks.add(rpd);
    }
}
