package ss19_string_regex.exercise.validate_phone;

public class PhoneExample {
    public static void main(String[] args) {
        String regex = "[(](84)[)][-][(]0[\\d]{9}[)]";

        System.out.println("(84)-(0978489648)".matches(regex));

        System.out.println("(a8)-(22222222)".matches(regex));
    }
}
