package principal;
public class Reto {
   public static void main(String[] args) {
   	//Metemos las 2 variables, mes y dias
      int mes = 5;
      int numDias = 0;
      
       //Si el mes es febrero
      if (mes == 2)
           numDias = 28;
      
       //Si el mes es abril, junio, septiembre o noviembre
       if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
           numDias = 30;
      
       //Si el mes es enero, marzo, mayo, julio, agosto, octubre o diciembre
       if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
           numDias = 31;
      
       System.out.println(numDias);
   }
}
