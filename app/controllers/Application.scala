package controllers

import play.api._
import play.api.mvc._
import services.TestService

class Application(service: TestService) extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

}