package ss10_dsa_list.exercise.arraylist.service.impl;

import ss10_dsa_list.exercise.arraylist.service.IStudentService;
import ss10_dsa_list.exercise.arraylist.model.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentService<E> implements IStudentService {
    public static List<Object> people = new ArrayList<>();
    static {

        people.add(new Student(1, "Văn Phúc"));
        people.add(new Student(2, "Thủy Tiên"));
        people.add(new Student(3, "Tất Thành"));
        people.add(new Student(4, "Bùi Hùng"));
        people.add(new Student(5, "Tấn Huân"));
        people.add(new Student(6, "Minh Tiến"));

    }
    /**
     * Số lượng phần tử trong MyArrayList
     */
    private int size = 0;

    /**
     * Sức chứa mặc định trong ArrayList
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Mảng đối tượng elements chứa các phần tử trong MyArrayList
     */
    public Object element[];

    /**
     * Sức chứa mặc định khi khởi tạo bằng contructor không có tham số
     */
    public StudentService() {
        element = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Phương thưc contructor với sức chứa được truyền vào
     *
     * @param capacity
     */
    public StudentService(int capacity) {
        if (capacity >= 0) {
            element = new Object[capacity];
        } else {
            throw new
                    IllegalArgumentException("capacity: " + capacity);
        }
    }

    /**
     * Phương thức trả về số phần tử
     *
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Phương thức clear của StudentService
     */
    @Override
    public void clear() {
        size = 0;
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
    }

    /**
     * Phương thức add 1 phần tử vào StudentService
     *
     * @param elements
     * @return true
     */
    @Override
    public boolean add(Object elements) {
        if (element.length == size) {
            this.ensureCapacity(5);
        }
        element[size] = elements;
        size++;
        return true;
    }

    @Override
    public void add(Object elements, int index) {
        if (index > element.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (element.length == size) {
            this.ensureCapacity(5);
        }

        if (element[index] == null) {
            element[index] = elements;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                element[i] = element[i - 1];
            }
            element[index] = element;
            size++;
        }
    }


    /**
     * Phương thức tăng kích thước ArrayList
     */
    @Override
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        } else {
            throw new
                    IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    /**
     * Phương thức lấy 1 element tại vị trí index
     *
     * @param index
     * @return
     */
    @Override
    public E get(int index) {
        return (E) element[index];
    }


    /**
     * Phương thức lấy index của 1 phần tử
     *
     * @param element
     * @return
     */
    @Override
    public int indexOf(Object element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.element[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    /**
     * Phương thức kiểm tra 1 phần tử có trong StudentService hay không ?
     *
     * @param elenment
     * @return
     */
    @Override
    public boolean contains(Object elenment) {
        return this.indexOf(elenment) >= 0;
    }


    /**
     * Phương thức tạo ra 1 bản sao của StudentService hiện tại
     *
     * @return
     */
    @Override
    public StudentService<Object> clone() {
        StudentService<Object> eStudentService = new StudentService<>();
        eStudentService.element = Arrays.copyOf(this.element, this.size);
        eStudentService.size = this.size;
        return eStudentService;
    }


    /**
     * Phương thức xóa phần tử tại vị trí Index
     *
     * @param index
     * @return
     */
    @Override
    public Object remove(int index) {
        if (index < 0 || index > element.length) {
            throw new IllegalArgumentException("Error index" + index);
        }
        E elements = (E) element[index];
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return elements;
    }

    @Override
    public void findAll() {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i) instanceof Student) {
                System.out.println(people.get(i));
            }
        }

    }


}
