package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import values.SimpleInterest;

@Controller
public class SimpleInterestController {
	@RequestMapping(value = "/si", method = RequestMethod.GET)
    public ModelAndView siload() {
      return new ModelAndView("form", "command", new SimpleInterest());
     }
  @RequestMapping(value = "/silogic", method = RequestMethod.POST)
    public ModelAndView silogic(@ModelAttribute("SpringWeb")SimpleInterest s, ModelMap model) {
       model.addAttribute("p", s.getPrincipal());
       model.addAttribute("r", s.getRate());
       model.addAttribute("t", s.getTime());
       float s1 = (s.getPrincipal()*s.getRate()*s.getTime())/100;
       return new ModelAndView("result","res",s1);
     }
}
