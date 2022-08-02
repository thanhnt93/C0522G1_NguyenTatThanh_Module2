package case_study.ultis;


import case_study.model.*;
import ontap_final.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WriteFileUtil {

    /**
     * Phương thức viết file không ghi đè
     * @param path: đường dẫn của file
     * @param data: dữ liệu được viết vào
     * @throws IOException : Ném ra ngoại lệ không mong muốn
     */
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    /**
     * Phương thức viết file có ghi đè
     * @param path: đường dẫn của file
     * @param data: dữ liệu được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    private static void writeFileOverride(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    /**
     * Phương thức viết file Employee (không ghi đè)
     * @param path: đường dẫn của file
     * @param employees: danh sách Employee được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    public static void writeEmployeeFile(String path, List<Employee> employees) throws IOException {
        StringBuilder data = new StringBuilder();
        for (Employee employee: employees){
            data.append(employee.getInfo());
        }

        writeFile(path, data.toString());
    }

    /**
     * Phương thức viết file Employee (có ghi đè)
     * @param path: đường dẫn của file
     * @param employees: danh sách Employee được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    public static void writeEmployeeOverride(String path, List<Employee> employees) throws IOException {
        StringBuilder data = new StringBuilder();
        for (Employee employee: employees){
            data.append(employee.getInfo());
        }

        writeFileOverride(path, data.toString());
    }

    /**
     * Phương thức viết file Customer (không ghi đè)
     * @param path: đường dẫn của file
     * @param customers: danh sách Customer được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    public static void writeCustomerFile(String path, List<Customer> customers) throws IOException {
        StringBuilder data = new StringBuilder();
        for (Customer customer: customers){
            data.append(customer.getInfo());
        }

        writeFile(path, data.toString());
    }

    /**
     * Phương thức viết file Customer (có ghi đè)
     * @param path: đường dẫn của file
     * @param customers: danh sách Customer được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    public static void writeCustomerOverride(String path, List<Customer> customers) throws IOException {
        StringBuilder data = new StringBuilder();
        for (Customer customer: customers){
            data.append(customer.getInfo());
        }

        writeFileOverride(path, data.toString());
    }

    /**
     * Phương thức ghi file Villa
     * @param path: đường dẫn của file
     * @param villas: danh sách Villa được viết vào
     * @throws IOException Ném ra ngoại lệ không mong muốn
     */
    public static void writeVillaFile(String path,  Map<Villa, Integer> villas) throws IOException {
        StringBuilder data = new StringBuilder();
        Set<Villa> villaSet = villas.keySet();

        for (Villa villa : villaSet) {
            data.append(villa.getInfo()).append(",").append(villas.get(villa)).append("\n");
        }
        writeFile(path, data.substring(0, data.length() - 1));
    }

    /**
     * Phương thức ghi file House
     * @param path: đường dẫn của file
     * @param houses: danh sách House được viết vào
     * @throws IOException Ném ra ngoại lệ không mong muốn
     */
    public static void writeHouseFile(String path,  Map<House, Integer> houses) throws IOException {
        StringBuilder data = new StringBuilder();
        Set<House> houseSet = houses.keySet();

        for (House house : houseSet) {
            data.append(house.getInfo()).append(",").append(houses.get(house)).append("\n");
        }
        writeFile(path, data.substring(0, data.length() - 1));
    }

    /**
     * Phương thức ghi file Room
     * @param path: đường dẫn của file
     * @param rooms: danh sách Room được viết vào
     * @throws IOException Ném ra ngoại lệ không mong muốn
     */
    public static void writeRoomFile(String path,  Map<Room, Integer> rooms) throws IOException {
        StringBuilder data = new StringBuilder();
        Set<Room> roomSet = rooms.keySet();

        for (Room room : roomSet) {
            data.append(room.getInfo()).append(",").append(rooms.get(room)).append("\n");
        }
        writeFile(path, data.substring(0, data.length() - 1));
    }

}
