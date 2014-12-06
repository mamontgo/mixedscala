package com.monty.scala
/**
 * Utility scala functions for demonstration purposes
 */
import com.monty.java.PersonBean;
import scala.collection.JavaConverters._

object Core {

  /**
   *
   */
  def filterGt(a: Double, b: java.util.List[PersonBean]): java.util.List[PersonBean] = {
    Util.fold[PersonBean, List[PersonBean]](b.asScala.toList,
      (p: PersonBean, l: List[PersonBean]) => {
        if (p.getAmount().doubleValue() > a) p :: l
        else l
      }, List[PersonBean]()).asJava
  }

  def sum(x: java.util.List[PersonBean]): Double = {
    Util.fold[PersonBean, Double](x.asScala.toList,
      (p: PersonBean, a: Double) => a + p.getAmount().doubleValue(), 0)
  }

  def incPerc(a: java.lang.Double, b: java.util.List[PersonBean]): java.util.List[PersonBean] = {
    Util.map(b.asScala.toList, (x: PersonBean) => {
      val newamount: Double = x.getAmount().doubleValue() + (x.getAmount().doubleValue() * a.doubleValue())
      x.setAmount(newamount)
      x
    }).asJava
  }

  def print[T](x: java.util.List[T]): Unit = {
    x.asScala.toList.foreach(println)
  }

}