public class Lark {
  String Name;
  String Fly;
  String  Sing;
  int Age;

 public Lark (String Name,String Fly,String Sing,int Age){
     this.Name=Name;
     this.Fly=Fly;
     this.Sing=Sing;
     if (Age<0)
         this.Age=0;
     else
         this.Age=Age;

 }
 public void Fly (){
     System.out.println("Улетает на юг");
 }
 public  void Sing(){
     System.out.println("Чрик-чрик-чрик");

 }

}
