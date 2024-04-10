public class oops {
    static String students;
    static float fees;
    static void(String n,float p){
        student=n;
        fees=p;
    }
    static void get(){
        System.out.println("The student name is"+student);
        System.out.println("Fees"+fees);
    }
    public static void main(string args[]){
        oops.set("aviral musk",1999999);
        oops.get();
    }
}


//More bigger code for understanding the oops
public class Sum { 
  
    // Overloaded sum(). 
    // This sum takes two int parameters 
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
  
    // Overloaded sum(). 
    // This sum takes three int parameters 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  
    // Overloaded sum(). 
    // This sum takes two double parameters 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        System.out.println(s.sum(10, 20)); 
        System.out.println(s.sum(10, 20, 30)); 
        System.out.println(s.sum(10.5, 20.5)); 
    } 
} 