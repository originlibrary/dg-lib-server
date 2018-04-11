package digital.controller;

import digital.dto.Result;
import digital.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 创建自: Sober 时间: 2018/4/7.
 */
@RestController
@RequestMapping("/Book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/getBookStrap", method = RequestMethod.POST)
    public Result getBookStrap(@RequestBody Map<String, String> map) {
        Result result = new Result();
        result.setCode(200);
        result.setData(bookService.getBookStrap());
        return result;
    }

    @RequestMapping(value = "/getBookByType", method = RequestMethod.POST)
    public Result getBookByType(@RequestBody Map<String, String> map) {
        Result result = new Result();
        result.setCode(200);
        result.setData(bookService.getBookByType(map.get("type"), map.get("name"), map.get("author")));
        return result;
    }

    @RequestMapping(value = "/getDownloadTopFive", method = RequestMethod.POST)
    public Result getDownloadTopFive(@RequestBody Map<String, String> map) {
        Result result = new Result();
        result.setCode(200);
        result.setData(bookService.getDownloadTopFive());
        return result;
    }

    @RequestMapping(value = "/getScoreTopFive", method = RequestMethod.POST)
    public Result getScoreTopFive(@RequestBody Map<String, String> map) {
        Result result = new Result();
        result.setCode(200);
        result.setData(bookService.getScoreTopFive());
        return result;
    }

    @RequestMapping(value = "/getRecommendTop", method = RequestMethod.POST)
    public Result getRecommendTop(@RequestBody Map<String, String> map) {
        Result result = new Result();
        result.setCode(200);
        result.setData(bookService.getRecommendTop());
        return result;
    }

    @RequestMapping(value = "/deleteBook", method = RequestMethod.POST)
    public Result deleteBook(@RequestBody Map<String, String> map) {
        Result result = new Result();
        bookService.deleteBook(map.get("id"));
        result.setCode(200);
        return result;
    }

    @RequestMapping(value = "/uploadBook", method = RequestMethod.POST)
    public Result uploadBook(@RequestBody Map<String, String> map) {
        Result result = new Result();
        bookService.uploadBook(map);
        result.setCode(200);
        return result;
    }

    @RequestMapping(value = "/updateBook", method = RequestMethod.POST)
    public Result updateBook(@RequestBody Map<String, String> map) {
        Result result = new Result();
        bookService.updateBook(map);
        result.setCode(200);
        return result;
    }

    @RequestMapping(value = "/getBookDetailsById", method = RequestMethod.POST)
    public Result getBookDetailsById(@RequestBody Map<String, String> map) {
        Result result = new Result();
        result.setCode(200);
        result.setData(bookService.getBookDetailsById(map.get("id")));
        return result;
    }

    @RequestMapping(value = "/getTopFiveByType", method = RequestMethod.POST)
    public Result getTopFiveByType(@RequestBody Map<String, String> map) {
        Result result = new Result();
        result.setCode(200);
        result.setData(bookService.getTopFiveByType(map.get("type")));
        return result;
    }
}
