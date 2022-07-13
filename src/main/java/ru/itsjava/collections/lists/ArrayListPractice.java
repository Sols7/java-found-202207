package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Watch> watchesList = new ArrayList<>();;
        Watch seiko = new Watch("Seiko", "Vitaliy", 18000.0);
        Watch gShock = new Watch("GSHOCK", "Best dance", 10000.0);
        Watch garmin = new Watch("Garmin", "Sergey", 25000.0);

        watchesList.add(seiko);
        watchesList.add(gShock);
        watchesList.add(garmin);

        for (Watch elemWatch: watchesList) {
            System.out.println(elemWatch);
        }
        System.out.println();

//        watchesList.remove(0);
        watchesList.remove(gShock);
        System.out.println("List:");
        for (Watch elemWatch: watchesList) {
            System.out.println(elemWatch);
        }
        System.out.println();

        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));
        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
        System.out.println();

        System.out.println("watchesList = " + watchesList);

        System.out.println("watchesList.get(1).getFirm() = " + watchesList.get(1).getFirm());
        System.out.println("watchesList.get(1).getPrice() = " + watchesList.get(1).getPrice());

//        //watchesList.set(1, watchesList.get(1)).setPrice(12000.0);
//        watchesList.get(1).setPrice(8000.0);
//
//        System.out.println("watchesList = " + watchesList);

        System.out.println("watchesList.size() = " + watchesList.size());

        List<Watch> watchOmegaList = new ArrayList<>();

        Watch andrewWatch = new Watch("Omega", "Andrew", 100_000.0);
        Watch romaWatch = new Watch("Omega", "Roman", 100_000.0);

        watchOmegaList.add(andrewWatch);
        watchOmegaList.add(romaWatch);

        System.out.println("watchOmegaList = " + watchOmegaList);

        watchesList.addAll(watchOmegaList);
        System.out.println("watchesList = " + watchesList);

        Watch vitaliyWatch = new Watch("Seiko", "Vitaliy", 20_000.0);
        watchesList.add(2, vitaliyWatch);
        System.out.println("watchesList = " + watchesList);

    }
}
