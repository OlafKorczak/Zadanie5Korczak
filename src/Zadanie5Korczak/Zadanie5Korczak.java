package Zadanie5Korczak;

import java.math.BigDecimal;

public class Zadanie5Korczak {
    public static void main(String[] args) {
        double cenaNettoKorczak = 9.99D;
        double cenaBruttoKorczak = cenaNettoKorczak+(cenaNettoKorczak*0.23D);
        double cenaOgolnaBrutto = cenaBruttoKorczak * 10000D;
        System.out.printf("Cena brutto tych produktów to: %.2f %n",cenaOgolnaBrutto);
        double cenaOgolnaNetto = cenaOgolnaBrutto*0.87D;
        System.out.println("Cena netto tych produktów to: "+cenaOgolnaNetto);

        BigDecimal cenaNettoKorczakBigDecimal = new BigDecimal("9.99");
        BigDecimal cenaBruttoKorczakBigDecimal = cenaNettoKorczakBigDecimal.multiply(new BigDecimal("1.23"));

        BigDecimal cenaOgolnaBruttoBigDecimal = cenaBruttoKorczakBigDecimal.multiply(new BigDecimal("10000"));
        System.out.printf("Cena brutto tych produktów to: %.2f %n",cenaOgolnaBruttoBigDecimal);
        BigDecimal cenaOgolnaNettoBigDecimal = cenaOgolnaBruttoBigDecimal.multiply(new BigDecimal("0.87"));
        System.out.println("Cena netto tych produktów to: "+cenaOgolnaNettoBigDecimal);


    }
}
