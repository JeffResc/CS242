public class TestHierarchy {
                 public static void main( String[] args ) {           
                        
                     OncampusStudent a1 = new OncampusStudent( "Dave Summers", 26623,
                          "Computer Science", "Programming Languages" );
                     DistanceStudent a2 = new DistanceStudent( "Dave Summers", 26623, 
                          "Computer Science", "Programming Languages" );
                     Student a3 = new DistanceStudent( "Dave Summers", 26623,
                          "Computer Science", "Programming Languages" );
                    Person a4 = new Student( "Dave Summers", 26623,
                         "Computer Science", "Programming Languages" );
                    DistanceStudent a6 = a2;
                    OncampusStudent a7 = new OncampusStudent( "Dave Summers", 26623,
                          "Computer Science", "Programming Languages" );
               
                    System.out.println( a2.equals(a3) );           
                      
                    a2.setCourseTaken("Automata Theory");
                    a1.setCourseTaken("Cryptography");
                      
                    System.out.println( a2.equals(a4) );
                    System.out.println( a6.equals(a2) );
                    System.out.println( a1.equals(a7) );
                    //(Believe it or not, duplicate entries have occurred at Clarkson)
                }
         }