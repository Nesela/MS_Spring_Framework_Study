package backend.spring.springmvc01.controller;

import backend.spring.springmvc01.model.dto.BoardDto;
import backend.spring.springmvc01.service.BoardBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BoardController {

    private final BoardBiz biz;

    @Autowired
    public BoardController(BoardBiz biz) {
        this.biz = biz;
    }

    @RequestMapping("/List.do")
    public String list(Model model) {
        model.addAttribute("list", biz.findAll());
        return "list";
    }

    @RequestMapping("/insertform.do")
    public String insertForm() {
        return "insert";
    }

    @RequestMapping("/insertres.do")
    public String insertRes(@RequestParam("writer") String writer,
                            @RequestParam("title") String title,
                            @RequestParam("content") String content) {
        int res = biz.insert(new BoardDto(writer, title, content));
        if (res > 0) {
            return "redirect:list.do";
        } else {
            return "redirect:insertform.do";
        }
    }

    @RequestMapping("/detail.do")
    public String detail(Model model, @RequestParam("id") int id) {
        IO.println(id);
        model.addAttribute("dto", biz.findById(id));

        return "detail";
    }

    @RequestMapping("/updateform.do")
    public String updateForm(Model model, @RequestParam("id") int id) {
        model.addAttribute("dto", biz.findById(id));

        return "update";
    }

    @RequestMapping("/updateres.do")
    public String updateRes(BoardDto dto) {
        int res = biz.update(dto);
        if (res > 0) {
            return "redirect:detail.do?id=" + dto.id();
        } else {
            return "redirect:updateform.do?id=" + dto.id();
        }
    }

    @RequestMapping("/delete.do")
    public String delete(@RequestParam("id") int id) {
        int res = biz.delete(id);
        if (res > 0) {
            return "redirect:list.do";
        } else {
            return "redirect:detail.do?id=" + id;
        }
    }
}

