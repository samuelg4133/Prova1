public class Teste {
    
   public static void main(String []args){
   
   Diretor d1 = new Diretor();
   
   d1.nome="Quentin Tarantino";
   Data dd= new Data();
   
   dd.dia=29;
   dd.mes=5;
   dd.ano=1999;
   d1.dataDeNascimento=dd;
   
   Filme f1 = new Filme();
   Data d2 = new Data();
   d2.dia=2;
   d2.mes=12;
   d2.ano=2010;
   f1.dataLancamento=d2;
   f1.diretor=d1;
  
   d1.mostrar();
   f1.mostrar();
   f1.informarGenero("Comédia");
   } 
}
