import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        //double chance = rand.nextDouble(0.0,1.0);
        int chance = rand.nextInt(50) + 2;
        //                         ↟     ↟
        //                         |     segundo valor "inicial / apartir"
        //                         valor a gerar "limite" para o segundo valor
        // ** a partir de 2 ira gerar ate 50 numeros( 3,10,2,48 )
        
        
        System.out.println(chance);
        /*if(chance < 0.50)
        {
            System.out.println("Cara!");
        }else
        {
            System.out.println("Coroa!");
        }
        */
    }
}

