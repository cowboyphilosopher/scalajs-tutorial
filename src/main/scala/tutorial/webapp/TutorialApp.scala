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

    appendPar(document.body, "Hello World")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  def addClickedMessage(): Unit = {
    //MeTTa2Rho.ppSemantics("{5}").toString() 
    appendPar(document.body, "You clicked the button!")
  }
}
