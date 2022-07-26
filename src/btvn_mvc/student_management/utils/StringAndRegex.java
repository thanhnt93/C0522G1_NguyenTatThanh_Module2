package btvn_mvc.student_management.utils;

public class StringAndRegex {
    /**
     * Phương thức Regex kiểm tra năm nhuận ngày/tháng/năm (dd/mm/yyyy)
     */
    public final static String REGEXDATEOFBIRTH = "^(((0[1-9]|[12][0-9]|30)[-/](0[13-9]|1[012])|31[-/](0[13578]|1[02])" +
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
}
