package org.example.objectorientedprogramming.ex2;

import java.time.LocalDateTime;
import java.util.Arrays;

class CoffeeMachine {
    private String machineName;
    private String color;
    private int weight;
    private int degree = 0;
    private String company;
    private int beanCapacity = 0;
    private boolean isOn = false;
    private int waterCapacity = 0;
    private LocalDateTime lastCleanedTime;
    private int beanTrashCapacity = 0;
    private String bean;
    private String[] coffeeType;
    private int coffeeSize;
    boolean hasSteam = false;

    public CoffeeMachine(String machineName, String color, int weight, String company, LocalDateTime lastCleanedTime, String bean, String[] coffeeType, int coffeeSize) {
        this.machineName = machineName;
        this.color = color;
        this.weight = weight;
        this.company = company;
        this.lastCleanedTime = lastCleanedTime;
        this.bean = bean;
        this.coffeeType = coffeeType;
        this.coffeeSize = coffeeSize;
    }

    public void setCoffeeSize(int coffeeSize) {
        this.coffeeSize = coffeeSize;
        System.out.println("커피 용량을 " + this.coffeeSize + "로 변경합니다.");
    }

    public void powerOn() {
        isOn = true;
        System.out.println("전원을 켭니다.");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("전원을 끕니다.");
    }

    public void setDegree(int degree) {
        this.degree = degree;
        System.out.println("온도를 " + this.degree + "도로 변경합니다.");
    }

    public void addSteam() {
        hasSteam = true;
        System.out.println("스팀을 추가합니다.");
    }

    public void removeSteam() {
        hasSteam = false;
        System.out.println("스팀을 제거합니다.");
    }

    public void addBean(int beanCapacity) {
        this.beanCapacity += beanCapacity;
        System.out.println("원두를 " + beanCapacity + "개 추가합니다.");
    }

    public void addWater(int waterCapacity) {
        this.waterCapacity += waterCapacity;
        System.out.println("물을 " + beanCapacity + "리터 추가합니다.");
    }

    public boolean checkCapacity() {
        System.out.println("현재 원두는 " + beanCapacity + " 남았습니다.");
        System.out.println("현재 물은 " + waterCapacity + " 만큼 남았습니다.");
        System.out.println("현재 쓰레기통은 " + beanTrashCapacity + "만큼 찼습니다");

        return beanCapacity == 0 || beanCapacity - coffeeSize == 0 ||  beanTrashCapacity == 10;
    }

    public void cleanTrash() {
        this.beanCapacity = 0;
        System.out.println("쓰레기통을 비웁니다.");
    }

    public void makeCoffee() {

        if (waterCapacity - coffeeSize < 0 || beanCapacity - coffeeSize < 0) {
            System.out.println("물 또는 원두가 충분하지 않습니다.");
        } else {
            waterCapacity -= coffeeSize;
            beanCapacity -= coffeeSize;
            System.out.println(coffeeSize + "만큼의 커피를 탑니다.");
        }

    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "machineName='" + machineName + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", degree=" + degree +
                ", company='" + company + '\'' +
                ", beanCapacity=" + beanCapacity +
                ", isOn=" + isOn +
                ", waterCapacity=" + waterCapacity +
                ", lastCleanedTime=" + lastCleanedTime +
                ", beanTrashCapacity=" + beanTrashCapacity +
                ", bean='" + bean + '\'' +
                ", coffeeType=" + Arrays.toString(coffeeType) +
                ", coffeeSize=" + coffeeSize +
                ", hasSteam=" + hasSteam +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

        CoffeeMachine cm = new CoffeeMachine(
                "CM-900",        // machineName
                "Silver",        // color
                20,              // weight
                "DeLonghi",      // company
                LocalDateTime.now(), // lastCleanedTime// beanTrashCapacity
                "Arabica",       // bean
                new String[]{"Espresso", "Latte", "Americano"}, // coffeeType
                250              // coffeeSize
        );

        cm.powerOn();
        cm.addBean(1000);
        cm.addWater(1000);
        cm.setDegree(100);
        cm.addSteam();
        cm.makeCoffee();
        if (cm.checkCapacity()) {
            System.out.println("물 또는 원두 혹은 쓰레기통이 꽉찼습니다");
        } else {

        }
        cm.cleanTrash();
        cm.setCoffeeSize(1000);
        cm.removeSteam();
        cm.makeCoffee();

        System.out.println(cm.toString());

        cm.powerOff();

    }

}
