package employee;

public class employee {
    String name;
    int age;
    float salary;
    int experiance;

    void add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of employee ");
        String name = sc.nextLine();
        System.out.println("enter age of employee ");
        age = sc.nextInt();
        System.out.println("salary");
         salary = sc.nextFloat();
        System.out.println("enter experiance");
         experiance = sc.nextInt();

    }
void display ()
{
System.out.println(name);
System.out.println(age);
System.out.println(salary);
System.out.println(experiance);

}
void calculate()
{
String pramote,nexttime,pramotion ;
pramotion = experiance > 2 ? " pramote" : "nexttime";
System.out.println(pramotion);
}



}

    public static void main(String[] args) {
employee e =new employee();
e.add();
e.display();
e.calculate();


}
}

