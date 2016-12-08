package org.vionov.test.scjp;

public  class Fruit {
    public void eat(){
        System.out.println("NomNomNom");
    }
}

class Apple extends Fruit{
    public void grow(){
        System.out.println("I'm growing");
    }
    public static void main(String[] args) throws InterruptedException {
        Fruit fruit = new Apple();
        fruit.eat(); //Метод eat описан в суперклассе, мы можем к нему обращаться
        //fruit.ow(); //Ошибка! Метод grow специфичен для класса Apple, поэтому мы не можем обращаться к нему через переменную типа Fruit
    }
}