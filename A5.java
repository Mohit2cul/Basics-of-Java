class Students {
    String name;
    static String college;
    // without static wale variable ko static function ke andar access nahi kar sakte hai
    void f1(){
        System.out.println(name);
        System.out.println(college);
    }
    //static function keval static value hi access kar sakta hai
    static void f2(){
        // System.out.println(name);
        System.out.println(college);
    }
}
class A5{
    public static void main(String[] args) {
        // Students.name="Ankit";
        Students.college="IIT Kanpur";
        // Students.f1(); 
        Students.f2();
        System.out.println();
        Students s1,s2,s3; //creating reference variable
        s1 = new Students(); //creating object of class
        s2 = new Students(); //creating object of class
        s3 = new Students(); //creating object of class
        s1.name = "Ankit";
        s2.name = "Amit";
        s3.name = "Amitabh";
        s1.f1(); //calling non static method using object
        s2.f1(); //calling non static method using object
        s3.f1(); //calling non static method using object
        s1.name = "Ankit Kumar";//changing value of non static variable using object
        s1.college = "Bcet";//changing value of static variable using object
        System.out.println();
        System.out.println(s1.name); //Ankit Kumar
        System.out.println(s1.college); //Bcet
        System.out.println(s2.name); //Amit
        System.out.println(s2.college); //Bcet
        System.out.println(s3.name); //Amitabh
        System.out.println(s3.college); //Bcet

    }
}