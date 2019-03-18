package ru.vbugaenko.stackoverflow.q35701337;

import java.io.Serializable;

class Player implements Serializable {

    private int Id;
    private int Age;
    private String Name;
    private String Surname;
    private int Height;
    private int Salary;
    private String KPI;
    private String Shoes;
    private int Goals;

    Player(int age, String name, String surname, int height,
           int salary, String kpi, String shoes, int goals) {
        Goals = goals;
        Age = age;
        Name = name;
        Surname = surname;
        Height = height;
        Salary = salary;
        KPI = kpi;
        Shoes = shoes;
    }

    public String getShoes()   { return Shoes;   }
    public int    getSalary()  { return Salary;  }
    public String getKPI()     { return KPI;     }
    public int    getHeight()  { return Height;  }
    public String getSurname() { return Surname; }
    public String getName()    { return Name;    }
    public int    getAge()     { return Age;     }
    public int    getId()      { return Id;      }
    public int    getGoals()   { return Goals;   }

    public void setShoes   (String shoes)   { Shoes = shoes;     }
    public void setSalary  (int salary)     { Salary = salary;   }
    public void setKPI     (String KPI)     { this.KPI = KPI;    }
    public void setHeight  (int height)     { Height = height;   }
    public void setName    (String name)    { Name = name;       }
    public void setSurname (String surname) { Surname = surname; }
    public void setAge     (int age)        { Age = age;         }
    public void setId      (int id)         { Id = id;           }
    public void setGoals   (int goals)      { Goals = goals;     }

    @Override
    public String toString() {
        return "Player{" +
            "Id=" + Id +
            ", Age=" + Age +
            ", Name='" + Name + '\'' +
            ", Surname='" + Surname + '\'' +
            ", Height=" + Height +
            ", Salary=" + Salary +
            ", KPI='" + KPI + '\'' +
            ", Shoes='" + Shoes + '\'' +
            ", Goals=" + Goals +
            '}';
    }
}
