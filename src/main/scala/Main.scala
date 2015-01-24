class Main{
/* Naloga 1. Množice.
 * Funkcije tipa Int => Boolean lahko gledamo tudi kot predstavitev množic. Pri tej nalogi morate zapisati nekaj funkcij, ki omogočajo delo s tako predstavitvijo množic.
 */

  type Set = Int => Boolean

  // Zapiši funkcijo, ki za podano število vrne množico, ki vsebuje samo to število.
  def singleton(n:Int): Set = ???


  //  Zapišite funkcijo, ki iz dveh množic zgradi njuno unijo.
  def union(s1:Set, s2:Set): Set = ???

  //  Zapišite funkcijo, ki iz dveh množic zgradi njun presek.
  def intersect(s1:Set, s2:Set): Set = ???

  //  Zapišite funkcijo, ki iz podanih števil a in b (a<b) zgradi funkcijo, ki vsebuje vsa cela števila na intervalu [a,b].
  def interval(a:Int, b:Int): Set = ???

  //???  Zapišite funkcijo, ki iz podanega seznama odstrani vse duplikate. Uporabite množice definirane zgoraj.
  def dedup(l: List[Int]): List[Int] = ???


  /* Naloga 2. Pravokotniki.
   * Pravokotnik v ravnini (s celoštevilskimi koordinatami) lahko predstavimo z dvema množicama (za vsako predpostavimo, da vsebuje en interval).
   *
   */

  type Rectangle = (Set, Set)

  def createRectangle(x1:Int, y1:Int, x2:Int, y2:Int ):Rectangle = ???

  def contains(x:Int, y:Int, r:Rectangle):Boolean = ???

  def intersect(r1:Rectangle, r2:Rectangle):Rectangle = ???




 /* Naloga 3. Funkcije realne spremenljivke
  */
  type RealFunc = Double => Double

  val eps = 0.00001
  //kompozitum dveh funkcij
  def compose(f1:RealFunc, f2:RealFunc):RealFunc = ???

  //vsota dveh funkcij
  def sum(f1:RealFunc, f2:RealFunc):RealFunc = ???

  //produkt dveh funkcij
  def mult(f1:RealFunc, f2:RealFunc):RealFunc = ???

  //odvod funkcije - naredite to numerično
  def derive(f:RealFunc):RealFunc = ???




 /* Naloga 4. Kodiranje
  *  Vsako funkcijo Char=>Char si lahko predstavljamo kot šifrirno funkcijo. Napišite nekaj funkcij za delo s takimi šifrirnimi funkcijami.
  */
    type Coder = Char=>Char
    //Podani niz zašifrirajte s podano funkcijo
    def encode(s:String, f:Coder):String = ???

    //Za podano šifrirno funkcijo ugotovite, če je bijektivna
    def isBijective(f:Coder):Boolean = ???

    //Za podano šifrirno funkcijo vrnite njen inverz
    def inverse(f:Coder):Coder = ???

    //Podani niz, ki je bil zakodiran s podano šifrirno funkcijo, odšifrirajte
    def decode(s:String, f:Coder):String = ???

}
