
public class P0204Operadores {

    public static void main(String[] args) {
        int x = 15, y = 19;
        int soma = x + y;
        int sub = x - 10;
        int mul = y * 68;
        int divInteira = y / 2;
        double div = (64 * x - 12 * y) / 5.4321;
        int resto = y % 5;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(divInteira);
        System.out.println(div);
        System.out.println(resto);

        /*
           Operadores aritméticos:
           
           + | soma | a + b
           - | subtração | a - b
           * | multiplicação | a * b
           / | divisão | a / b
           % | resto da divisão | a % b
           ++ | incremento unitário | ++a ou a++
           -- | decremento unitário | --a ou a--

           Promoção de tipos:

           byte -> short -> int -> long -> float -> double
         */

         double k = 1.5, m = -1.9;
         boolean res0 = k == m;
         boolean res1 = k >= m;
         boolean res2 = k < m;
         boolean res3 = k != m;

        System.out.println(res0);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        /*
           Operadores relacionais:
           
            == | igual | a == b
            != | diferente | a != b
            > | maior | a > b
            >= | maior ou igual | a >= b
            < | menor | a < b
            <= | menor ou igual | a <= b
         */

        int n = 2, o = 3;
        boolean res4 = (n>0) && (o<0);
        boolean res5 = (n==o) || (o>0);
        boolean res6 = !res5;

        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);

        /*
           Operadores lógicos:
           
            && | e (and)| a && b
            || | ou (or)| a || b
            ! | não (not)| !a
            ^ | ou exclusivo (xor) | a ^ b
         */

      int a = 0;
      int b = 5;

      // a = a-b;
      a -= b;

      // b = b+10
      b += 10;

      System.out.println(a);
      System.out.println(b);
 
      /*
      Operadores de atribuição composta

      += | adição e atribuição | a += b
      -= |  subtração e atribuição | a -= b
      *= |  multiplicação e atribuição | a *= b
      /= |  divisão e atribuição | a /= b
      %= |  Divisão inteira e atribuição | a %= b
      &= |  E bitwise e atribuição | a &= b
      |= |  Ou bitwise e atribuição | a |= b
      ^= |  Ou-exclusivo e atribuição | a ^= b
      >>= |  Rotação à direita e atribuição | a >>= b
      <<= |  Rotação à esquerda e atribuição | a <<= b
      >>>= |  Rotação à direita sem sinal e atribuição | a >>>= b
       */

       int c = 10, d = 12;
       int e = d<c ? c : d;
       System.out.println(e);

       /*
        Operador ternário

        condição ? valorTrue : valorFalse
        */

      byte g= 0x1F, f = 0x10; 
      System.out.println("Valores g="+ g+", f =" + f);
      System.out.println(" g & f ="+(g & f)); 
      System.out.println(" g I f ="+(g | f));
      System.out.println(" g g f ="+(g ^ f));
      System.out.println(" ~ f =" + (~ f));
      System.out.println(" g<< 2 ="+(g<< 2));
      System.out.println(" -g>> 4 ="+(-g>> 4));
      System.out.println(" -g>>> 4 ="+(-g>>> 4));

      /*
      Operadores Bitwise

      & |  E bitwise | a & b
      | |  Ou bitwise | a | b
      ^ |  Ou-exclusivo bitwise | a ^ b
      ~ | Complemento de 2 | ~ a
      >> |  Rotação à direita | a >> b
      << |  Rotação à esquerda | a << b
      >>> |  Rotação à direita sem sinal | a >>> b
       */
    }
}
