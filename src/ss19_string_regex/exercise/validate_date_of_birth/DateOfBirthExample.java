package ss19_string_regex.exercise.validate_date_of_birth;

public class DateOfBirthExample {
    public static void main(String[] args) {
       final String REGEX = "^(((0[1-9]|[12][0-9]|30)[-/]?(0[13-9]|1[012])|31[-/]?(0[13578]|1[02])" +
               "|(0[1-9]|1[0-9]|2[0-8])[-/]?02)[-/]?[0-9]{4}|29[-/]?02[-/]?([0-9]{2}" +
               "(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";

        System.out.println("29/02/2022".matches(REGEX));
        System.out.println("28/02/2022".matches(REGEX));
        System.out.println("31/02/2022".matches(REGEX));
        System.out.println("20/12/2022".matches(REGEX));
    }
}
