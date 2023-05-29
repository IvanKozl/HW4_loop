public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }

        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " то он совершеннолетний");
        }
        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + " то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку ");
        } else { System.out.println("На улице " + temp + " градусов, нужно надеть шапку");}
        if (temp > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else { System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        int temp1 = 6;
        if (temp1 < 5) { System.out.println("На улице холодно, нужно надеть шапку ");
        } else { System.out.println("На улице " + temp1 + " градусов, нужно надеть шапку");}
        if (temp > 5) { System.out.println("Сегодня тепло, можно идти без шапки");
        } else { System.out.println("На улице " + temp1 + " градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 65;
        if (speed > 60) { System.out.println("Если скорость " + speed + " , то предется заплатить штраф");}
        if (speed < 60) { System.out.println("Если скорость " + speed + " то можно ездить спокойно");}
        int speed1 = 50;
        if (speed1 > 60) { System.out.println("Если скорость " + speed1 + " , то предется заплатить штраф");}
        if (speed1 < 60) { System.out.println("Если скорость " + speed1 + " то можно ездить спокойно");}
        }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 16;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " , то ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else if (age > 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        } else if (age > 60) {
            System.out.println("Если возраст человека равен " + age + " , то он может отдохнуть");
        }
        int age1 = 1;
        if (age1 < 2) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора спать");
        } else if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        } else if (age1 > 18 && age1 < 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в университет");
        } else if (age1 > 24 && age1 < 60) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить на работу");
        } else if (age1 > 60) {
            System.out.println("Если возраст человека равен " + age1 + " , то он может отдохнуть");
        }

        int age5 = 5;
        if (age5 < 2) {
            System.out.println("Если возраст человека равен " + age5 + " , то ему пора спать");
        } else if (age5 >= 2 && age5 <= 6) {
            System.out.println("Если возраст человека равен " + age5 + " , то ему нужно ходить в детский сад");
        } else if (age5 >= 7 && age5 <= 18) {
            System.out.println("Если возраст человека равен " + age5 + " , то ему нужно ходить в школу");
        } else if (age5 > 18 && age5 < 24) {
            System.out.println("Если возраст человека равен " + age5 + " , то ему нужно ходить в университет");
        } else if (age5 > 24 && age5 < 60) {
            System.out.println("Если возраст человека равен " + age5 + " , то ему нужно ходить на работу");
        } else if (age5 > 60) {
            System.out.println("Если возраст человека равен " + age5 + " , то он может отдохнуть");
        }
        int age19 = 19;
        if (age19 < 2) {
            System.out.println("Если возраст человека равен " + age19 + " , то ему пора спать");
        } else if (age19 >= 2 && age19 <= 6) {
            System.out.println("Если возраст человека равен " + age19 + " , то ему нужно ходить в детский сад");
        } else if (age19 >= 7 && age19 <= 18) {
            System.out.println("Если возраст человека равен " + age19 + " , то ему нужно ходить в школу");
        } else if (age19 > 18 && age19 < 24) {
            System.out.println("Если возраст человека равен " + age19 + " , то ему нужно ходить в университет");
        } else if (age19 > 24 && age19 < 60) {
            System.out.println("Если возраст человека равен " + age19 + " , то ему нужно ходить на работу");
        } else if (age19 > 60) {
            System.out.println("Если возраст человека равен " + age19 + " , то он может отдохнуть");
        }

        int age25 = 25;
        if (age25 < 2) {
            System.out.println("Если возраст человека равен " + age25 + " , то ему пора спать");
        } else if (age25 >= 2 && age25 <= 6) {
            System.out.println("Если возраст человека равен " + age25 + " , то ему нужно ходить в детский сад");
        } else if (age25 >= 7 && age25 <= 18) {
            System.out.println("Если возраст человека равен " + age25 + " , то ему нужно ходить в школу");
        } else if (age25 > 18 && age25 < 24) {
            System.out.println("Если возраст человека равен " + age25 + " , то ему нужно ходить в университет");
        } else if (age25 > 24 && age19 < 60) {
            System.out.println("Если возраст человека равен " + age25 + " , то ему нужно ходить на работу");
        } else if (age25 > 60) {
            System.out.println("Если возраст человека равен " + age25 + " , то он может отдохнуть");
        }

        int age61 = 61;
        if (age61 < 2) {
            System.out.println("Если возраст человека равен " + age61 + " , то ему пора спать");
        } else if (age61 >= 2 && age25 <= 6) {
            System.out.println("Если возраст человека равен " + age61 + " , то ему нужно ходить в детский сад");
        } else if (age61 >= 7 && age25 <= 18) {
            System.out.println("Если возраст человека равен " + age61 + " , то ему нужно ходить в школу");
        } else if (age61 > 18 && age25 < 24) {
            System.out.println("Если возраст человека равен " + age61 + " , то ему нужно ходить в университет");
        } else if (age61 > 24 && age19 < 60) {
            System.out.println("Если возраст человека равен " + age61 + " , то ему нужно ходить на работу");
        } else if (age61 > 60) {
            System.out.println("Если возраст человека равен " + age61 + " , то он может отдохнуть");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int age4 = 4;
        if (age4 < 5) {
            System.out.println("Если возраст ребенка равен " + age4 + " , то ему нельзя кататься на аттракционе");
        } else if (age4 > 2 && age4 <14) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age4 > 14) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        int age6 = 6;
        if (age6 < 5) {
            System.out.println("Если возраст ребенка равен " + age6 + " , то ему нельзя кататься на аттракционе");
        } else if (age6 > 2 && age6 <14) {
            System.out.println("Если возраст человека равен " + age6 + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age6 > 14) {
            System.out.println("Если возраст человека равен " + age6 + " , то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int age15 = 15;
        if (age15 < 5) {
            System.out.println("Если возраст ребенка равен " + age15 + " , то ему нельзя кататься на аттракционе");
        } else if (age15 > 2 && age15 <14) {
            System.out.println("Если возраст человека равен " + age15 + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age15 > 14) {
            System.out.println("Если возраст человека равен " + age15 + " , то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int men = 102;
        int menSeating = 60;
        int menStanding = men - menSeating;
        int menAll = 103;
        int menAllSeating = 30;
        int menAllStanding = 40;

        if (menAllSeating <= menAllSeating) {
            System.out.println("Еще есть " + (menSeating - menAllSeating) + "сидячие места");
        } else if (menAllSeating > menAllSeating) {
            System.out.println("В вагоне седячих мест нет");
        }
        if (menAllStanding <= menStanding) {
            System.out.println("Еще есть " + (menStanding - menAllStanding) + "стоячие места");
        } else if (menAllStanding > menAllStanding) {
            System.out.println("В вагоне столячих мест нет");
        }
        if (menAll <= men) {
            System.out.println("Еще есть " + (men - menAll) + " места");
        } else if (menAll > men) {
            System.out.println("В вагоне мест нет");
        }
    }

        public static void task7 () {
            System.out.println("Задача 7");
            int one = 20;
            int two = 19;
            int three = 18;
            if (one > two && one > two) {
                System.out.println("Самое большое число " + one);
            } else if (two > one && two > three) {
                System.out.println("Самое большое число " + two);
            } else if (three > one && three > two) {
                System.out.println("Самое большое число " + three);
            }  if (one == two && one == three) {
                System.out.println("Все три числа равны");
            }

        }
    }

