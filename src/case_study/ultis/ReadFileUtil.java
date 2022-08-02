package case_study.ultis;


import case_study.model.*;
import ontap_final.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFileUtil {
    /**
     * Phương thức đọc file
     *
     * @param path: đường dẫn file cần đọc
     * @return Danh sách các dòng đọc trong file
     * @throws IOException : Nếu file không tồn tại thì sẽ ném lỗi này
     */
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();

//        bufferedReader.readLine(); //Nếu có tiêu đề =>> Line này loại bỏ tiêu đề
        while ((line = bufferedReader.readLine()) != null) {
            if (!line.equals("")){
                strings.add(line);
            }
        }
        bufferedReader.close();

        return strings;
    }

    /**
     * Phương thức đọc file Student
     *
     * @param path: đường dẫn chưa file
     * @return Danh sách Student
     * @throws IOException: Nếu file không tồn tại
     */
    public static List<Employee> readEmployeeFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Employee> employees = new ArrayList<>();

        String[] info;
        for (String line : strings) {
            info = line.split(",");
            employees.add(new Employee(Integer.parseInt(info[0]), info[1], info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]), info[6], info[7], info[8], Integer.parseInt(info[9])));
        }

        return employees;
    }

    /**
     * Phương thức đọc file Customer
     *
     * @param path: đường dẫn chưa file
     * @return Danh sách Customer
     * @throws IOException: Nếu file không tồn tại
     */
    public static List<Customer> readCustomerFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Customer> customers = new ArrayList<>();

        String[] info;
        for (String line : strings) {
            info = line.split(",");
            customers.add(new Customer(Integer.parseInt(info[0]), info[1], info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]), info[6], info[7], info[8]));
        }

        return customers;
    }

    /**
     * Phương thức đọc file dịch vụ Villa
     * @param path: Đường dẫn file dịch vụ Villa
     * @return Trả về Map theo key: Villa, value: Integer
     * @throws IOException: ném lỗi ngoại lệ
     */
    public static Map<Villa, Integer> readVillaFile(String path) throws IOException {
        List<String> strings = readFile(path);
        Map<Villa, Integer> vilas = new LinkedHashMap<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            Villa villa = new Villa(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]),
                    Integer.parseInt(info[4]), info[5], info[6], Double.parseDouble(info[7]), Integer.parseInt(info[8]));
            vilas.put(villa, Integer.parseInt(info[9]));
        }

        return vilas;
    }

    /**
     * Phương thức đọc file dịch vụ House
     * @param path: Đường dẫn file dịch vụ House
     * @return Trả về Map theo key: House, value: Integer
     * @throws IOException: ném lỗi ngoại lệ
     */
    public static Map<House, Integer> readHouseFile(String path) throws IOException {
        List<String> strings = readFile(path);
        Map<House, Integer> houses = new LinkedHashMap<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            House house = new House(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6], Integer.parseInt(info[7]));
            houses.put(house, Integer.parseInt(info[8]));
        }

        return houses;
    }

    /**
     * Phương thức đọc file dịch vụ Room
     * @param path: Đường dẫn file dịch vụ Room
     * @return Trả về Map theo key: Room, value: Integer
     * @throws IOException: ném lỗi ngoại lệ
     */
    public static Map<Room, Integer> readRoomFile(String path) throws IOException {
        List<String> strings = readFile(path);
        Map<Room, Integer> rooms = new LinkedHashMap<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            Room room = new Room(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6]);
            rooms.put(room, Integer.parseInt(info[7]));
        }

        return rooms;
    }

}
