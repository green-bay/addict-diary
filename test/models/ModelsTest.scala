package models

import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

@RunWith(classOf[JUnitRunner])
class ModelsTest extends Specification {
  "Application" should {

	  "createAndRetrieveUser" in new WithApplication{
	  User.create(new User("bob@bob.com","Bob Bob","Bob"))
	  val bob = User.findByEmail("bob@bob.com") match {
	    case b @ User(_,_,_) => b.password
	    case _ =>	    
	  }
	  	  
    }    
  }
}