public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println(firstBoxer + secondBoxer);
        System.out.println(secondBoxer - firstBoxer);

        System.out.println(secondBoxer % firstBoxer);

        var totalHours = 640;
        var perPerson = 8;
        var addPeople = 94;
        System.out.println("Всего работников в компании — " + totalHours / perPerson + " человек");
        System.out.println("Если в компании работает " + ((totalHours / perPerson) + addPeople) + " человек, то всего " + (totalHours + (addPeople * perPerson)) + " часов работы может быть поделено между сотрудниками");
    }
}