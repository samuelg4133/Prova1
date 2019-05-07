public class Filme {
    
    Data dataLancamento;
    Diretor diretor;
    String genero;
    
    void mostrar(){
    
    System.out.println(this.genero);
    this.diretor.mostrar();
    this.dataLancamento.mostrar();
        
    }
    
    boolean informarGenero(String gen){
    
    this.genero=gen;
    
    if(gen=="Terror"||gen=="Romance"||gen=="Ação")
        return true;
    else
        return false;
    }
}
