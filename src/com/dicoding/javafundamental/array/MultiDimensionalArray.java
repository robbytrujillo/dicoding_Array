package com.dicoding.javafundamental.array;

public class MultiDimensionalArray {

//    void cobaArray2D() {
//        int[][] arrInt = new int[][];
//    }
public static void main(String[] args) {
    char[][] arrChar = new char[2][];
    arrChar[0] = new char[2];
    arrChar[1] = new char[3];

    // Dimensi 1 yang indexnya 0 memiliki panjang elemen 2
    arrChar[0][0] = 'A';
    arrChar[0][1] = 'B';

    // Dimensi 1 yang indexnya 1 memiliki panjang elemen 3
    arrChar[1][0] = 'C';
    arrChar[1][1] = 'D';
    arrChar[1][2] = 'E';

    // Tampilkan semua data dari dimensi 1 yang memiliki index 0
    System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan index 0 : " + arrChar[0][0]);
    System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan index 1 : " + arrChar[0][1]);

    // Tampilkan semua data dari dimensi 1 yang memiliki index 1
    System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan index 0 : " + arrChar[1][0]);
    System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan index 1 : " + arrChar[1][1]);
    System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan index 2 : " + arrChar[1][2]);
}

}
