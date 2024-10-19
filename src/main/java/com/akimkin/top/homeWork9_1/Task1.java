package com.akimkin.top.homeWork9_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

diapozon();
    }
public static void diapozon() {
    System.out.println("введите число диаппозонов");
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
ArrayList<Integer> list=new ArrayList<>();// Объявими массива для заполенения числами,для реализации проверки комбинаций
    int temp=0; // Переменные temp и temp 2 для замены в случаи если x мненьше y.
    int temp2 =0;
    int i=0; // переменная для цикла
    int renge=0;// переменнная результата разсницы x и y

    for (int j = 0; j < n; j++) { // Главынй цикл контолирует опеределяет  количчество итераций

    while (i<n)i++;{// воложенный цикл проихводит вычисление диаппозона в строке 30 и 31 происходит записть в массив
            System.out.println("введите первное число ");
           int x=scanner.nextInt();
            System.out.println("введите второе число ");
             int y=scanner.nextInt();


        if (x<y){// для замены в случаи если y больше x
            temp2=x;
            temp=y;
            x=temp;
            y=temp2;

        }
            list.add(x);
            list.add(y);
            renge=x-y;// Непосредственно расчет диапозона и в строке 43 его вывод


            }
            System.out.println("Диапозон равен:"+renge);

    }

    Integer[] array = list.toArray(new Integer[0]);// преобразование ArrayList в обычный массив для перебора
    System.out.println(Arrays.toString(array));
    //Ниже находится комбинация циколов для процерки совпедений  массивов учтено то что числа могут быть поменянны местами напимер
    // при введении массива 0 3 2 5 числа поменяются местами и выходной массив будет 3 0 5 2
    // Анализ совпедения диапозонов все равно будет работаь.
    int mtschNumder=0;
    for ( int u = 0,d=0,m=1;m<array.length&u <array.length-1&d< array.length-2; u++,d++,m++) {
        if (m+u== array.length-1){break;}
        for (int l=2,k=0;l< array.length&k<array.length;l+=2,k+=2) {
            if ((array[u+d] <array[l])&&(array[l]<array[u+m])||(array[u+d]>array[3+k]&&array[u+m]<array[3+k])) {
                mtschNumder=l/2;

                System.out.println("Диапозоны пересекаются а иемнно  комбинация "+u +" c комбинацией "+mtschNumder);
            }


        }

    }
}
}














