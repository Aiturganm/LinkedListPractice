package task1;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Aiturgan");
        linkedList.add("Myrzaiym");
        linkedList.add("Gulumkan");
        linkedList.add("Nurjigit");
        linkedList.add("Nurmuhammed");
        linkedList.add("Nurtaazim");
        linkedList.add("Nurlan");
        linkedList.add("Aliaskar");

        System.out.println(linkedList);

        System.out.println("1. Тизменин биринчи элементи:");
        System.out.println(linkedList.get(0) + "\n");

        System.out.println("2. Тизменин акыркы элементин алуу: ");
        System.out.println(linkedList.get(linkedList.size() - 1) + "\n");

        System.out.println("3. Тизмеде Gulumkan деген ат барбы текшеруу: ");
        System.out.println(linkedList.contains("Gulumkan") + "\n");

        String[] names = new String[linkedList.size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = linkedList.get(i);
        }
        System.out.println("4. Массивге которулган тизме: ");
        System.out.println(Arrays.toString(names));
        System.out.println();

        System.out.println("5. Эки LinkedList тизмесин салыштыруу");
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Mirlan");
        linkedList2.add("Nurislam");
        linkedList2.add("Zaripbek");
        System.out.println("1-список");
        System.out.println(linkedList);
        System.out.println("2-Список");
        System.out.println(linkedList2);
        System.out.println();
        if(linkedList.size() >linkedList2.size()){
            System.out.println("1-списокто элемемт коп");
        }else if(linkedList.size() < linkedList2.size()){
            System.out.println("2-списокто элемемт коп");
        }else System.out.println("2 списокто элементтер бирдей");
        System.out.println();

        System.out.println("6. LinkedList тизме бош же жок экенин текшерүү");
        if(!linkedList.isEmpty()){
            System.out.println("1-список бош эмес");
        }else System.out.println("1 - список бош");
        System.out.println();

        System.out.println("7. LinkedList тизмедеги 4 - элементти Aliya деген атка алмаштыруу");
        linkedList.set(3, "Aliya");
        System.out.println(linkedList);

    }



}