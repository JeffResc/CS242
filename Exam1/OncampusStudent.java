public class OncampusStudent extends Student {

          public OncampusStudent( String name, int numID,
                     String major, String courseTaken ) {
                super( name, numID, major, courseTaken );
           }
         
         public String getStudentType() {
              return "Oncampus Student";
          }
             
          public boolean equals( Object otherObject ) {
               if ( otherObject == null ) return false;
               if ( !(otherObject instanceof OncampusStudent) )
                       return false;
               return super.equals( otherObject );
          }
     } 
