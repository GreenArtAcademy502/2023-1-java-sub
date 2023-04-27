package com.green.javasub.ch04;

public class ForQuiz4 {
    public static void main(String[] args) {
        int star = 5;
        //*****
        //****
        //***
        //**
        //*
        for (int i = star; i > 0 ; i--) {
            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
