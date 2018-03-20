/**...*/
public class MyFirstClass {

//psv sukurti greit main metoda
    public static void main(String[] args) {

        //sout greit sukurti
        System.out.println("Hello world" );

        int a = 10;

        //sukurtas objektas
        MyFirstClass myFirstClass = new MyFirstClass();

        //ne statinis kvieciamas per klases objekta
        myFirstClass.myNotStaticMethod(a);

        //tiesiai per varda toje pacioje klaseje
        myStaticMethod();

        float b = 4.6f;
        double c = 2.4;

        boolean d = true;//false

        char e = 'A';
        String f = "This is String!!!";

    }

    private void myNotStaticMethod(int numb) {
        System.out.println( "Jusu skaicius" + numb);

    }

    private  static void myStaticMethod() {
        System.out.println("Cia yra statinis metodas");
    }

}


// git komandos
//git init
//git add .
//git commit -m "tekstas"
//git remote add origin https://github.com/ZemaitaitisEgidijus/1-3_class-work-20.03.git 
// bla bla lba bandymas
