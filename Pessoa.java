public class Pessoa {
   // Atributos
   private String nome;
   private Integer idade;

   /**
    * 
    * Tipos de Numeros
    * Byte tipoByte = 127;
    * Short tipoShort = 32767;
    * Integer tipoInteger = 2147483647;
    * Long tipoLong = 9223372036854775807L;
    * Float tipoFloat = 2.8F;
    * Double tipDouble = 4.89;
    */

   /**
    * String tipoString = "Sou um texto";
    * char tipoChar = 'S';
    * boolean tipoBoolean = false ou true;
    * 
    * @param nome
    */

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

/**
 * Mátodos acessores:
 * 
 * PUBLIC: Indicar que qualquer um pode acessar o elemento (classe, atributo ou
 * método).
 * PRIVATE: Indica que sómente a classe consegue acessar.
 * PROTECTED: Indica que somente a classe e seus filhos consegue acessar.
 * DEFAULT:Indica que somente a classe, seus filhos e asclasses no mesmo
 * package.
 * 
 * Getters e Setters
 * 
 * 
 */
