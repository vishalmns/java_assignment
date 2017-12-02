package com.company;

interface Shape {
    public void draw(int n);
}

class Asterick implements Shape {
    public void draw(int n) {
        assert n == 1 : "Not vaild";
        System.out.println("*");
    }
}

class HorizontalLine implements Shape {
    @Override
    public void draw(int n) {
        for (int index = 0; index < n; index++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

class VerticalLine implements Shape {
    @Override
    public void draw(int n) {
        for (int index = 0; index < n; index++) {
            System.out.println("*");
        }
    }
}

class RightTriangle implements Shape {
    @Override
    public void draw(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Diamond implements Shape {
    @Override
    public void draw(int n) {
        int spaces = n - 1;
        for (int index = 1; index <= n; index++) {
            for (int space = 0; space < n - index; space++) {
                System.out.print(" ");
            }
            for (int asterick = 0; asterick < (2 * index) - 1; asterick++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int index = 1; index < n; index++) {
            for (int space = 0; space < index; space++) {
                System.out.print(" ");
            }
            for (int asterick = 0; asterick < (2 * (n - index)) - 1; asterick++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
class DiamondWithName implements Shape {
    private String name;
    DiamondWithName() {
        name = "kool";
    }
    @Override
    public void draw(int n) {
        int spaces = n - 1;
        for (int index = 1; index < n; index++) {
            for (int space = 0; space < n - index; space++) {
                System.out.print(" ");
            }
            for (int asterick = 0; asterick < (2 * index) - 1; asterick++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(name);
        for (int index = 1; index < n; index++) {
            for (int space = 0; space < index; space++) {
                System.out.print(" ");
            }
            for (int asterick = 0; asterick < (2 * (n - index)) - 1; asterick++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


public class Shapes {

    public static void main(String[] args) {
        Shape asterick = new Asterick();
        asterick.draw(1);

        Shape horizontalLine = new HorizontalLine();
        horizontalLine.draw(5);

        Shape verticalLine = new VerticalLine();
        verticalLine.draw(3);

        Shape rightTriangle = new RightTriangle();
        rightTriangle.draw(4);
        
        Shape diamond = new Diamond();
        diamond.draw(3);

        Shape diamonName = new DiamondWithName();
        diamonName.draw(5);

    }
}
