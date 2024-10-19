package com.akimkin.top.homeWork9_1;

import java.io.*;
import java.util.Scanner;

public class Journal {//класс в котором реализованны методы по дабавлению и удалению книги

public static  void addBook () {
    try {
        LabraryCard labraryCard = new LabraryCard();// Создаем новый объект класса
//Вносим изменения в поля объекта которые необходимо заполнить при выдаче книги
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги которе хотите добавить");
        String bookName = scanner.nextLine();
        System.out.println("Введите день выдачи книги");
        int day = scanner.nextInt();
        System.out.println("Введите месяц выдачи книги");
        int mouth = scanner.nextInt();
        System.out.println("Введите год выдачи книги");
        int year = scanner.nextInt();
        System.out.println("Введите срок ");
        int issue = scanner.nextInt();
        labraryCard.setIssue(issue);


        labraryCard.setData((day + mouth * 30) + issue);//Данный участок кода отвечает за преобразование
// даты в число для дальнейщей проверки


        String string = Integer.toString(labraryCard.data);//Преобразуем число в стоку для bufferedWriter


 //Работа с bufferedWriter

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/file/text.txt", true));
//        bufferedWriter.write(string);
        bufferedWriter.append(string);
        labraryCard.setBookName(bookName);
        bufferedWriter.close();

//Конец работы с bufferedWriter

//Вывод данных в консоль
        labraryCard.setFullName("Dmitriy Petrovich");
        System.out.println("ФИО: " + labraryCard.FullName + "\nПолучает книгу:\t" + labraryCard.getBookName() +
                "\nКнига была выданна: " + day + "." + mouth + "." + year);
//Вывод данных в консоль

    } catch (IOException e) {
        System.out.println(e.getMessage());

    }

}

    public static void removeBook() throws IOException{//Метод для удаления книги
        int date=0;
//Работа с bufferedReader

     try {
         BufferedReader bufferedReader=new BufferedReader(new FileReader("C:/file/text.txt"));
         String string;

         while ((string=bufferedReader.readLine())!=null){
             System.out.println(string);
            date=Integer.parseInt(string);
         }

     }catch (IOException e){
         System.out.println(e.getMessage());
     }

 // Конец работы с bufferedReader

//Ввод данных для сдачи книги
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите день возврата  книги");
        int day=scanner.nextInt();
        System.out.println("Введите месяц возврата книги книги");
        int mouth=scanner.nextInt();
        System.out.println("Введите год возврата книги книги");
        int year=scanner.nextInt();
//Конец ввода данных

 //Анализ сответствия срока сдачи
        int issue=(day+mouth*30);
          if (date<issue){
            int delta=issue-date;
            System.out.println("Книга была просроченна на:"+delta+" дней");
        }
//Анализ сответствия срока сдачи
    }

}





