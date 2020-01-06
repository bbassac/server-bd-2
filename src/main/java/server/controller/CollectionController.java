package server.controller;

import org.springframework.web.bind.annotation.*;
import server.bean.Bd;

import java.util.List;

@RestController
@RequestMapping("/collection")
public class CollectionController extends AbstractController{


    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Bd> getCollections() {

        return customRepo.getCollection();
    }
}