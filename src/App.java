public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!" + args[0] + " " + args[1]);
        second();
        SecondClass secondClass = new SecondClass();
        secondClass.second();
        secondClass.third();
    }

    public static void second(){
        System.out.println("second");
    }
}

class SecondClass{

    void second(){
        System.out.println("second in a class");
    }

    void third(){
        System.out.println("third in a class");
    }
}



