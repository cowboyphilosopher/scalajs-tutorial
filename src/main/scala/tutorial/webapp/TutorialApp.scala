package tutorial.webapp

import org.scalajs.dom
import org.scalajs.dom.document
import io.f1r3fly.metta2rho.compiler._
import MeTTa2Rho._
import CompilerWorldState._
import StdMeTTalParserCaps._

object TutorialApp {
  def main(args: Array[String]): Unit = {
    document.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
      setupUI()
    })
  }

  def setupUI(): Unit = {
    val button = document.createElement("button")
    button.textContent = "Click me!"
    button.addEventListener("click", { (e: dom.MouseEvent) =>
      addClickedMessage()
    })
    document.body.appendChild(button)

    val msg = getConvertedMessage("[{(+ 5 1)},{},{},{}]")

    appendPar(document.body, msg)
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  def getConvertedMessage(msg: String): String = {
    //val res = MeTTa2Rho.ppSemantics(msg).toString() 
    val res = msg + "abc"
    return res
  }

  def addClickedMessage(): Unit = {
    //val res = MeTTa2Rho.ppSemantics("[{(+ 5 1)},{},{},{}]").toString() 
    //dom.console.log(res)
    appendPar(document.body, "You clicked the button")
  }
}
