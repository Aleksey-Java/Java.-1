package Work;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorke4 {

    private static final int SIZE = 3;
    private static final int DOTS_TO_WIN = 3;

    private static final char DOT_EMPTY = '*';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static final char[][] map = new char[SIZE][SIZE];


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Победа человека");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            computerTurn();
            printMap();
            if (isWin(DOT_O)) {
                System.out.println("Победа компьютера");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isWin(char symbol) {
//        if (map[0][0] == symbol && map[0][1] ==symbol && map[0][2] == symbol) return  true;
//        if (map[1][0] == symbol && map[0][1] ==symbol && map[1][2] == symbol) return  true;
//        if (map[2][0] == symbol && map[2][1] ==symbol && map[2][2] == symbol) return  true;
//
//        if (map[0][0] == symbol && map[1][0] ==symbol && map[2][0] == symbol) return  true;
//        if (map[0][1] == symbol && map[1][1] ==symbol && map[2][1] == symbol) return  true;
//        if (map[0][2] == symbol && map[1][2] ==symbol && map[2][2] == symbol) return  true;
//
//        if (map[0][0] == symbol && map[1][1] ==symbol && map[2][2] == symbol) return  true;
//        if (map[0][2] == symbol && map[1][1] ==symbol && map[2][0] == symbol) return  true;
//        return false;
        if (checkRowsAndCols(symbol)) {
            return true;
        } else {
            return checDiagonals(symbol);
        }
    }

    private static boolean checDiagonals(char symbol) {
        int mainDiagCounter = 0;
        int sideDiagCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            mainDiagCounter = (map[i][i] == symbol) ? mainDiagCounter + 1 : 0;
            sideDiagCounter = (map[i][map.length - 1 - i] == symbol) ? sideDiagCounter + 1 : 0;
            if (mainDiagCounter == DOTS_TO_WIN || sideDiagCounter == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkRowsAndCols(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int rowCounter = 0;
            int colCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                rowCounter = (map[i][j] == symbol) ? rowCounter + 1 : 0;
                colCounter = (map[i][j] == symbol) ? colCounter + 1 : 0;
                if (rowCounter == DOTS_TO_WIN || colCounter == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

        private static void printMap () {
            printHeader();
            printBody();
            System.out.println();
        }

        private static void computerTurn () {
            int x;
            int y;

            Random random = new Random();
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (map[x][y] != DOT_EMPTY);

            map[x][y] = DOT_O;

        }

        private static void humanTurn () {
            int x;
            int y;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Введите координаты в формтае X Y");
                x = readInt(scanner) - 1;
                y = readInt(scanner) - 1;

                if (x == -1 || y == -1) {
                    System.out.println("Координаты должны быть числом");
                    scanner.nextInt();
                } else if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                    System.out.println("Данные введены не корректно");
                } else if (map[x][y] != DOT_EMPTY) {
                    System.out.println("Клетка уже занята");
                } else {
                    break;
                }

            } while (true);

            map[x][y] = DOT_X;
        }

        private static int readInt (Scanner scanner){
            return scanner.hasNextLine() ? scanner.nextInt() : -1;
//        if (scanner.hasNextLine()) {
//            return scanner.nextInt();
//        } else {
//            return -1;
//        }

        }

        private static void printBody () {
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }

        private static void printHeader () {
            for

            (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        private static void initMap () {
            for (int i = 0; i < SIZE; i++) {
                Arrays.fill(map[i], DOT_EMPTY);
            }
        }
    }