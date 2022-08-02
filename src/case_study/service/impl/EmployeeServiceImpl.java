package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.Employee;
import case_study.service.IEmployeeService;
import case_study.ultis.ReadFileUtil;
import case_study.ultis.Regex;
import case_study.ultis.WriteFileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private final static Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/case_study/data/employee.csv";

    /**
     * Phương thức thêm thông tin nhân viên
     */
    @Override
    public void add() {
        List<Employee> addEmployee = new ArrayList<>();
        Employee employee = null;
        try {
            employee = infoEmployee();
        } catch (IOException e) {
            e.printStackTrace();
        }
        addEmployee.add(employee);
        System.out.println("Thêm mới thành công!. ");
        try {
            WriteFileUtil.writeEmployeeFile(PATH, addEmployee);
            employeeList.add(employee);
            addEmployee.remove(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Phương thức hiển thị tất cả thông tin nhân viên
     */
    @Override
    public void display() {
        try {
            employeeList = ReadFileUtil.readEmployeeFile(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void update() {
        try {
            employeeList = ReadFileUtil.readEmployeeFile(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Mời bạn nhập ID nhân viên cần update: ");
        int idUpdate;
        while (true) {
            try {
                idUpdate = Integer.parseInt(SCANNER.nextLine());
                boolean isFlag = false;
                for (Employee employee : employeeList) {
                    if (employee.getId() == idUpdate) {

                        System.out.print("Nhập tên nhân viên: ");
                        String name = Regex.standardizedName(SCANNER.nextLine());
                        employee.setName(name);

                        String dateOfBirth;
                        while (true) {
                            System.out.print("Nhập ngày sinh: ");
                            dateOfBirth = SCANNER.nextLine();
                            if (dateOfBirth.matches(Regex.REGEX_DATE_OF_BIRTH)) {
                                break;
                            } else {
                                System.out.println("Bạn nhập sai, vui lòng nhập lại");
                            }
                        }
                        employee.setDateOfBirth(dateOfBirth);

                        String sex = Regex.getSex();
                        employee.setSex(sex);

                        System.out.print("Nhập số CMND: ");
                        int IDNumber = Integer.parseInt(SCANNER.nextLine());
                        employee.setIDNumber(IDNumber);

                        System.out.print("Nhập số điện thoại: ");
                        int phone = Integer.parseInt(SCANNER.nextLine());
                        employee.setPhone(phone);

                        System.out.print("Nhập email: ");
                        String email = SCANNER.nextLine();
                        employee.setEmail(email);

                        String level = getLevel();
                        employee.setLevel(level);

                        System.out.print("Nhập vị trí: ");
                        String location = getLocation();
                        employee.setLocation(location);

                        System.out.print("Nhập lương: ");
                        int salary = Integer.parseInt(SCANNER.nextLine());
                        employee.setSalary(salary);

                        System.out.println("Cập nhập thành công!.");
                        try {
                            WriteFileUtil.writeEmployeeOverride(PATH, employeeList);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        isFlag = true;
                        break;

                    }
                }
                if (!isFlag) {
                    System.out.println("Không tìm thấy");
                }
                return;
            } catch (NumberFormatException e) {
                System.out.println("Bạn có chắc mình nhập đúng ID");
            }
        }
    }


    /**
     * Phương thức nhập thông tin nhân viên
     *
     * @return trả về thông tin nhân viên
     * @throws IOException lỗi ngoại lệ
     */
    public static Employee infoEmployee() throws IOException {
        System.out.println("--NHẬP THÔNG TIN NHÂN VIÊN--");
        System.out.print("Nhập id: ");
        int id;
        employeeList = ReadFileUtil.readEmployeeFile(PATH);
        while (true) {
            try {
                id = Integer.parseInt(SCANNER.nextLine());
                System.out.println("ID : " + id);
                for (Employee employee : employeeList) {
                    if (employee.getId() == id) {
                        throw new DuplicateIDException("ID đã có,vui lòng nhập lại");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn có chắc mình nhập đúng,hãy nhập lại");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập tên nhân viên: ");
        String name = Regex.standardizedName(SCANNER.nextLine());

        String dateOfBirth;
        while (true) {
            System.out.print("Nhập ngày sinh: ");
            dateOfBirth = SCANNER.nextLine();
            if (dateOfBirth.matches(Regex.REGEX_DATE_OF_BIRTH)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại");
            }
        }
        String sex = Regex.getSex();

        System.out.print("Nhập số CMND: ");
        int IDNumber = Integer.parseInt(SCANNER.nextLine());

        System.out.print("Nhập số điện thoại: ");
        int phone = Integer.parseInt(SCANNER.nextLine());

        System.out.print("Nhập email: ");
        String email = SCANNER.nextLine();

        String level = getLevel();

        String location = getLocation();

        System.out.print("Nhập lương: ");
        int salary = Integer.parseInt(SCANNER.nextLine());

        return new Employee(id, name, dateOfBirth, sex, IDNumber, phone, email, level, location, salary);
    }


    /**
     * Phương thức nhập trình độ
     *
     * @return trả về trình độ nhân viên: Trung cấp, Cao đẳng, Đại học, Sau đại học
     */
    private static String getLevel() {
        System.out.println("Nhập trình độ:\n" +
                "1. Trung cấp.\n" +
                "2. Cao đẳng.\n" +
                "3. Đại Học.\n" +
                "4. Sau đại học.");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
            switch (choose) {
                case 1:
                    return "Trung cấp";
                case 2:
                    return "Cao đẳng";
                case 3:
                    return "Đại học";
                case 4:
                    return "Sau đại học";
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, bạn nhập lại");
            }
        } while (true);
    }

    /**
     * Phương thức chọn vị trí nhân viên
     *
     * @return trả về Lễ tân, Phục vụ, Chuyên viên, Giảm sát, Quản lý hoặc giám đốc
     */
    private static String getLocation() {
        System.out.println("Nhập vị trí:\n" +
                "1. Lễ Tân.\n" +
                "2. Phục vụ.\n" +
                "3. Chuyên viên.\n" +
                "4. Giám sát.\n" +
                "5. Quản lý.\n" +
                "6. Giám đốc.");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
            switch (choose) {
                case 1:
                    return "Lễ tân";
                case 2:
                    return "Phục vụ";
                case 3:
                    return "Chuyên viên";
                case 4:
                    return "Giám sát";
                case 5:
                    return "Quản lý";
                case 6:
                    return "Giám đốc";
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, bạn nhập lại");
            }
        } while (true);
    }

}
