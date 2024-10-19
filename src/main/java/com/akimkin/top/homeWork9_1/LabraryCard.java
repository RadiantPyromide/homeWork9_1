package com.akimkin.top.homeWork9_1;

import java.util.Scanner;

public class LabraryCard {//Класс содержит гетеры и сетеры для полей (БиблиотечнаяКарточка) некоторые поля остались не реалиованны
    // по причние безполезности(номер группы и номеры карточки студента)

    public LabraryCard() {

    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getGropNumber() {
        return gropNumber;
    }

    public void setGropNumber(int gropNumber) {
        this.gropNumber = gropNumber;
    }

    int cardNumber;
    String FullName;
    int gropNumber;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    String BookName;
    int issue;
    int data;

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    int issueDate;



}
