/*
rule = Unused
 */
package fix.example
package eta

class EtaExpansion {
  Some(1).map(identity)
  List(1).foldLeft("")(_ + _)

  def prop = ""
  def meth() = ""

  prop _
  meth _
}
