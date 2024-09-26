package DoIGetBonus;

//В большом городе настало время бонусов! Толстокровые потирают лапки в предвкушении... но кто заработает больше всего денег?

//Создайте функцию, которая принимает два аргумента (зарплата, премия).
//Зарплата будет целым числом, а премия — логическим.
//Если бонус — правда, зарплату следует умножить на 10.
// Если бонус — ложь, то толстосум не заработал достаточно денег и должен получить только свою заявленную зарплату.
//Возвращает общую сумму, которую получит пользователь, в виде строки с префиксом «£»
// (= "\u00A3", JS, Go, Java, Scala и Julia), «$» (C#, C++, Dart, Ruby, Clojure, Elixir, PHP, Python, Haskell и Lua) или «¥» (Rust).


public class DoIgetBonus {
    public static void main(String[] args) {
        System.out.println(bonusTime(10000,true));
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        int total = bonus ? salary * 10 : salary;
        return "£" + total;
    }
}
