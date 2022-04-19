public class DistanceStudent extends Student {
    public DistanceStudent( String name, int numID, String major, String courseTaken ) {
            super( name, numID, major, courseTaken );
       }
    
      public String getStudentType() {
           return "Distance Student";
      }
    
      public boolean equals( Object otherObject ) {
           if ( otherObject == null ) return false;
           if ( !(otherObject instanceof DistanceStudent ) )
                  return false;
           return super.equals( otherObject );
      }   
 }
