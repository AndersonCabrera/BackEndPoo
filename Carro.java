public class Carro {
   // #region Atributos
   private String modelo;
   private String cor;
   private Integer ano;
   // #endregion

   // #region Construtores
   public Carro() {
   }

   public Carro(String modelo, String cor, Integer ano) {
      this.modelo = modelo;
      this.cor = cor;
      this.ano = ano;

   }
   // #endregion

   // #region Getters e Setters

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public String getCor() {
      return cor;
   }

   public void setCor(String cor) {
      this.cor = cor;
   }

   public Integer getAno() {
      return ano;
   }

   public void setAno(Integer ano) {
      this.ano = ano;
   }
   // #endregion Getters e Setters

   public Integer getIdModelo() {
      return ano;

   }
}
