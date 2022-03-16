package br.com.mariana.bootcamp.print;

public class Curriculo implements Documento{
    private String name;
    private int age;
    private String formation;
    private String skills;

    public Curriculo(String name, int age, String formation, String skills) {
        this.name = name;
        this.age = age;
        this.formation = formation;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFormation() {
        return formation;
    }

    public String getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "name= " + name + '\n' +
                " age= " + age + "\n" +
                " formation= " + formation + '\n' +
                " skills= " + skills + '\n' +
                '}';
    }


    @Override
    public void print(Documento o) {
        System.out.println(o.toString());
    }
}
