package com.ru.waka

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.{JSExportAll, JSExport}

@JSExportAll
object Hoge extends JSApp {
  def ping(): String = "pong"

  @JSExport
  override def main(): Unit = println("hoge")
}


