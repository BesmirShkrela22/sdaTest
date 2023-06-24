import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      Student studenti1=new Student("Besmir","Shkrela",35) ;
      Student studenti2=new Student("Erald","Nuhaj",34) ;
      Student studenti3=new Student("Martin","Lamaj",34) ;

   int[]notatStudenti1={6,7,8,9};
   int[]notatStudenti2={7,8,10,10};
   int[]notatStudenti3={7,7,9,9};






        System.out.println("mesatarja e studentit"+" "+studenti1.getName()+" "+studenti1.getSurname()+" "+ Arrays.stream((notatStudenti1)).average());
        System.out.println("mesatarja e studentit"+" "+studenti2.getName()+" "+studenti2.getSurname()+" "+ Arrays.stream((notatStudenti2)).average());
        System.out.println("mesatarja e studentit"+" "+studenti3.getName()+" "+studenti3.getSurname()+" "+ Arrays.stream((notatStudenti3)).average());

    }


}