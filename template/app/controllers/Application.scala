package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready (running on Play " + play.core.PlayVersion.current + " )"))
  }

}
