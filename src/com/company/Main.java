/*package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main
{
     static class Users
     {
        String Name;
        int Age;

        public Users(String Name, int Age)
        {
            this.Name=Name;
            this.Age=Age;
        }

         @Override // Это перегрузка toString();
         public String toString()
         {
             return "Имя: " + getName() + ", " + getAge() + " лет ";
         }
         public String getName() { return Name; }
         public int getAge() { return Age; }
    }

    public static void main(String[] args)
    {
        List<Users> users1 = new ArrayList<Users>();

        users1.add(new Users("Карп", 35));
        users1.add(new Users("Дуб", 42));
        users1.add(new Users("Стэлкард", 39));

        for(Users i : users1)
        {
            System.out.println(i.toString());
        }
    }
}*/

package com.company;
import java.util.ArrayList;
import java.util.Comparator;
import java.lang.*;

interface Comparable<Users>
{
    public Integer compareTo(Users users);
}

class SortByName implements Comparable <Users>
{
    public String name;
    public Integer age;

    public void Users(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public Integer compareTo(Users users)
    {
        int result = this.name.compareTo(users.getName());
        if (result == 0)
        {
            result = this.age.compareTo(users.getAge());
        }
        return result;
    }

    @Override
    public String toString()
    {
        return "name = " + name + ", age = " + age;
    }
}

class Users
{
    String Name;
    Integer Age;

    public Users(String Name, Integer Age)
    {
        this.Name = Name;
        this.Age = Age;
    }

    @Override
    public String toString()
    {
        return "Имя: " + getName() + ", " + getAge() + " лет ";
    }

    public String getName()
    {
        return Name;
    }

    public Integer getAge()
    {
        return Age;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Users> list = new ArrayList<Users>();

//        Users Carp = new Users("Carp",35);
//        Users Stalkard = new Users("Stalkard",45);
//        Users Ded = new Users("Ded",65);
//        Users Dub = new Users("Dub",25);
//        list.add(Carp);
//        list.add(Stalkard);
//        list.add(Ded);
//        list.add(Dub);

        list.add(new Users("Carp", 35));
        list.add(new Users("Stalkard", 45));
        list.add(new Users("Ded", 65));
        list.add(new Users("Dub", 25));

        System.out.println("------------------------------");
        list.sort(Comparator.comparingInt(Users::getAge));
        for (Users users : list)
        {
            System.out.println(users);
        }
        System.out.println("------------------------------");
        list.sort(Comparator.comparing(Users::getName));
        for (Users users : list)
        {
            System.out.println(users);
        }
        System.out.println("------------------------------");
    }
}