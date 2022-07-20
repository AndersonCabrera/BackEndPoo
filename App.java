public class App {

   public static void main(String[] args) {

      System.out.println("Aprendendo POO com Java");

      // Instanciando uma classe, construindo um objeto.

      Pessoa pessoa1 = new Pessoa();
      pessoa1.setNome("Fulano");
      pessoa1.setIdade(21);

      System.out.println(pessoa1.getNome());
      System.out.println(pessoa1.getIdade());

      Pessoa pessoa2 = new Pessoa();
      pessoa2.setNome("Ciclano");
      pessoa2.setIdade(25);

      System.out.println(pessoa2.getNome());
      System.out.println(pessoa2.getIdade());

      Carro carro1 = new Carro();
      carro1.setModelo("Civic");
      carro1.setCor("Preto");
      carro1.setAno(2021);

      System.out.println(carro1.getModelo());
      System.out.println(carro1.getCor());
      System.out.println(carro1.getAno());

   }
}
