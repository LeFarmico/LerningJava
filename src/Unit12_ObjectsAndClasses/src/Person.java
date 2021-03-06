public class Person {
    private String name;
    private String familyName;
    private int age;

    public Person(String name, String familyName, int age){
        this.name = name;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
