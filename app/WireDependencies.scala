import com.softwaremill.macwire.MacwireMacros._
import controllers.Application
import services.TestService


trait WireDependencies {
  import com.softwaremill.macwire.MacwireMacros._

  lazy val service = wire[TestService]
  lazy val controller   = wire[Application]
}
