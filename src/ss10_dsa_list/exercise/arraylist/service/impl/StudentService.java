package ss10_dsa_list.exercise.arraylist.service.impl;

import ss10_dsa_list.exercise.arraylist.service.IStudentService;

import java.util.Arrays;

public class StudentService<E> implements IStudentService {
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
    public int size() {
        return this.size;
    }

    /**
     * Phương thức clear của StudentService
     */
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
    public boolean add(E elements) {
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

//    public void add(E elements, int index){
//        if(index > element.length){
//            throw new IllegalArgumentException("Index: " + index);
//        } else if(element.length == size){
//            this.ensureCapacity(5);
//        }
//
//        if(element[index] == null){
//            element[index] = elements;
//            size++;
//        } else {
//            for (int i = size + 1; i >= index; i--){
//                element[i] = element[i - 1];
//            }
//            element[index] = element;
//            size++;
//        }
//    }

    /**
     * Phương thức tăng kích thước ArrayList
     */
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
     * Phương thức lấy 1 elemnet tại vị trí index
     *
     * @param index
     * @return
     */
    public E get(int index) {
        return (E) element[index];
    }


    /**
     * Phương thức lấy index của 1 phần tử
     *
     * @param element
     * @return
     */
    public int indexOf(E element) {
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
    public boolean contains(E elenment) {
        return this.indexOf(elenment) >= 0;
    }


    /**
     * Phương thức tạo ra 1 bản sao của StudentService hiện tại
     *
     * @return
     */
    public StudentService<E> clone() {
        StudentService<E> eStudentService = new StudentService<>();
        eStudentService.element = Arrays.copyOf(this.element, this.size);
        eStudentService.size = this.size;
        return eStudentService;
    }


    /**
     * Phương thức xóa phần tử tại vị trí Inde
     *
     * @param index
     * @return
     */
    public E remove(int index) {
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


}
