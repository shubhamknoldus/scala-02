package edu.knoldus.util

import java.text.SimpleDateFormat
import java.util.Date

object Utils {

  val DATE_FORMATTER = new SimpleDateFormat("dd-MM-yyyy")

  def add(x: Int, y: Int): Int = x + y

  def dateForTimestamp(timestamp: Long): String = {
    DATE_FORMATTER.format(new Date(timestamp))
  }

}
