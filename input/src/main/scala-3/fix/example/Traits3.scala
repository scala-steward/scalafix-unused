/*
rule = Unused
*/
package fix.example

package traits3

trait T {
  def x = 2
}

sealed trait U
object U {
  def u: U = new U {}
}

class C
trait V { self: C =>
}

trait W(param: Int) {
  def x = 1
}
