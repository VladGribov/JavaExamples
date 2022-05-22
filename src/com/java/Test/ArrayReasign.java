package com.java.Test;

import com.java.practice.SudokuSolver;

import java.util.Arrays;

public class ArrayReasign {
    public static void main(String[] args) {
        char[] arr = {'.', '.', '9', '7', '4', '8', '.', '.', '.'};
        new ArrayReasign().array(arr);
    }
    public void array(char[] board){
        char[] original = board;
        System.out.println(Arrays.toString(original));
        board[0] = '1';
        System.out.println(Arrays.toString(original));
    }
}
