// draw a blueprint of oracle in which a constructor , a method, an object
public class  Oracle{
public static void main(String args[]){
int a=10/0;
System.out.println(a);
Oracle obj1=new Oracle();
System.out.println(obj1);
Oracle Sat1= new Oracle();
Oracle Sat2 = new Oracle();
//System.out.println(Sat1+" "+ Sat2);

}
Oracle(){
System.out.println("AB");
}
}