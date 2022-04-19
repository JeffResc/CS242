public abstract class Person {
    private String name; // person's name     
    private int numID; // person's ID number
    public Person(String name, int numID) {
        this.name = name;
        this.numID = numID;
    }
    public abstract String getStudentType();
    public boolean equals( Object otherObject ) {
        if ( otherObject == null ) return false;
        if ( !(otherObject instanceof Person) ) return false;
        Person otherPerson = (Person)otherObject;
        return otherPerson.name.equals(this.name) &&
                otherPerson.numID == this.numID;
    }
}