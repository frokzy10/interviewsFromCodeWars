package TheOfficeBoredomScore;


//Each department has a different boredom assessment score, as follows:

//accounts = 1
//finance = 2
//canteen = 10
//regulation = 3
//trading = 6
//change = 6
//IS = 8
//retail = 5
//cleaning = 4
//pissing about = 25

//Depending on the cumulative score of the team, return the appropriate sentiment:

//  <=80: 'kill me now'
//  < 100 & > 80: 'i can handle this'
//  100 or over: 'party time!!'

public class TheOfficeBoredomScore {
    public static void main(String[] args) {
        Person[] staff = {
                new Person("Tim", "change"),
                new Person("jim", "accounts"),
                new Person("randy", "canteen"),
                new Person("sandy", "change"),
                new Person("andy", "change"),
                new Person("katie", "IS"),
                new Person("laura", "change"),
                new Person("saajid", "IS"),
                new Person("alex", "trading"),
                new Person("john", "accounts"),
                new Person("mr", "finance"),
        };
        System.out.println(boredom(staff));
    }
    public static String boredom(Person[] staff) {
        int boredomScore = 0;
        for (Person person : staff) {
            switch (person.department){
                case "accounts": boredomScore += 1; break;
                case "finance": boredomScore += 2; break;
                case "canteen": boredomScore += 10; break;
                case "regulation": boredomScore += 3; break;
                case "trading": boredomScore += 6; break;
                case "change": boredomScore += 6; break;
                case "IS": boredomScore += 8; break;
                case "retail": boredomScore += 5; break;
                case "cleaning": boredomScore += 4; break;
                case "pissing about": boredomScore += 25; break;
                default: break;
            }
        }
        System.out.println(boredomScore);
        if (boredomScore <= 80) {
            return "kill me now";
        } else if (boredomScore < 100) {
            return "i can handle this";
        } else {
            return "party time!!";
        }
    }
}

class Person {
    public final String name;        // name of the staff member
    public final String department;  // department they work in

    Person(String name, String department) {
        this.name = name;
        this.department = department;
    }
}