import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));
      
      String imie;
      int wiek,wybierz;
      int znak;
      int i=0;
      while(i==0){
      System.out.println("Aby dodać studenta do listy klknij 1");
      System.out.println("Aby wyświetlić liste studentów kliknij 2");
        System.out.println("Koniec programu, wybierz 3");
      Scanner wpisz = new Scanner(System.in);
      wybierz = wpisz.nextInt();
     

      switch(wybierz)
        {
          case 1:
            {
              System.out.println("Wpisz imie studenta");
              imie = wpisz.next();
              System.out.println("Podaj wiek studenta");
              wiek = wpisz.nextInt();
              s.addStudent(new Student(imie, wiek));
              break;
            }
          case 2:
            {
              var students = s.getStudents();
              for(Student current : students)
            System.out.println(current.ToString());
              break;
            }
          case 3:
            {
              i=1;
              break;
            }
          default:
            System.out.println("Nie ma takiego wyboru");
        }
        }
    } catch (IOException e) {

    }
  }
}