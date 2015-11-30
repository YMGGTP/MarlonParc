import java.util.ArrayList;

class ArrayListExemple {

public static void main(String[] args){

 ArrayList<String> liste = new ArrayList<String>();

 liste.add("un");

 liste.add("deux");

 for(String v : liste) {

 System.out.print(v + " ");

 }

 System.out.println(liste.get(1));

 liste.set(0, "premier");

}

}