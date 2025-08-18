package org.example.collections.ex4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonTest {

    public static class Person {
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private int age;

        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }
    }

    public static class CustomComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {

            if (o1.getAge() > o2.getAge()) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }

            return 0;
        }
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Charlie", 25));
        people.add(new Person("Bob", 20));
        people.add(new Person("David", 40));

        System.out.println("=== 정렬 전 (원본 리스트) ===");
        System.out.println(people);

        List<Person> sortedByAge = people.stream()
                .sorted(new CustomComparator())
                .toList();
        System.out.println("=== 나이 기준 오름차순 정렬 (Stream + PersonAgeComparator) ===");
        System.out.println(sortedByAge);

    }

}
