import java.util.HashMap;
import java.util.Map;

public class CarroHashmap {

   public static void main(String[] args) {
      Carro carro1 = new Carro("Fiat Uno Mille", "Preto", 0001);

      Carro carro2 = new Carro("Peujeot 207 Passion", "Prata", 0002);

      Carro carro3 = new Carro("Honda Civic", "Branco", 0003);

      Map<Integer, Carro> mapa = new HashMap<>();
      mapa.put(carro1.getIdModelo(), carro1);
      mapa.put(carro2.getIdModelo(), carro2);
      mapa.put(carro3.getIdModelo(), carro3);

      for (Map.Entry<Integer, Carro> elemento : mapa.entrySet()) {
         System.out.println(
               elemento.getKey() + " - " + elemento.getValue().getModelo() + " - " + elemento.getValue().getCor());

      }

   }

}
