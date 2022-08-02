public class demo {
    public static void main(String[] args) {
        String regex = "^(0[1-9])|(1[0-9]?)|[2-9]$";
        System.out.println("1".matches(regex));
        System.out.println("-5".matches(regex));
        System.out.println("5".matches(regex));
        System.out.println("10".matches(regex));
        System.out.println("21".matches(regex));
        System.out.println("50".matches(regex));



    }
}
