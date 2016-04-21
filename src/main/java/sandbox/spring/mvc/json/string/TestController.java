package sandbox.spring.mvc.json.string;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class TestController {

	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value = "/test/1", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String child_kensaku(@RequestBody String inputdata, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, SessionStatus sessionstatus)
					throws IllegalArgumentException, IllegalAccessException, ParseException, JsonProcessingException {
		log.info(inputdata);
		return "{ \"name\":\"日本語\"}";
	}
}
