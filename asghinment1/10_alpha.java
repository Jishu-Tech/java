class alpha
{
 void abc()
 { 
   System.out.println("The small letter alphebat is");
   for(char i='a';i<='z';i++)
   {
     System.out.print(i+" ");
   }
   System.out.println("\nThe capital letter alphebat is");
   for(char j='A';j<='Z';j++)
   {
     System.out.print(j+" ");
   }

  }
};
class alphebat
{
 public static void main(String[] args)
 {
   alpha obj=new alpha();
   obj.abc();
  }
};
