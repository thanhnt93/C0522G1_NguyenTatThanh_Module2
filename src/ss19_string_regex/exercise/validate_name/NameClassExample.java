package ss19_string_regex.exercise.validate_name;

public class NameClassExample {
    public static void main(String[] args) {
        String Regex = "(C|A|P)[0-9]{4}(G|H|I|K|L|M)";

        System.out.println("C0318G".matches(Regex));

        System.out.println("M0318G".matches(Regex));
        System.out.println("P0323A".matches(Regex));


    }
}
