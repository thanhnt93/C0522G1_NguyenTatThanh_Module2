package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.Customer;
import case_study.service.ICustomerService;
import case_study.ultis.ReadFileUtil;
import case_study.ultis.Regex;
import case_study.ultis.WriteFileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private final static Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/case_study/data/customer.csv";

    /**
     * Phương thức thêm khách hàng
     */
    @Override
    public void add() {
        List<Customer> addCustomer = new ArrayList<>();
        Customer customer = null;
        try {
            customer = infoCustomer();
        } catch (IOException e) {
            e.printStackTrace();
        }
        addCustomer.add(customer);
        System.out.println("Thêm mới thành công!. ");
        try {
            WriteFileUtil.writeCustomerFile(PATH, addCustomer);
            customerList.add(customer);
            addCustomer.remove(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        try {
            customerList = ReadFileUtil.readCustomerFile(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void update() {
        try {
            customerList = ReadFileUtil.readCustomerFile(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Mời bạn nhập ID khách hàng cần update: ");
        int idUpdate;
        while (true) {
            try {
                idUpdate = Integer.parseInt(SCANNER.nextLine());
                boolean isFlag = false;
                for (Customer customer : customerList) {
                    if (customer.getId() == idUpdate) {

                        System.out.print("Nhập tên khách hàng: ");
                        String name = Regex.standardizedName(SCANNER.nextLine());
                        customer.setName(name);

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
                        customer.setDateOfBirth(dateOfBirth);

                        String sex = Regex.getSex();
                        customer.setSex(sex);

                        System.out.print("Nhập số CMND: ");
                        int IDNumber = Integer.parseInt(SCANNER.nextLine());
                        customer.setIDNumber(IDNumber);

                        System.out.print("Nhập số điện thoại: ");
                        int phone = Integer.parseInt(SCANNER.nextLine());
                        customer.setPhone(phone);

                        System.out.print("Nhập email: ");
                        String email = SCANNER.nextLine();
                        customer.setEmail(email);

                        String typeOfGuest = getTypeOfGuest();
                        customer.setTypeOfGuest(typeOfGuest);


                        System.out.print("Nhập địa chỉ: ");
                        String address = SCANNER.nextLine();
                        customer.setAddress(address);

                        System.out.println("Cập nhập thành công!.");
                        try {
                            WriteFileUtil.writeCustomerOverride(PATH, customerList);
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

    @Override
    public void seachByID() {
        System.out.print("Bạn muốn tìm kiếm theo tên hay id! \n" +
                "1. Tìm kiếm theo id. \n" +
                "2. Tìm kiếm theo tên. \n" +
                "Lựa chọn của bạn: ");
        int choose = Integer.parseInt(SCANNER.nextLine());
        try {
            customerList = ReadFileUtil.readCustomerFile(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean isID = false;
        boolean isName = false;
        if (choose == 1) {
            System.out.print("Mời bạn nhập id khách hàng cần tìm: ");
            int searchId = Integer.parseInt(SCANNER.nextLine());

            for (Customer customer : customerList) {
                if (searchId == customer.getId()) {
                    System.out.println(customer);
                    isID = true;
                    break;
                }
            }
            if (!isID) {
                System.out.println("Không tìm thấy ID");
            }

        } else {
            System.out.print("Mời bạn nhập tên khách hàng cần tìm: ");
            String searchName = SCANNER.nextLine();

            for (Customer customer : customerList) {
                if (customer.getName().toLowerCase().contains(searchName.toLowerCase())) {
                    System.out.println(customer);
                    isName = true;
                    break;
                }
            }
            if(!isName){
                System.out.println("Không tìm thấy tên khách hàng");
            }
        }
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập ID cần xóa");
        int idRemove;
        while (true) {
            try {
                customerList = ReadFileUtil.readCustomerFile(PATH);
                idRemove = Integer.parseInt(SCANNER.nextLine());
                boolean isFlag = false;
                for (Customer customer : customerList) {
                    if (customer.getId() == idRemove) {
                        System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                                "1. Có \n" +
                                "2. Không");
                        int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
                        if (chooseYesNo == 1) {
                            customerList.remove(customer);
                            System.out.println("Xóa thành công!.");

                            try {
                                WriteFileUtil.writeCustomerOverride(PATH, customerList);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        isFlag = true;
                        break;

                    }
                }
                if (!isFlag) {
                    System.out.println("Không tìm thấy");
                }
                return;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Bạn có chắc mình nhập đúng ID");
            }
        }
    }

    /**
     * Phương thức nhập thông tin khách hàng
     *
     * @return trả về thông tin khách hàng
     * @throws IOException lỗi ngoại lệ
     */
    public static Customer infoCustomer() throws IOException {
        System.out.println("--NHẬP THÔNG TIN KHÁCH HÀNG--");
        System.out.print("Nhập id: ");
        int id;
        customerList = ReadFileUtil.readCustomerFile(PATH);
        while (true) {
            try {
                id = Integer.parseInt(SCANNER.nextLine());
                System.out.println("ID : " + id);
                for (Customer customer : customerList) {
                    if (customer.getId() == id) {
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

        System.out.print("Nhập tên khách hàng: ");
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

        String typeOfGuest = getTypeOfGuest();

        System.out.print("Nhập địa chỉ: ");
        String address = SCANNER.nextLine();

        return new Customer(id, name, dateOfBirth, sex, IDNumber, phone, email, typeOfGuest, address);
    }

    /**
     * Phương thức nhập loại khách hàng
     *
     * @return trả về Diamond, Platinium, Gold, Silver, Member
     */
    private static String getTypeOfGuest() {
        System.out.println("Nhập loại khách hàng:\n" +
                "1. Kim cương.\n" +
                "2. Bạch kim.\n" +
                "3. Vàng.\n" +
                "4. Bạc.\n" +
                "5. Thành viên.");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
            switch (choose) {
                case 1:
                    return "Kim cương";
                case 2:
                    return "Bạch kim";
                case 3:
                    return "Vàng";
                case 4:
                    return "Bạc";
                case 5:
                    return "Thành viên";
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, bạn nhập lại");
            }
        } while (true);
    }


}
