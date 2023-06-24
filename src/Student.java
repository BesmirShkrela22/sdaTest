public class Student {
public String name;
public String surname;
public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Student(String name, String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;

}
    public void getAverageAge(){
        int mosha[]=new int[]{ };
        int shuma=0;

        for(int i=0;i< mosha.length;i++){
            shuma = shuma + mosha[i];
            double mesatarja=(shuma/ mosha.length);

        }

    }

}
//1.Krijo nje klase Student qe do te permbaje disa variable instance, name, surname,age dhe
//        grades. Te krijohet konstruktori qe inicializon te gjitha variablat e instances si dhe metodat
//        get/set. Gjithashtu te krijohet klasa University qe do te permbaje nje liste me student. Te
//        krijohet metoda findTheAverage() e cila gjen mesataren e cdo studenti. Per te testuar
//        metoden e krijuar nderto disa objekte te klases Student ne klasen Main dhe therrit metoden
//        findAverage().
