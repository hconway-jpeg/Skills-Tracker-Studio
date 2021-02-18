package org.launchcode.skillztracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="/")
    public String welcomePage() {
        String html1 =
                "<html>" +
                        "<body>" +
                            "<h1>Skillz Tracker</h1>" +
                                "<h2>Language Selection: </h2>" +
                                    "<ol>" +
                                        "<li>Java</li>" +
                                        "<li>JavaScript</li>" +
                                        "<li>Python</li>" +
                                    "</ol>" +
                        "</body>" +
                "</html>";
        return html1;
    }

    @GetMapping("form")
    public String userForm() {
        String html2 =
                "<html>" +
                        "<body>" +
                            "<form method='post' action='form'>" +
                            "Name: <br>" +
                                "<input type='text' name='user'/>" +
                            "<br>" +
                                "<select name='firstChoice'>" +
                                    "<option value=''>First Choice</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                            "<br>" +
                                "<select name='secondChoice'>" +
                                    "<option value=''>Second Choice</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                            "<br>" +
                                "<select name='thirdChoice'>" +
                                    "<option value=''>Third Choice</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                            "<br>" +
                            "<input type='submit' value='Submit!'/>" +
                            "</form>" +
                        "</body>" +
                "</html>";
        return html2;
    }

    @PostMapping("form")
    public String userData(@RequestParam String user, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html3 =
            "<html>" +
                "<body>" +
                    "<h1>" + user + "</h1>" +
                        "<ol>" +
                            "<li>" + firstChoice + "</li>" +
                            "<li>" + secondChoice + "</li>" +
                            "<li>" + thirdChoice + "</li>" +
                        "</ol>" +
                "</body>" +
            "</html>";
        return html3;
    }

}