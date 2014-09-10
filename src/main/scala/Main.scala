class Main{
  type Set = Int => Boolean
  // ------------ Naloga 1. ---------------
  // Zapiši funkcijo, ki za podano število vrne množico, ki vsebuje samo to število.
  def singleton(n:Int): Set = ???

  // ------------ Naloga 2. ---------------
  //  Zapišite funkcijo, ki iz dveh množic zgradi unijo le teh
  def union(s1:Set, s2:Set): Set = ???

  // ------------ Naloga 3. ---------------
  //  Zapišite funkcijo, ki iz dveh množic zgradi presek le teh
  def intersect(s1:Set, s2:Set): Set = ???


   // ------------ Naloga 4. ---------------
  //  Zapišite funkcijo, ki iz podanih števil a in b (a<b) zgradi funkcijo, ki vsebuje vsa cela števila na intervalu [a,b].
  def interval(a:Int, b:Int): Set = ???

  // ------------ Naloga 5. ---------------
  //  Zapišite funkcijo, ki iz podanega seznama odstrani vse duplikate. Uporabite množice definirane zgoraj.
  def dedup(l: List[Int]): List[Int] = ???

  // ------------ Naloga 6. ---------------
  // Podani so pravokotniki, vrni pravokotnik, ki je presek vseh ostalih.
  // Uporabi zgoraj definirane funkcije...
  
  type Rectangle = (Set, Set)

  def createRectangle(x1:Int, y1:Int, x2:Int, y2:Int ):Rectangle = ???

  def contains(x:Int, y:Int, r:Rectangle):Boolean = ???

  def intersect(r1:Rectangle, r2:Rectangle):Rectangle = ???



  type RealFunc = Double => Double

  val eps = 0.00001
  def derive(f:RealFunc):RealFunc = ???

  def integrate(f:RealFunc):RealFunc = ???


    //Kodiranje
    type Coder = Char=>Char
    def encode(s:String, f:Coder):String = ???

    def isBijective(f:Coder):Boolean = ???

    def inverse(f:Coder):Coder = ???

    def decode(s:String, f:Coder) = ???

}
