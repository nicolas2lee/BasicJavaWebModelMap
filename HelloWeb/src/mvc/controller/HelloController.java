package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/hello")
public class HelloController{
 
	
   @RequestMapping(value="/msg", method = RequestMethod.GET)
   public String printHello(ModelMap model, WebRequest request) {
      model.addAttribute("aa", "Hello Spring MVC Framework!");
      System.out.println(request.getParameter("test"));
      return "hello";
   }
   
   @RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
   public ModelAndView welcome(@PathVariable String name, WebRequest request) {
	  ModelAndView Welcome = new ModelAndView("welcome","message2",name);
      //model.addAttribute("message2", name);
      System.out.println(name);
     // return "welcome";
      return Welcome;
   }

}
