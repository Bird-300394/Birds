public class Lark {
  String Name;
  String Fly;
  int Age;

 public Lark (String Name,String Fly,int Age){
     this.Name=Name;
     this.Fly=Fly;
     if (Age<0)
         this.Age=0;
     else
         this.Age=Age;

 }
}
