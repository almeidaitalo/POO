package Exercicios;

public class QuestaoDesafio {
	public static void main(String[] args) {
		String s1="Brasil",s2="";
		
		s2=geraString(s1, s2, 0);
		System.out.println(s2); 
	}
   public static String geraString(String s1, String s2, int cont) {
   if(cont==s1.length())
		   return s2;
   
   String vogal="aeiou";
   char c=s1.charAt(s1.length()-cont-1);
   if(vogal.indexOf(c)< 0)
	   s2+=Character.toString(c);
   else
	   s2+=".";
   cont++;
   return geraString(s1,s2,cont);
}
   //Resposta: l.s.rB
}

