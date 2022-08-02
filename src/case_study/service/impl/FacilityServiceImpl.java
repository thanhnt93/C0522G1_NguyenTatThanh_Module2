package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.service.IFacilityService;
import case_study.ultis.ReadFileUtil;
import case_study.ultis.Regex;
import case_study.ultis.WriteFileUtil;


import java.io.IOException;
import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private static final String PATH_VILLA = "src/case_study/data/villa.csv";
    private static final String PATH_HOUSE = "src/case_study/data/house.csv";
    private static final String PATH_ROOM = "src/case_study/data/room.csv";
    private final static Scanner SCANNER = new Scanner(System.in);


    /**
     * Phương thức thêm dịch vụ, 1 - thêm villa, 2 - thêm house, 3 - thêm room
     */
    @Override
    public void add() {
        do {
            try {
                System.out.print("--THÊM DỊCH VỤ-- \n" +
                        "1. Thêm Villa\n" +
                        "2. Thêm House\n" +
                        "3. Thêm Room\n" +
                        "4. Trở về MENU Quản lí cơ sở\n" +
                        "Mời bạn chọn: ");
                int choose = Integer.parseInt(SCANNER.nextLine());
                System.out.println("--------------------------------------------");
                switch (choose) {
                    case 1:
                        Map<Villa, Integer> addVilla = null;
                        try {
                            addVilla = new LinkedHashMap<>();
                            addVilla = infoVilla();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Thêm mới thành công!. ");
                        try {
                            WriteFileUtil.writeVillaFile(PATH_VILLA, addVilla);
                            addVilla.remove(0);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("--------------------------------------------");
                        break;
                    case 2:
                        Map<House, Integer> addHouse = null;
                        try {
                            addHouse = new LinkedHashMap<>();
                            addHouse = infoHouse();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Thêm mới thành công!. ");
                        try {
                            WriteFileUtil.writeHouseFile(PATH_HOUSE, addHouse);
                            addHouse.remove(0);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("--------------------------------------------");
                        break;
                    case 3:
                        Map<Room, Integer> addRoom = null;
                        try {
                            addRoom = new LinkedHashMap<>();
                            addRoom = infoRoom();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Thêm mới thành công!. ");
                        try {
                            WriteFileUtil.writeRoomFile(PATH_ROOM, addRoom);
                            addRoom.remove(0);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("--------------------------------------------");
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Không có trong Menu, vui lòng chọn lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số thứ tự trong MENU, không nhập kí tự đặc biệt");
            }
        } while (true);
    }

    /**
     * Phương thức hiển thị 3 dịch vụ: Villa, House, Room
     * 1 -> Viila, 2 -> House, 3 -> Room
     */
    @Override
    public void display() {
        do {
            try {
                System.out.print("--HIỂN THỊ DỊCH VỤ-- \n" +
                        "1. Hiển thị Villa\n" +
                        "2. Hiển thị House\n" +
                        "3. Hiển thị Room\n" +
                        "4. Trở về MENU Quản lí cơ sở\n" +
                        "Mời bạn chọn: ");
                int choose = Integer.parseInt(SCANNER.nextLine());
                System.out.println("--------------------------------------------");
                switch (choose) {
                    case 1:
                        try {
                            Map<Villa, Integer> villas = ReadFileUtil.readVillaFile(PATH_VILLA);

                            Set<Villa> villaSet = villas.keySet();

                            for (Villa villa : villaSet) {
                                System.out.println(villa + " - Value: " + villas.get(villa));
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("--------------------------------------------");
                        break;
                    case 2:
                        try {
                            Map<House, Integer> houses = ReadFileUtil.readHouseFile(PATH_HOUSE);

                            Set<House> houseSet = houses.keySet();

                            for (House house : houseSet) {
                                System.out.println(house + " - Value: " + houses.get(house));
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("--------------------------------------------");
                        break;
                    case 3:
                        try {
                            Map<Room, Integer> rooms = ReadFileUtil.readRoomFile(PATH_ROOM);

                            Set<Room> roomSet = rooms.keySet();

                            for (Room room : roomSet) {
                                System.out.println(room + " - Value: " + rooms.get(room));
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("--------------------------------------------");
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Không có trong Menu, vui lòng chọn lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số thứ tự trong MENU, không nhập kí tự đặc biệt");
            }

        } while (true);
    }

    /**
     * Phương thức nhập thông tin Villa
     *
     * @return trả về thông tin Villa
     * @throws IOException lỗi ngoại lệ
     */
    public static Map<Villa, Integer> infoVilla() throws Exception {
        Map<Villa, Integer> villas = ReadFileUtil.readVillaFile(PATH_VILLA);

        System.out.println("--NHẬP THÔNG TIN VILLA--");
        System.out.print("Nhập mã dịch vụ: ");
        String serviceCode;

        while (true) {
            try {
                Set<Villa> villaSet = villas.keySet();
                serviceCode = SCANNER.nextLine();
                System.out.println("Mã dịch vụ : " + serviceCode);
                if (serviceCode.matches(Regex.REGEX_VILLA)) {
                    for (Villa villa : villaSet) {
                        if (villa.getServiceCode().equals(serviceCode)) {
                            throw new DuplicateIDException("Mã dịch vụ đã có,vui lòng nhập lại:");
                        }
                    }
                } else {
                    System.out.print("Bạn nhập sai, vui lòng nhập lại (SVVL-XXXX): ");
                    continue;
                }
                break;
            } catch (NumberFormatException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        String serviceName;
        while (true) {
            System.out.print("Nhập tên dịch vụ: ");
            serviceName = SCANNER.nextLine();
            if (serviceName.matches(Regex.REGEX_NAME)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại");
            }
        }

        double areaUse;
        while (true) {
            System.out.print("Nhập diện tích sử dụng: ");
            areaUse = Double.parseDouble(SCANNER.nextLine());
            if (String.valueOf(areaUse).matches(Regex.REGEX_AREA)) {
                if (areaUse > 30) {
                    break;
                } else {
                    System.out.println("Diện tích phải > 30, vui lòng nhập lại.");
                }
            } else {
                System.out.println("Diện tích phải > 30, vui lòng nhập lại.");
            }
        }


        double rentalCosts;
        while (true) {
            System.out.print("Nhập chi phí thuê: ");
            rentalCosts = Double.parseDouble(SCANNER.nextLine());
            if (String.valueOf(rentalCosts).matches(Regex.REGEX_PRICE)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại, phải là số nguyên dương");
            }
        }

        int maxNumberOfPeople;
        while (true) {
            System.out.print("Nhập số lượng người tối đa: ");
            maxNumberOfPeople = Integer.parseInt(SCANNER.nextLine());
            if (String.valueOf(maxNumberOfPeople).matches(Regex.REGEX_MAXIMUM_NUMBER_OF_PEOPLE)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại, 0 < n < 20");
            }
        }
        String rentalType;
        while (true) {
            System.out.print("Nhập kiểu thuê: ");
            rentalType = SCANNER.nextLine();
            if (rentalType.matches(Regex.REGEX_NAME)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại");
            }
        }

        String roomStandard;
        while (true) {
            System.out.print("Nhập tiêu chuẩn phòng: ");
            roomStandard = SCANNER.nextLine();
            if (roomStandard.matches(Regex.REGEX_NAME)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại");
            }
        }

        double areaPool;
        while (true) {
            System.out.print("Nhập diện tích hồ bơi: ");
            areaPool = Double.parseDouble(SCANNER.nextLine());
            if (String.valueOf(areaPool).matches(Regex.REGEX_AREA)) {
                if (areaPool > 30) {
                    break;
                } else {
//                    throw new Exception("Diện tích phải > 30, vui lòng nhập lại.");
                    System.out.println("Diện tích phải > 30, vui lòng nhập lại.");
                }
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại, > 30");
            }
        }

        int numberOfFloors;
        while (true) {
            System.out.print("Nhập số tầng: ");
            numberOfFloors = Integer.parseInt(SCANNER.nextLine());
            if (String.valueOf(numberOfFloors).matches(Regex.REGEX_NUMBER_OF_FLOORS)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại, >0 ");
            }
        }
        Villa villa = new Villa(serviceCode, serviceName, areaUse, rentalCosts, maxNumberOfPeople, rentalType, roomStandard, areaPool, numberOfFloors);
        villas.put(villa, 0);
        Set<Villa> villaSet = villas.keySet();
        for (Villa villa1 : villaSet) {
            villas.put(villa1, villas.get(villa1) + 1);
        }
        return villas;
    }


    /**
     * Phương thức nhập thông tin dịch vụ House
     *
     * @return trả về thông tin House
     * @throws Exception Ném ra ngoại lệ
     */
    public static Map<House, Integer> infoHouse() throws Exception {
        Map<House, Integer> houses = ReadFileUtil.readHouseFile(PATH_HOUSE);

        System.out.println("--NHẬP THÔNG TIN HOUSE--");
        System.out.print("Nhập mã dịch vụ: ");
        String serviceCode;

        while (true) {
            try {
                Set<House> houseSet = houses.keySet();
                serviceCode = SCANNER.nextLine();
                System.out.println("Mã dịch vụ : " + serviceCode);

                if (serviceCode.matches(Regex.REGEX_HOUSE)) {
                    for (House house : houseSet) {
                        if (house.getServiceCode().equals(serviceCode)) {
                            throw new DuplicateIDException("Mã dịch vụ đã có,vui lòng nhập lại:");
                        }
                    }
                } else {
                    System.out.print("Bạn nhập sai, vui lòng nhập lại (SVHO-XXXX): ");
                    continue;
                }
                break;
            } catch (NumberFormatException | DuplicateIDException e) {
//                System.out.println("Bạn có chắc mình nhập đúng,hãy nhập lại");
                System.out.println(e.getMessage());
            }
        }


        String serviceName;
        while (true) {
            System.out.print("Nhập tên dịch vụ: ");
            serviceName = SCANNER.nextLine();
            if (serviceName.matches(Regex.REGEX_NAME)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại");
            }
        }

        double areaUse;
        while (true) {
            System.out.print("Nhập diện tích sử dụng: ");
            areaUse = Double.parseDouble(SCANNER.nextLine());
            if (String.valueOf(areaUse).matches(Regex.REGEX_AREA)) {
                if (areaUse > 30) {
                    break;
                } else {
//                    throw new Exception("Diện tích phải > 30, vui lòng nhập lại.");
                    System.out.println("Diện tích phải > 30, vui lòng nhập lại.");
                }
            } else {
                System.out.println("Diện tích phải > 30, vui lòng nhập lại.");
            }
        }


        double rentalCosts;
        while (true) {
            System.out.print("Nhập chi phí thuê: ");
            rentalCosts = Double.parseDouble(SCANNER.nextLine());
            if (String.valueOf(rentalCosts).matches(Regex.REGEX_PRICE)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại, phải là số nguyên dương");
            }
        }

        int maxNumberOfPeople;
        while (true) {
            System.out.print("Nhập số lượng người tối đa: ");
            maxNumberOfPeople = Integer.parseInt(SCANNER.nextLine());
            if (String.valueOf(maxNumberOfPeople).matches(Regex.REGEX_MAXIMUM_NUMBER_OF_PEOPLE)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại, 0 < n < 20");
            }
        }

        String rentalType;
        while (true) {
            System.out.print("Nhập kiểu thuê: ");
            rentalType = SCANNER.nextLine();
            if (rentalType.matches(Regex.REGEX_NAME)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại");
            }
        }

        String roomStandard;
        while (true) {
            System.out.print("Nhập tiêu chuẩn phòng: ");
            roomStandard = SCANNER.nextLine();
            if (roomStandard.matches(Regex.REGEX_NAME)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại");
            }
        }


        int numberOfFloors;
        while (true) {
            System.out.print("Nhập số tầng: ");
            numberOfFloors = Integer.parseInt(SCANNER.nextLine());
            if (String.valueOf(numberOfFloors).matches(Regex.REGEX_NUMBER_OF_FLOORS)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại, >0 ");
            }
        }

        House house = new House(serviceCode, serviceName, areaUse, rentalCosts, maxNumberOfPeople, rentalType, roomStandard, numberOfFloors);
        houses.put(house, 0);
        Set<House> houseSet = houses.keySet();
        for (
                House house1 : houseSet) {
            houses.put(house1, houses.get(house1) + 1);
        }
        return houses;
    }


    /**
     * Phương thức nhập thông tin room
     *
     * @return trả về thông tin room
     * @throws Exception ngoại lệ ném ra
     */
    public static Map<Room, Integer> infoRoom() throws Exception {
        Map<Room, Integer> rooms = ReadFileUtil.readRoomFile(PATH_ROOM);

        System.out.println("--NHẬP THÔNG TIN ROOM--");
        System.out.print("Nhập mã dịch vụ: ");
        String serviceCode;

        while (true) {
            try {
                Set<Room> roomSet = rooms.keySet();
                serviceCode = SCANNER.nextLine();
                System.out.println("Mã dịch vụ : " + serviceCode);
                if (serviceCode.matches(Regex.REGEX_ROOM)) {
                    for (Room room : roomSet) {
                        if (room.getServiceCode().equals(serviceCode)) {
                            throw new DuplicateIDException("Mã dịch vụ đã có, vui lòng nhập lại:");
                        }
                    }
                } else {
                    System.out.print("Bạn nhập sai, vui lòng nhập lại (SVRO-XXXX): ");
                    continue;
                }
                break;
            } catch (NumberFormatException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }


        String serviceName;
        while (true) {
            System.out.print("Nhập tên dịch vụ: ");
            serviceName = SCANNER.nextLine();
            if (serviceName.matches(Regex.REGEX_NAME)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại");
            }
        }

        double areaUse;
        while (true) {
            System.out.print("Nhập diện tích sử dụng: ");
            areaUse = Double.parseDouble(SCANNER.nextLine());
            if (String.valueOf(areaUse).matches(Regex.REGEX_AREA)) {
                if (areaUse > 30) {
                    break;
                } else {
//                    throw new Exception("Diện tích phải > 30, vui lòng nhập lại.");
                    System.out.println("Diện tích phải > 30, vui lòng nhập lại.");
                }
            } else {
                System.out.println("Diện tích phải > 30, vui lòng nhập lại.");
            }
        }


        double rentalCosts;
        while (true) {
            System.out.print("Nhập chi phí thuê: ");
            rentalCosts = Double.parseDouble(SCANNER.nextLine());
            if (String.valueOf(rentalCosts).matches(Regex.REGEX_PRICE)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại, phải là số nguyên dương");
            }
        }

        int maxNumberOfPeople;
        while (true) {
            System.out.print("Nhập số lượng người tối đa: ");
            maxNumberOfPeople = Integer.parseInt(SCANNER.nextLine());
            if (String.valueOf(maxNumberOfPeople).matches(Regex.REGEX_MAXIMUM_NUMBER_OF_PEOPLE)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại, 0 < n < 20");
            }
        }
        String rentalType;
        while (true) {
            System.out.print("Nhập kiểu thuê: ");
            rentalType = SCANNER.nextLine();
            if (rentalType.matches(Regex.REGEX_NAME)) {
                break;
            } else {
                System.out.println("Bạn nhập sai, vui lòng nhập lại");
            }
        }
        System.out.print("Nhập dịch vụ miễn phí đi kèm: ");
        String freeServiceIncluded = SCANNER.nextLine();


        Room room = new Room(serviceCode, serviceName, areaUse, rentalCosts, maxNumberOfPeople, rentalType, freeServiceIncluded);
        rooms.put(room, 0);
        Set<Room> roomSet = rooms.keySet();
        for (Room room1 : roomSet) {
            rooms.put(room1, rooms.get(room1) + 1);
        }
        return rooms;
    }
}
