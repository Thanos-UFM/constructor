class demo{
      int  value1;
      int  value2;
      public demo(){
         value1 = 10;
         value2 = 20;
         System.out.println("Inside Constructor");
     }
 
     public void display(){
        System.out.println("Value1 === "+value1);
        System.out.println("Value2 === "+value2);
    }
 
   public static void main(String args[]){
       demo d1 = new demo();
      d1.display();
  }
}