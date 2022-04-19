public class Student extends Person {
           private String major;
       private String courseTaken;
      
       public Student(String name, int numID,
                 String major, String courseTaken) {
           super( name, numID );
               this.major = major;
             this.courseTaken = courseTaken;
         }
    
          public void setCourseTaken(String courseTaken) {
               this.courseTaken = courseTaken;
          }
         
          public String getStudentType() {
                       return "Distance Student";
                  }

          public boolean equals( Object otherObject ) {
               if ( otherObject == null ) return false;
               if ( !(otherObject instanceof Student) ) return false;
               Student otherStudent = (Student)otherObject;
               return super.equals( otherObject ) &&
                  this.major.equals(otherStudent.major) &&
                  this.courseTaken.equals(otherStudent.courseTaken);
          }
         
     }