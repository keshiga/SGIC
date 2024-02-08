class simpleException {
    public static void main (String args[]) {
        int x = 5, y=3, z=2;
        int num, vg;
    try   {  
           num = x-y-z;
           vg = x/num; 
        } 
        catch (ArithmeticException e) {
            System.out.println("divide by zero : "+ e);
        }
        finally { System.out.print("This statement will always print");
    } }
    
}