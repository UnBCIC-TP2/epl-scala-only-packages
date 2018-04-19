import br.unb.cic.epl._
//import br.unb.cic.epl.Eval
//import br.unb.cic.epl.Add
//import br.unb.cic.epl.AddEval
//
object Main extends App {
  val lit100 = new Literal(100) with Eval.Literal
  val lit500 = new Literal(500) with Eval.Literal

  val sum = new Add(lit100, lit500) 

  println(sum.print())
  println(lit100.eval())
}
