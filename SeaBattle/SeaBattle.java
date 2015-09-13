package SeaBattle;

import java.util.*;

public class SeaBattle {
    public static Byte[][] main() {

        //типы и кол-во кораблей
        final Byte ship1 = 4; //однопалубный
        final Byte ship2 = 3; //двухпалубный
        final Byte ship3 = 2; //трехпалубный
        final Byte ship4 = 1; //четырехпалубный

        //игровое поле
        Byte[][] gameField = initField();

        //Приветствие
        //System.out.println("Добро пожаловать в игру 'Моркой бой' !!!");

        //Установка имени игрока
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Введите Ваше имя: ");
        //String userName = scanner.nextLine();
        //System.out.println("Хорошо, Ваше имя записано как: " + userName);

        //создаем корабли
        createShip(ship1, ship2, ship3, ship4);
        //System.out.println("Все корабли созданы! Начинаем игру.");

        //размещаем на поле
        renderShips(gameField);

        //выводим результат
        //result(userName);

        return gameField;
    }
    public static Byte[][] initField() {
        Byte[][] game_field = new Byte[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                game_field[i][j] = 0;
            }
        }
        return game_field;
    }

    public static void result(String userName) {
        int temp = (int) (Math.random() * 10);
        if (temp > 5)
            System.out.println("Победил игрок: " + userName);
        else
            System.out.println("Победил компьютер.");
    }

    public static void createShip(Byte ship1, Byte ship2, Byte ship3, Byte ship4) {
        List<Ship> ships = new ArrayList<Ship>();
        createItemShip(ships, ship1);
        createItemShip(ships, ship2);
        createItemShip(ships, ship3);
        createItemShip(ships, ship4);
    }

    static List<Ship> createItemShip(List<Ship> ships, Byte ship) {
        for (Short j = 0; j < ship; j++) {
            Ship item = new Ship();
            item.length = ship;
            item.isALive = true;
            item.setCells(ship);
            ships.add(item);
        }
        return ships;
    }

    public static void renderShips(Byte[][] gameField) {
        createShip4(gameField, (byte)4);

        for (int k = 0; k < 2; k++) {
            while (!createShip3(gameField, (byte)3))
                System.out.println();
        }

        for (int k = 0; k < 3; k++) {
            while (!createShip2(gameField, (byte)2))
                System.out.println();
        }

        for (int k = 0; k < 4; k++) {
            while (!createShip1(gameField, (byte)1))
                System.out.println();
        }
    }

    public static boolean checkCell(Byte[][] gameField, int x, int y) {
        int count = 0; //  счетчик "хороших" клеток
        boolean result = false;
        //----------------------------углы---------------------------------------------
        if (y == 0 && x == 0) //левый верхний угол
        {
            System.out.println("левый верхний угол");
            System.out.println( "x = " + x + " y = " + y);
            System.out.println("count before = "+count);
            if (gameField[y][x] == 0) count++;
            if (gameField[y][x + 1] == 0) count++;
            if (gameField[y + 1][x] == 0) count++;
            if (count == 3) result = true;
            System.out.println("count after = "+count);
        }
        if (y == 0 && x == 9) //правый верхний угол
        {
            System.out.println("правый верхний угол");
            System.out.println( "x = " + x + " y = " + y);
            System.out.println("count before = "+count);
            if (gameField[y][x - 1] == 0) count++;
            if (gameField[y + 1][x - 1] == 0) count++;
            if (gameField[y + 1][x] == 0) count++;
            if (count == 3) result = true;
            System.out.println("count after = "+count);
        }
        if (y == 9 && x == 0) //левый нижний угол
        {
            System.out.println("левый нижний угол");
            System.out.println( "x = " + x + " y = " + y);
            System.out.println("count before = "+count);
            if (gameField[y - 1][x] == 0) count++;
            if (gameField[y - 1][x + 1] == 0) count++;
            if (gameField[y][x + 1] == 0) count++;
            if (count == 3) result = true;
            System.out.println("count after = "+count);
        }
        if (y == 9 && x == 9) //правый нижний угол
        {
            System.out.println("правый нижний угол");
            System.out.println( "x = " + x + " y = " + y);
            System.out.println("count before = "+count);
            if (gameField[y - 1][x] == 0) count++;
            if (gameField[y - 1][x - 1] == 0) count++;
            if (gameField[y][x - 1] == 0) count++;
            if (count == 3) result = true;
            System.out.println("count after = "+count);

        }
        //----------------------------центр-------------------------------------------
        if (x != 0 && x != 9 && y != 0 && y != 9) //если клетка не касается края поля
        {
            System.out.println("центр");
            System.out.println( "x = " + x + " y = " + y);
            System.out.println("count before = "+count);
            if (gameField[y][x + 1] == 0) count++;
            if (gameField[y][x - 1] == 0) count++;
            System.out.println(gameField[y][x - 1]+" y = "+(y)+" x = "+(x-1));
            System.out.println(gameField[y][x + 1]+" y = "+(y)+" x = "+(x+1));
            for (int i = 0; i < 3; i++) {
                if (gameField[y + 1][x - 1 + i] == 0) count++;
                System.out.println(gameField[y + 1][x - 1 + i]+" y = "+(y+1)+" x = "+(x - 1 + i));
            }

            for (int i = 0; i < 3; i++) {
                if (gameField[y - 1][x - 1 + i] == 0) count++;
                System.out.println(gameField[y - 1][x - 1 + i]+" y = "+(y-1)+" x = "+(x - 1 + i));
            }

            if (count == 8) result = true;
            System.out.println("count after = "+count);
        }
        //----------------стенка------------------------------------------
        if (y == 0 && x < 9 && x > 0) //верхний край
        {

            System.out.println("верхний край");
            System.out.println( "x = " + x + " y = " + y);
            System.out.println("count before = "+count);
            if (gameField[y][x + 1] == 0) count++;
            if (gameField[y][x - 1] == 0) count++;
            System.out.println(gameField[y][x - 1]+" y = "+(y)+" x = "+(x - 1));
            System.out.println(gameField[y][x + 1]+" y = "+(y)+" x = "+(x + 1));
            for (int i = 0; i < 3; i++) {
                System.out.println(gameField[y + 1][x - 1 + i]+" y = "+(y+1)+" x = "+(x - 1 + i));
                if (gameField[y + 1][x - 1 + i] == 0) count++;
            }
            if (count == 5) result = true;
            System.out.println("count after = "+count);
        }
        if (y == 9 && x < 9 && x > 0) //нижний край
        {
            System.out.println("нижний край");
            System.out.println( "x = " + x + " y = " + y);
            System.out.println("count before = "+count);
            if (gameField[y][x + 1] == 0) count++;
            if (gameField[y][x - 1] == 0) count++;
            System.out.println(gameField[y][x - 1]+" y = "+(y)+" x = "+(x - 1));
            System.out.println(gameField[y][x + 1]+" y = "+(y)+" x = "+(x + 1));
            for (int i = 0; i < 3; i++) {
                if (gameField[y - 1][x - 1 + i] == 0) count++;
                System.out.println(gameField[y - 1][x - 1 + i]+" y = "+(y-1)+" x = "+(x - 1 + i));
            }
            if (count == 5) result = true;
            System.out.println("count after = "+count);
        }
        if (x == 0 && y < 9 && y > 0) //левый край
        {
            System.out.println("левый край");
            System.out.println( "x = " + x + " y = " + y);
            System.out.println("count before = "+count);
            if (gameField[y - 1][x] == 0) count++;
            if (gameField[y + 1][x] == 0) count++;
            System.out.println(gameField[y - 1][x]+" y = "+(y-1)+" x = "+x);
            System.out.println(gameField[y + 1][x]+" y = "+(y+1)+" x = "+x);
            for (int i = 0; i < 3; i++) {
                if (gameField[y - 1 + i][x + 1] == 0) count++;
                System.out.println(gameField[y - 1 + i][x + 1]+" y = "+(y - 1 + i)+" x = "+(x+1));
            }
            if (count == 5) result = true;
            System.out.println("count after = "+count);
        }
        if (x == 9 && y < 9 && y > 0) //правый край
        {
            System.out.println("правый край");
            System.out.println( "x = " + x + " y = " + y);
            System.out.println("count before = "+count);

            if (gameField[y - 1][x] == 0) count++;
            if (gameField[y + 1][x] == 0) count++;
            System.out.println(gameField[y-1][x]+" y = "+(y-1)+" x = "+(x));
            System.out.println(gameField[y+1][x]+" y = "+(y+1)+" x = "+(x));
            for (int i = 0; i < 3; i++) {
                if (gameField[y - 1 + i][x - 1] == 0) count++;
                System.out.println(gameField[y - 1 + i][x - 1]+" y = "+(y-1+i)+" x = "+(x - 1));
            }
            if (count == 5) result = true;
            System.out.println("count after = "+count);
        }
        //----------------------------------------------------------------
        return result;
    }

    static boolean createShip1(Byte[][] gameField, Byte shipLength){
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("++++++++11111111111111++++++++++");
        int startCellx = RandomRage.showRandomInteger(0, 9);  //начальная клетка установки корабля
        int startCelly = RandomRage.showRandomInteger(0, 9);  //начальная клетка установки корабля
        System.out.println("startCell createShip1 x = " + startCellx + " y = " + startCelly);
        //System.out.println("shipLength = "+shipLength);
        int count = 0;

            System.out.println("Вертикально");
            //Short count = 0;
            if(( startCelly + shipLength ) <= 10) //выход за пределы поля
            {
                    if (gameField[startCelly][startCellx] == 0) //ячейка не занята кораблем
                    {
                        if(checkCell(gameField, startCellx,startCelly))
                        {
                            System.out.println("РИСУЕМ");
                            gameField[startCelly][startCellx] = 1; //устанавливаем корабль на поле
                            return true;
                        }
                        else
                        {
                            System.out.println("верт РЕКУРСИЯ createShip1 РЕКУРСИЯ 'count != 3'");
                            System.out.println("------------------------------");
                            //createShip3(gameField, shipLength);
                            return false;
                        }
                    }
                    else
                    {
                        System.out.println("верт РЕКУРСИЯ createShip2 РЕКУРСИЯ ' = 1'");
                        System.out.println("------------------------------");
                        return false;
                    }
            }
            else
            {
                System.out.println("верт РЕКУРСИЯ createShip1 РЕКУРСИЯ ' > 10'");
                System.out.println("------------------------------");
                //createShip3(gameField, shipLength);
                return false;
            }
    }

    static boolean createShip2(Byte[][] gameField, Byte shipLength){
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("++++++++22222222222222++++++++++");
        int orientation = RandomRage.showRandomInteger(1, 2);  //1 - вертикально 2 - горизонтально
        int startCellx = RandomRage.showRandomInteger(0, 9);  //начальная клетка установки корабля
        int startCelly = RandomRage.showRandomInteger(0, 9);  //начальная клетка установки корабля
        System.out.println("startCell createShip2 x = " + startCellx + " y = " + startCelly);
        //System.out.println("shipLength = "+shipLength);
        int count = 0;
        boolean result = false;
        if(orientation == 1)
        {
            System.out.println("Вертикально");
            //Short count = 0;
            if(( startCelly + shipLength ) <= 10) //выход за пределы поля
            {
                for (int i = 0; i < shipLength; i++)
                {
                    if (gameField[startCelly + i][startCellx] == 0) //ячейка не занята кораблем
                    {
                        if(checkCell(gameField, startCellx,startCelly + i))
                        {
                            //System.out.println("count++");
                            count++;
                        }
                    }
                    else
                    {
                        System.out.println("верт РЕКУРСИЯ createShip2 РЕКУРСИЯ ' = 1'");
                        System.out.println("------------------------------");
                        return false;
                    }
                }
            }
            else
            {
                System.out.println("верт РЕКУРСИЯ createShip2 РЕКУРСИЯ ' > 10'");
                System.out.println("------------------------------");
                //createShip3(gameField, shipLength);
                return false;
            }

            System.out.println("count1 = "+count);
            if(count==2)
            {
                System.out.println("РИСУЕМ");
                result = true;

                for (int i = 0; i < shipLength; i++) {
                    gameField[startCelly + i][startCellx] = 1; //устанавливаем корабль на поле
                }
                return true;
            }
            else
            {
                System.out.println("верт РЕКУРСИЯ createShip2 РЕКУРСИЯ 'count != 3'");
                System.out.println("------------------------------");
                //createShip3(gameField, shipLength);
                return false;
            }
        }
        else
        {
            System.out.println("Горизонтально");
            //int count = 0;
            if(( startCellx + shipLength ) <= 10) //выход за пределы поля
            {
                for (int i = 0; i < shipLength; i++)
                {
                    if (gameField[startCelly][startCellx + i] == 0) //ячейка не занята кораблем
                    {
                        if(checkCell(gameField, startCellx + i,startCelly))
                            count++;
                    }
                    else
                    {
                        System.out.println("гор РЕКУРСИЯ createShip2 РЕКУРСИЯ  ' = 1'");
                        System.out.println("------------------------------");
                        //createShip3(gameField, shipLength);
                        return false;
                    }
                }
            }
            else
            {
                System.out.println("гор РЕКУРСИЯ createShip2 РЕКУРСИЯ ' > 10'");
                System.out.println("------------------------------");
                //createShip3(gameField, shipLength);
                return false;
            }

            System.out.println("count2 = "+count);
            if(count==2)
            {
                System.out.println("РИСУЕМ");
                result = true;

                for (int i = 0; i < shipLength; i++) {
                    gameField[startCelly][startCellx+i] = 1; //устанавливаем корабль на поле
                }
                return true;
            }
            else
            {
                System.out.println("гор РЕКУРСИЯ createShip2 РЕКУРСИЯ 'count != 3'");
                System.out.println("------------------------------");
                //createShip3(gameField, shipLength);
                return false;
            }
        }
        //return result;
    }

    static boolean createShip3(Byte[][] gameField, Byte shipLength){
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("++++++++33333333333++++++++++");
        int orientation = RandomRage.showRandomInteger(1, 2);  //1 - вертикально 2 - горизонтально
        int startCellx = RandomRage.showRandomInteger(0, 9);  //начальная клетка установки корабля
        int startCelly = RandomRage.showRandomInteger(0, 9);  //начальная клетка установки корабля
        System.out.println("startCell createShip3 x = " + startCellx + " y = " + startCelly);
        //System.out.println("shipLength = "+shipLength);
        int count = 0;
        boolean result = false;
        if(orientation == 1)
        {
            System.out.println("Вертикально");
            //Short count = 0;
            if(( startCelly + shipLength ) <= 10) //выход за пределы поля
            {
                for (int i = 0; i < shipLength; i++)
                {
                    if (gameField[startCelly + i][startCellx] == 0) //ячейка не занята кораблем
                    {
                        if(checkCell(gameField, startCellx,startCelly + i))
                        {
                            //System.out.println("count++");
                            count++;
                        }
                    }
                    else
                    {
                        System.out.println("верт РЕКУРСИЯ createShip3 РЕКУРСИЯ ' = 1'");
                        System.out.println("------------------------------");
                        return false;
                    }
                }
            }
            else
            {
                System.out.println("верт РЕКУРСИЯ createShip3 РЕКУРСИЯ ' > 10'");
                System.out.println("------------------------------");
                //createShip3(gameField, shipLength);
                return false;
            }

            System.out.println("count1 = "+count);
            if(count==3)
            {
                System.out.println("РИСУЕМ");
                result = true;

                for (int i = 0; i < shipLength; i++) {
                    gameField[startCelly + i][startCellx] = 1; //устанавливаем корабль на поле
                }
                return true;
            }
            else
            {
                System.out.println("верт РЕКУРСИЯ createShip3 РЕКУРСИЯ 'count != 3'");
                System.out.println("------------------------------");
                //createShip3(gameField, shipLength);
                return false;
            }
        }
        else
        {
            System.out.println("Горизонтально");
            //int count = 0;
            if(( startCellx + shipLength ) <= 10) //выход за пределы поля
            {
                for (int i = 0; i < shipLength; i++)
                {
                    if (gameField[startCelly][startCellx + i] == 0) //ячейка не занята кораблем
                    {
                        if(checkCell(gameField, startCellx + i,startCelly))
                            count++;
                    }
                    else
                    {
                        System.out.println("гор РЕКУРСИЯ createShip3 РЕКУРСИЯ  ' = 1'");
                        System.out.println("------------------------------");
                        //createShip3(gameField, shipLength);
                        return false;
                    }
                }
            }
            else
            {
                System.out.println("гор РЕКУРСИЯ createShip3 РЕКУРСИЯ ' > 10'");
                System.out.println("------------------------------");
                //createShip3(gameField, shipLength);
                return false;
            }

            System.out.println("count2 = "+count);
            if(count==3)
            {
                System.out.println("РИСУЕМ");
                result = true;

                for (int i = 0; i < shipLength; i++) {
                    gameField[startCelly][startCellx+i] = 1; //устанавливаем корабль на поле
                }
                return true;
            }
            else
            {
                System.out.println("гор РЕКУРСИЯ createShip3 РЕКУРСИЯ 'count != 3'");
                System.out.println("------------------------------");
                //createShip3(gameField, shipLength);
                return false;
            }
        }
        //return result;
    }

    static void createShip4(Byte[][] gameField, Byte shipLength){
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++444444444+++++++++++++");
        //System.out.println("createShip4");
        int orientation = RandomRage.showRandomInteger(1, 2);  //1 - вертикально 2 - горизонтально
        //System.out.println("orientation createShip4 = "+orientation);
        int startCellx = RandomRage.showRandomInteger(0, 9);  //начальная клетка установки корабля
        int startCelly = RandomRage.showRandomInteger(0, 9);  //начальная клетка установки корабля
        System.out.println("startCell createShip4 x = " + startCellx + " y = " + startCelly);

        System.out.println("shipLength = "+shipLength);
        if(orientation == 1)
        {
            System.out.println("Вертикально");
            Short count = 0;
            if((startCelly+shipLength) <= 10) //выход за пределы поля
            {
                for (int i = 0; i < shipLength; i++)
                {
                        if (gameField[startCelly + i][startCellx] == 0)
                            count++;
                        else
                        {
                            System.out.println("РЕКУРСИЯ createShip4 РЕКУРСИЯ");
                            System.out.println("------------------------------");
                            createShip4(gameField, shipLength);
                        }
                }
            }
            else
            {
                System.out.println("РЕКУРСИЯ createShip4 РЕКУРСИЯ");
                System.out.println("------------------------------");
                createShip4(gameField, shipLength);
            }

            //System.out.println("count1 = "+count);
            if(count==4)
            {
                for (int i = 0; i < shipLength; i++) {
                    gameField[startCelly+i][startCellx] = 1; //устанавливаем корабль на поле
                }
            }
        }
        else
        {
            System.out.println("Горизонтально");
            Short count = 0;
            if((startCellx+shipLength) <= 10) //выход за пределы поля
            {
                for (int i = 0; i < shipLength; i++)
                {
                        if(gameField[startCelly][startCellx+i] == 0)
                            count++;
                        else
                        {
                            System.out.println("РЕКУРСИЯ createShip4 РЕКУРСИЯ");
                            System.out.println("------------------------------");
                            createShip4(gameField, shipLength);
                        }
                }
            }
            else
            {
                System.out.println("РЕКУРСИЯ createShip4 РЕКУРСИЯ");
                System.out.println("------------------------------");
                createShip4(gameField, shipLength);
            }

            //System.out.println("count2 = "+count);
            if(count==4)
            {
                for (int i = 0; i < shipLength; i++) {
                    gameField[startCelly][startCellx+i] = 1; //устанавливаем корабль на поле
                }
            }
        }
    }
}
