public class Pessoa {
   // Atributos
   private String nome;
   private Integer idade;

   // Getters e Setters

   public void setNome(String nome) {
      // Aqui podem ter validações e outros.
      this.nome = nome;

   }

   public String getNome() {
      return this.nome;
   }

   public void setIdade(Integer idade) {
      this.idade = idade;
   }

   public Integer getIdade() {
      return this.idade;
   }

}


