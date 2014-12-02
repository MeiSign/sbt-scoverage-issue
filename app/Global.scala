import com.softwaremill.macwire.Macwire
import com.softwaremill.macwire.MacwireMacros
import play.api.GlobalSettings

object Global extends GlobalSettings with Macwire {
  import MacwireMacros._
  lazy val wired = wiredInModule(new WireDependencies {})

  override def getControllerInstance[A](controllerClass: Class[A]): A = {
    wired.lookupSingleOrThrow(controllerClass)
  }
}
