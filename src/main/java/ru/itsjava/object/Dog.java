package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog {
    private final String nickName;
    private int rowsCount;

//    public Dog(String nickName, int rowsCount){
//        this.nickName = nickName;
//        this.rowsCount = rowsCount;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Dog dog = (Dog) o;
//
//        if (rowsCount != dog.rowsCount) return false;
//        return nickName.equals(dog.nickName);
//    }
//
//    @Override
//    public int hashCode() {
//        return nickName.hashCode();
//    }
}
