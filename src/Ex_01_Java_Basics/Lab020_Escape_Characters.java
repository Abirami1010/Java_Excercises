package Ex_01_Java_Basics;

public class Lab020_Escape_Characters {
    public static void main(String[] args) {

        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("JavaProgramming");
        System.out.println("Java\nProgramming");
        System.out.println("Java"+ new_line +"Programming");
        System.out.println("Java1"+ tab_line +"Programming2");
        System.out.println("Java"+ back_space +"Programming");

        System.out.println("-------");
        System.out.println("Java"+ carriage_return +"Programming"); //Deletes the words before


    }
}
