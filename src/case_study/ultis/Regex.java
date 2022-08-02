package case_study.ultis;

import java.util.Scanner;

public class Regex {
    private final static Scanner SCANNER = new Scanner(System.in);

    /**
     * Kiểm tra số tầng là số nguyên dương
     */
    public final static String REGEX_NUMBER_OF_FLOORS = "^[1-9]+[0-9]*$";

    /**
     * Phương thức kiểm tra số lượng người tối đa 0 < n > 20
     */
    public final static String REGEX_MAXIMUM_NUMBER_OF_PEOPLE = "^(0[1-9])|(1[0-9]?)|[2-9]$";

    /**
     * Phương thức kiểm tra chi phí phải là số nguên dương
     */
    public final static String REGEX_PRICE = "^[0-9.]+$";

    /**
     * Phương thức kiểm tra diện tích phải lớn hơn 30
     */
    public final static String REGEX_AREA = "^[0-9]*[1-9]+[\\\\.]?[0-9]*$";


    /**
     * Phương thức kiểm tra tên người dùng
     */
    public final static String REGEX_NAME = "^[A-Z][a-z]*(\\s[A-Z][a-z]+)*$";

    /**
     * Phương thức Regex kiểm tra định dạng mã dịch vụ Villa
     */
    public final static String REGEX_VILLA = "^(SVVL)[-][\\d]{4}$";
    /**
     * Phương thức Regex kiểm tra định dạng mã dịch vụ House
     */
    public final static String REGEX_HOUSE = "^(SVHO)[-][\\d]{4}$";

    /**
     * Phương thức Regex kiểm tra định dạng mã dịch vụ ROOM
     */
    public final static String REGEX_ROOM = "^(SVRO)[-][\\d]{4}$";

    /**
     * Phương thức Regex kiểm tra năm nhuận ngày/tháng/năm (dd/mm/yyyy)
     */
    public final static String REGEX_DATE_OF_BIRTH = "^(((0[1-9]|[12][0-9]|30)[-/](0[13-9]|1[012])|31[-/](0[13578]|1[02])" +
            "|(0[1-9]|1[0-9]|2[0-8])[-/]02)[-/][0-9]{4}|29[-/]02[-/]([0-9]{2}" +
            "(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";


    /**
     * Phương thức chuẩn hóa định dạng tên
     * @param name: tên cần chuẩn hóa
     * @return tên đã chuẩn hóa
     */
    public static String standardizedName(String name) {
        String[] arr = name.toLowerCase().trim().split("");
        StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    str.append(arr[i].toUpperCase());
                } else {
                    str.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                str.append(arr[i]);
            }
        }
        return str.toString();
    }

    /**
     * Phương thức nhập giới tính
     *
     * @return trả về giới tính: Nam, Nữ, LBGT
     */
    public static String getSex() {
        System.out.println("Nhập giới tính:\n" +
                "1. Nam.\n" +
                "2. Nữ.\n" +
                "3. LBGT.");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
            switch (choose) {
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                case 3:
                    return "LBGT";
                default:
                    System.out.println("Lựa chọn của bạn sai, vui lòng chọn lại!");
            }
        } while (true);
    }
}
