package com.java.practice;


import java.util.Arrays;

public class SudokuSolver {
    static int boof;
    void a(){
        System.out.println(boof);
    }
    public void print(char[][] board) {
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
        System.out.println();
    }

    public char[][] solveSudoku(char[][] board) {
        char[][] original = board;
        /*
        Legend:
        '.' = empty slot
        '-' = given number not in slot
        '+' = given number possibly in slot
         */
        //have to set cells that aren't number to not num
        //after I check i gotta clear no num to check for next num
        //then check special rules where 2+ in one grid in a row or column are possibly
        //then all in that row or column are not
        //then check if any possible number locations
        char[][] arr = new char[9][9];
        boolean modify;//checks if the array was modified
        boolean repeat = true;
        boolean printOut = true;
        while (repeat) {
            repeat = false;
            for (int i = 1; i <= 9; i++) {//1-9 check each number one by 1
                char myChar = (char) (i + '0');
                do {
                    modify = false;
                    //check row then column of found row, later check grid
                    for (int j = 0; j < 9; j++) {//row 0,1,2,3,4,5,6,7,8
                        for (int k = 0; k < 9; k++) {//check individual locations in row for i
                            if (board[j][k] == myChar) {//if we find the number
                                //set the value of all '.' in that row and column to be '-'
                                for (int l = 0; l < 9; l++) {//row
                                    if (board[j][l] == '.') {//individual slots in row of found char
                                        board[j][l] = '-';
                                        modify = true;
                                    }
                                }
                                for (int l = 0; l < 9; l++) {
                                    if (board[l][k] == '.') {//individual slots in column of found char
                                        board[l][k] = '-';
                                        modify = true;
                                    }
                                }
                            }
                        }
                        //change the rest of '.' to '+'
                        //check grid for 2+ same '+' in a single row or column but not outside
                        //check for any 100% locations of num if it exists then change '+' to i
                        //clear all '-' and '+' to '.' and continue running
                    }
                    //check column then row of found column, later check grid
                    //check grids for num if found change '.' to '-'
                    for (int j = 0; j < 7; j += 3) {//0,3,6
                        for (int k = 0; k < 7; k += 3) {//board[0][0], board[0][3], board[0][6]
                            for (int l = j; l < j + 3; l++) {//board[0][],board[1][],board[2][]
                                for (int m = k; m < k + 3; m++) {//0 0, 0 1, 0 2
                                    //check for number and then replace '.' with '-'
                                    if (board[l][m] == myChar) {
                                        for (int n = j; n < j + 3; n++) {//checks the 3x3 grid
                                            for (int o = k; o < k + 3; o++) {
                                                if (board[n][o] == '.') {
                                                    board[n][o] = '-';
                                                    modify = true;
                                                }
                                            }
                                        }
                                    }
                                    //end of if
                                }
                            }
                        }
                    }
                    //change rest of '.' to '+' after fucking with the grid
                    for (int j = 0; j < 9; j++) {//each row
                        for (int k = 0; k < 9; k++) {//each position in row
                            if (board[j][k] == '.') {
                                board[j][k] = '+';
                            }
                        }
                    }
                    //check if a grid contains 2 or more '+' in a column or pilar of the grid.
                    //if true, check if any other '+' in 3x3 grid if true do nothing
                    //if NOT ->
                    //if pilar every other '+' outside grid in pilar changes to '-'
                    //if column every other '+' outside grid in column changes to '-'
                    for (int j = 0; j < 7; j += 3) {//checking grid 0,3,6
                        for (int k = 0; k < 7; k += 3) {
                            boolean found = false;
                            boolean exit = false;
                            int count = 0;
                            int row = 0;
                            int pos = 0;
                            //check rows
                            //if row has it check the rest of the rows
                            for (int l = j; l < j + 3; l++) { //0,1,2 next 3,4,5 next 6,7,8
                                for (int m = k; m < k + 3; m++) {
                                    if (board[l][m] == '+') {
                                        if (found) {
                                            exit = true;
                                            break;
                                        }
                                        count++;
                                        row = l;
                                        pos = m / 3;
                                    }
                                }
                                if (count >= 2) {
                                    found = true;
                                }
                                if (count == 1) {
                                    exit = true;
                                    break;
                                }
                            }
                            if (!exit && found) {//change all but board[row][pos] board[row][pos+1] board[row][pos+2] to '+'
                                for (int m = 0; m < 9; m++) {
                                    if (m != pos * 3 && m != pos * 3 + 1 && m != pos * 3 + 2 && board[row][m] == '+') {
                                        board[row][m] = '-';
                                        modify = true;
                                    }
                                }
                            }
                        }
                    }
                    //check pillars
                    for (int j = 0; j < 7; j += 3) {//checking grid 0,3,6
                        for (int k = 0; k < 7; k += 3) {
                            boolean found = false;
                            boolean exit = false;
                            int count = 0;
                            int pos = 0;
                            int column = 0;
                            for (int l = j; l < j + 3; l++) { //0,1,2 next 3,4,5 next 6,7,8
                                for (int m = k; m < k + 3; m++) {
                                    if (board[m][l] == '+') {
                                        if (found) {
                                            exit = true;
                                            break;
                                        }
                                        count++;
                                        column = l;
                                        pos = m / 3;
                                    }
                                }
                                if (count >= 2) {
                                    found = true;
                                }
                                if (count == 1) {
                                    exit = true;
                                    break;
                                }
                            }
                            if (!exit && found) {//change all but board[row][pos] board[row][pos+1] board[row][pos+2] to '+'
                                for (int m = 0; m < 9; m++) {
                                    if (m != pos * 3 && m != pos * 3 + 1 && m != pos * 3 + 2 && board[m][column] == '+') {
                                        board[m][column] = '-'; //this needs to be board[m][row]
                                        modify = true;
                                    }
                                }
                            }
                        }
                    }
                    //check grid if only 1 '-' change to i
                    for (int j = 0; j < 7; j += 3) {
                        for (int k = 0; k < 7; k += 3) {
                            int count = 0;
                            int row = 0;
                            int pos = 0;
                            boolean found = false;
                            for (int l = j; l < j + 3; l++) {
                                for (int m = k; m < k + 3; m++) {
                                    if (board[l][m] == myChar) {
                                        found = true;
                                        break;
                                    }
                                }
                            }
                            if (!found) {
                                for (int l = j; l < j + 3; l++) {
                                    for (int m = k; m < k + 3; m++) {
                                        if (board[l][m] == '+') {
                                            row = l;
                                            pos = m;
                                            count++;
                                        }
                                    }
                                }
                            }
                            if (count == 1) {
                                board[row][pos] = myChar;
                                modify = true;
                            }
                        }
                    }
                    //check pillar if only 1 '-' change to i
                    for (int j = 0; j < 9; j++) {
                        int count = 0;
                        int pillar = 0;
                        int pos = 0;
                        boolean found = false;
                        for (int k = 0; k < 9; k++) {
                            if (board[k][j] == myChar) {
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            for (int k = 0; k < 9; k++) {
                                if (board[k][j] == '+') {
                                    pillar = k;
                                    pos = j;
                                    count++;
                                }
                            }
                        }
                        if (count == 1) {
                            board[pillar][pos] = myChar;
                            modify = true;
                        }
                    }
                    //check row if only 1 '-' change to i
                    for (int j = 0; j < 9; j++) {
                        int count = 0;
                        int row = 0;
                        int pos = 0;
                        boolean found = false;
                        for (int k = 0; k < 9; k++) {
                            if (board[j][k] == myChar) {
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            for (int k = 0; k < 9; k++) {
                                if (board[j][k] == '+') {
                                    row = j;
                                    pos = k;
                                    count++;
                                }
                            }
                        }
                        if (count == 1) {
                            board[row][pos] = myChar;
                            modify = true;
                        }
                    }
                } while (modify);
                //replace '-' and '+' with '.' after doing everything with previous number
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 9; k++) {
                        if (board[j][k] == '-' || board[j][k] == '+') {
                            board[j][k] = '.';
                        }
                    }
                }
                //if we're at the last number check if any '-' are left if not break, else loop
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 9; k++) {
                        if (board[j][k] == '.') {
                            repeat = true;
                            break;
                        }
                    }
                }
            }//this is the end of the loop for choosing which number we check
            if (Arrays.deepEquals(arr, board) && checkDot(board)) {
                //if the board is valid guess otherwise return original
                if (isValidSudoku(board)) {
                    return board;
                } else {
                    return original;
                }

            }
            if (Arrays.deepEquals(arr, board)) {
                repeat = false;
            }
            arr = copy(board);
        }
        return board;
    }

    public boolean checkDot(char[][] board) {
        boolean dot = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    dot = true;
                    break;
                }
            }
        }
        return dot;
    }

    public char[][] copy(char[][] board) {
        char[][] copyOf = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                copyOf[i][j] = board[i][j];
            }
        }
        return copyOf;
    }

    public boolean isSolvable(char[][] board) {
        //this would be very usefull
        //check if the given board is solvable
        //if it is solve it
        return false;
    }

    public void solve(char[][] board) {
        for (int i = 1; i <= 9; i++) {

        }
    }
    //stable copy
    /*
    public char[][] guess(char[][] board) {
        char[][] arr = new char[9][9];
        board = solveSudoku(board);
        char[][] original = copy(board);
        while (isValidSudoku(board) && checkDot(board)) {
            if (Arrays.deepEquals(arr, board) && checkDot(board)) {
                board = copy(original);
                print(board);
            }
            arr = copy(board);
            System.out.println(isValidSudoku(board));
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if (board[j][k] == '.') {
                        for (int i = 1; i <= 9; i++) {
                            char myChar = (char) (i + '0');
                            board[j][k] = myChar;
                            if (isValidSudoku(solveSudoku(board))) {
                                board = solveSudoku(board);

                                print(board);
                                break;
                            } else {
                                board[j][k] = '.';
                            }
                        }
                    }
                }
            }
        }
        if (!isValidSudoku(board)) {
            System.out.println("No solution");
            print(board);
        }
        return board;
    }
     */

    //find 3x3 with smallest amount of empty squares and test values
    public char[][] guess(char[][] board) {
        char[][] arr = new char[9][9];
        board = solveSudoku(board);
        char[][] original = copy(board);
        while (isValidSudoku(board) && checkDot(board)) {
            if (Arrays.deepEquals(arr, board) && checkDot(board)) {
                board = copy(original);
                print(board);
            }
            arr = copy(board);
            System.out.println(isValidSudoku(board));
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if (board[j][k] == '.') {
                        for (int i = 1; i <= 9; i++) {
                            char myChar = (char) (i + '0');
                            board[j][k] = myChar;
                            if (isValidSudoku(solveSudoku(board))) {
                                board = solveSudoku(board);

                                print(board);
                                break;
                            } else {
                                board[j][k] = '.';
                            }
                        }
                    }
                }
            }
        }
        if (!isValidSudoku(board)) {
            System.out.println("No solution");
            print(board);
        }
        return board;
    }

    public boolean isValidSudoku(char[][] board) {
        //check if row has repeat numbers
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int x = j + 1; x < 9; x++) {
                    if (board[i][j] == board[i][x] && board[i][j] != '.') {
                        return false;
                    }
                }
            }
        }
        char[] grid = new char[9];
        char[] column = new char[9];
        //make a grid and check if it's valid
        for (int i = 0; i < board.length; i = i + 3) {
            //i = 0,3,6 rows board[0] board[3] board[6]
            for (int j = 0; j < board[i].length; j = j + 3) {
                //j = 0,3,6 split where to start at in a row board[0][0] board[0][3] board[0][6]
                int count = 0;
                for (int x = i; x < i + 3; x++) { //0,1,2
                    for (int y = j; y < j + 3; y++) {//0,1,2
                        //populate grid array to check for repeat values
                        grid[count] = board[x][y];
                        count++;
                    }
                }
                //check if grid contains same numbers
                for (int x = 0; x < 9; x++) {
                    for (int y = x + 1; y < 9; y++) {
                        if (grid[x] == grid[y] && grid[x] != '.') {
                            return false;
                        }
                    }
                }
            }
        }
        //populate array for column and check if valid
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                column[j] = board[j][i];
            }
            //check if it is valid
            for (int j = 0; j < 9; j++) {
                for (int x = j + 1; x < 9; x++) {
                    if (column[j] == column[x] && column[j] != '.') {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        /*char[][] arr = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};*/



       /*char[][] arr = {{'.', '.', '9', '7', '4', '8', '.', '.', '.'}
                , {'7', '.', '.', '.', '.', '.', '.', '.', '.'}
                , {'.', '2', '.', '1', '.', '9', '.', '.', '.'}
                , {'.', '.', '7', '.', '.', '.', '2', '4', '.'}
                , {'.', '6', '4', '.', '1', '.', '5', '9', '.'}
                , {'.', '9', '8', '.', '.', '.', '3', '.', '.'}
                , {'.', '.', '.', '8', '.', '3', '.', '2', '.'}
                , {'.', '.', '.', '.', '.', '.', '.', '.', '6'}
                , {'.', '.', '.', '2', '7', '5', '9', '.', '1'}};
                */


        char[][] arr = {{'.', '.', '9', '7', '4', '8', '.', '.', '.'}
                , {'7', '.', '.', '.', '.', '.', '.', '.', '.'}
                , {'.', '2', '.', '1', '.', '9', '.', '.', '.'}
                , {'.', '.', '7', '.', '.', '.', '2', '4', '.'}
                , {'.', '6', '4', '.', '1', '.', '5', '9', '.'}
                , {'.', '9', '8', '.', '.', '.', '3', '.', '.'}
                , {'.', '.', '.', '8', '.', '3', '.', '2', '.'}
                , {'.', '.', '.', '.', '.', '.', '.', '.', '6'}
                , {'.', '.', '.', '2', '7', '5', '9', '.', '.'}};
       new SudokuSolver().guess(arr);

    }
}
